// Workflow
//  1. Path Extraction CodeString -> Paths: List[(String, Int)], (no code branch after extraction)
//  2. Recursive Elimination
//  3. Path Flattening Paths: String (path str) -> List[(String, Int)]
//  4. Constant Propagation
//  4a: Add intermediate 
//  5. Path constraint Backward Inference -> Paths: List[(String, Int)]
//  6. Assertion Error Message Insertion during path saving

/* 
Key function:
    - traverse: Statement (top node of function body) -> Paths
        Traverse the given statement and extract paths from it.
 */
import com.github.javaparser.StaticJavaParser
import com.github.javaparser.symbolsolver.JavaSymbolSolver
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.body._
import com.github.javaparser.ast.stmt._
import com.github.javaparser.ast.visitor.VoidVisitorAdapter
import com.github.javaparser.ast.`type`._
import com.github.javaparser.ast.expr._
import com.github.javaparser.ast.ImportDeclaration
import com.github.javaparser.ast.NodeList

import java.io._
import scala.io.Source
import scala.sys.process._

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import ProgramPaths._
import Configs._
import PathFlattener._
import FunctionExtractor._
import AssertExpander._
import AbstractInterpreter._
import RecursionExpander._
import PathProfiler._
import IntermediatePathAdder._
import AdvancedInliner._
import java.io.ObjectInputFilter.Config

object PathExtractor {
    // var _class_name: String = null
    // var _method_name: String = null
    // val _symbolic_methods: List[String] = null
    // var _cu: CompilationUnit = null
    
    val symbolSolver = new JavaSymbolSolver(new ReflectionTypeSolver());
    StaticJavaParser.getConfiguration().setSymbolResolver(symbolSolver);

    def get_other_methods(clazz: ClassOrInterfaceDeclaration, symbolic_methods: List[String]): String = {
        var ret = ""

        // add fileds 
        for (i <- 0 until clazz.getFields().size) {
            val field = clazz.getFields().get(i)
            ret += s"${field}\n"
        }
        // add all inner classes
        for (i <- 0 until clazz.getMembers().size) {
            val member = clazz.getMembers().get(i)
            if (member.isClassOrInterfaceDeclaration()) {
                val inner = member.asClassOrInterfaceDeclaration()
                ret += s"${inner}\n"
            }
        }
        // add all methods except the symbolic methods
        for (i <- 0 until clazz.getMethods().size) {
            val method = clazz.getMethods().get(i)
            if (!symbolic_methods.contains(method.getNameAsString())) {
                ret += s"${method}\n"
            }
        }
        return ret
    }
    def get_imports(_cu: CompilationUnit): String = {
        return import_to_string(_cu.getImports())
    }

    def print_paths(paths: Paths) = {
        println("<====== Program path ======>")
        for (path <- paths) {
            println("<" * 20)
            println(path._1)
        }
    }
    
    def getPrettyPathStatemenet(path: String): String = {
        return StaticJavaParser.parseStatement(path).toString
    }
    def getPrettyProgram(prog: String): String = {
        return StaticJavaParser.parse(prog).toString
    }
    def get_path_variant_compilable(path: String, symbolic_methods: List[String], focal_method: String,
        cu: CompilationUnit, clazz: ClassOrInterfaceDeclaration): String = {
            
        val class_name = clazz.getNameAsString()
        // if path contains return, make the declaration of the focal method as void typed
        val focal_method_decl = clazz.getMethodsByName(focal_method).get(0).clone()
        if (!path.contains("return ")) {
            focal_method_decl.setType("void")
        }
        var code_string = get_imports(cu) +
                                s"\nclass ${class_name} {\n" + _asserts_errmsg +
                                get_other_methods(clazz, symbolic_methods) + 
                                focal_method_decl.getDeclarationAsString() +
                                getPrettyPathStatemenet(AssertExpander.add_errmsg("{\n" + path + "\n}")) +
                                s"\n\n\npublic static void main(String args[]) { ${_hole_placeholder} }\n}\n"
        return code_string //getPrettyProgram(code_string)
        // IMPORTANT: don't pretify the code_string, as the following testVerifier assumes { ; } in the main function.
    }
    def get_path_variant_prompt(path: String, symbolic_methods: List[String], focal_method: String,
        cu: CompilationUnit, clazz: ClassOrInterfaceDeclaration): String = {
        

        // if path contains return, make the declaration of the focal method as void typed
        val focal_method_decl = clazz.getMethodsByName(focal_method).get(0).clone()
        if (!path.contains("return ")) {
            focal_method_decl.setType("void")
        }

        val code_string = get_imports(cu) + get_other_methods(clazz, symbolic_methods) + 
                            focal_method_decl.getDeclarationAsString() + 
                            AssertExpander.add_errno(getPrettyPathStatemenet("{\n" + path + "\n}"))
        return code_string
    }

    def box_type(type_name: String): String = {
        if (type_name == "boolean") return "Boolean"
        else if (type_name == "byte") return "Byte"
        else if (type_name == "char") return "Character"
        else if (type_name == "float") return "Float"
        else if (type_name == "int") return "Integer"
        else if (type_name == "long") return "Long"
        else if (type_name == "short") return "Short"
        else if (type_name == "double") return "Double"
        else return type_name
    }
    def expr_to_string(expr: NodeList[Expression]): String = {
        var ret: String = ""
        for (i <- 0 until expr.size())
            ret = ret + expr.get(i).toString() + ";\n"
        return ret
    }
    def import_to_string(expr: NodeList[ImportDeclaration]): String = {
        var ret: String = "import java.util.*;\n"
        for (i <- 0 until expr.size())
            ret = ret + expr.get(i).toString()
        return ret
    }

    // TODO: turn assertTrue(!cond) => assertFalse(cond)
    def get_assertTrue(cond: String): String = {
        return s"assertTrue(${cond});"
    }
    def get_assertFalse(cond: String): String = {
        return s"assertFalse(${cond});"
    }
    def traverse(top: Statement): Paths = {
        if (top.isBlockStmt()) {
            var ret: Paths = List(("", NORMAL))
            val statements = top.asBlockStmt().getStatements()
            for (i <- 0 until statements.size)
                ret = sequential_prod(ret, traverse(statements.get(i)))
            return ret.take(_max_paths * 5)
        }
        if (top.isIfStmt()) {
            var ret: Paths = List()
            val cond = top.asIfStmt().getCondition().toString()
            ret = ret ::: sequential_prod(s"assertTrue(${cond});", traverse(top.asIfStmt().getThenStmt()))
            if (top.asIfStmt().getElseStmt().isPresent())
                ret = ret ::: sequential_prod(s"assertFalse(${cond});", traverse(top.asIfStmt().getElseStmt().get))
            else
                ret = ret ::: List((s"assertFalse(${cond});", NORMAL))
            return ret.take(_max_paths * 5)
        }
        if (top.isForStmt()) {
            var ret: Paths = null

            val init = expr_to_string(top.asForStmt().getInitialization())
            val cond = {
                if (top.asForStmt().getCompare().isPresent)
                    top.asForStmt().getCompare().get.toString()
                else "true"
            }
            val body = loop_lift(traverse(top.asForStmt().getBody()))
            val update = expr_to_string(top.asForStmt().getUpdate())

            var active: Paths = List((init, NORMAL))
            var dead: Paths = List()
            
            for (i <- 0 until _loop_iter_bound) {
                // compare check
                dead = dead ::: sequential_prod(active, s"assertFalse(${cond});")
                active = sequential_prod(active, s"assertTrue(${cond});")
                // loop body
                dead = dead ::: sequential_prod(active, body._2)
                active = sequential_prod(active, body._1)
                // update
                active = sequential_prod(active, update)
            }
            if (_cut_loop_check)
                active = sequential_prod(active, s"assertFalse(${cond});")
            ret = dead ::: active

            if (_add_loop_guard)
                ret = add_parenthesis(ret)
            return ret.take(_max_paths * 5)
        }

        if (top.isForEachStmt()) {
            // ForEach statement iterates 
            val _is_array = top.asForEachStmt().getIterable().calculateResolvedType().isArray()
            // _is_array : true, foreach is enumerating an array
            //             false, foreach is enumerating an iteratorable object such as List or Map
            var ret: Paths = null
            
        if (_is_array) {
            val _var_name = s"${top.asForEachStmt().getVariableDeclarator().getName()}"
            var _array_name = s"${_var_name}_array"
            val _var_type = s"${top.asForEachStmt().getVariableDeclarator().getType()}"
            val _array_expr = top.asForEachStmt().getIterable()
            val _array_type = s"${_array_expr.calculateResolvedType().describe()}"
            
            var init = s"${_array_type} ${_array_name} = ${_array_expr};\n" +
                            s"${_var_type} ${_var_name};"
            val body = loop_lift(traverse(top.asForEachStmt().getBody()))

            if (_avoid_literal_copy && _array_expr.isNameExpr()) {
                _array_name = s"${_array_expr}"
                init = s"${_var_type} ${_var_name};"
            }

            var active: Paths = List((init, NORMAL))
            var dead: Paths = List()

            for (i <- 0 until _loop_iter_bound) {
                val cond = s"${i} < ${_array_name}.length"
                val itermove = s"${_var_name} = ${_array_name}[${i}];"
                // compare check
                dead = dead ::: sequential_prod(active, s"assertFalse(${cond});")
                active = sequential_prod(active, s"assertTrue(${cond});")
                // iterator move
                active = sequential_prod(active, itermove)
                // loop body
                dead = dead ::: sequential_prod(active, body._2)
                active = sequential_prod(active, body._1)
            }

            if (_cut_loop_check)
                active = sequential_prod(active, s"assertFalse(${_loop_iter_bound} < ${_array_name}.length);")
            ret = dead ::: active

            if (_add_loop_guard)
                ret = add_parenthesis(ret)
            return ret.take(_max_paths * 5)
        }
        else {
            val _var_name = s"${top.asForEachStmt().getVariableDeclarator().getName()}"
            val _iter_name = s"${_var_name}_iter"
            val _var_type = s"${top.asForEachStmt().getVariableDeclarator().getType()}"
            val _iter_type = s"Iterator<${box_type(_var_type)}>"
            val _iterable = top.asForEachStmt().getIterable()
            
            val init = s"${_iter_type} ${_iter_name} = ${_iterable}.iterator();\n" +
                            s"${_var_type} ${_var_name};"
            val cond = s"${_iter_name}.hasNext()"
            val body = loop_lift(traverse(top.asForEachStmt().getBody()))
            val itermove = s"${_var_name} = ${_iter_name}.next();"

            var active: Paths = List((init, NORMAL))
            var dead: Paths = List()

            for (i <- 0 until _loop_iter_bound) {
                // compare check
                dead = dead ::: sequential_prod(active, s"assertFalse(${cond});")
                active = sequential_prod(active, s"assertTrue(${cond});")
                // iterator move
                active = sequential_prod(active, itermove)
                // loop body
                dead = dead ::: sequential_prod(active, body._2)
                active = sequential_prod(active, body._1)
            }

            if (_cut_loop_check)
                active = sequential_prod(active, s"assertFalse(${cond});")
            ret = dead ::: active

            if (_add_loop_guard)
                ret = add_parenthesis(ret)
            return ret.take(_max_paths * 5)
        }

        }

        if (top.isWhileStmt()) {
            var ret: Paths = null

            val cond = top.asWhileStmt().getCondition().toString()
            val body = loop_lift(traverse(top.asWhileStmt().getBody()))

            var active: Paths = List(("", NORMAL))
            var dead: Paths = List()
            
            for (i <- 0 until _loop_iter_bound) {
                // compare check
                dead = dead ::: sequential_prod(active, s"assertFalse(${cond});")
                active = sequential_prod(active, s"assertTrue(${cond});")
                // loop body
                dead = dead ::: sequential_prod(active, body._2)
                active = sequential_prod(active, body._1)
            }
            if (_cut_loop_check)
                active = sequential_prod(active, s"assertFalse(${cond});")
            ret = dead ::: active

            if (_add_loop_guard)
                ret = add_parenthesis(ret)
            return ret.take(_max_paths * 5)
        }

        val ti = if (top.isReturnStmt()) RETURN
            else if (top.isContinueStmt()) CONTINUE
            else if (top.isBreakStmt()) BREAK
            else NORMAL
        val statements = if (top.isReturnStmt()) top.toString()
            else if (top.isContinueStmt()) ""
            else if (top.isBreakStmt()) ""
            else top.toString() 

        val composed = (statements, ti)
        return List(composed)
    }

    def getCurrentTime(): String = {
        val currentTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss")
        val formattedTime = currentTime.format(formatter)
        return formattedTime
    }








    def getPaths(prog: String): Paths = {
        var symbolic_methods: List[String] = List[String](prog.toLowerCase())
        var focal_method: String = prog.toLowerCase()

        val in = new FileInputStream(s"${_program_dir}/${prog}.java")
        val _cu = StaticJavaParser.parse(in)
        // read the file and find comment
        // focal: xxx => change focal_method to xxx
        // symbolic: xxx, yyy => change symbolic_methods to List(xxx, yyy)
        for (i <- 0 until _cu.getAllContainedComments().size()) {
            val comment = _cu.getAllContainedComments().get(i)
            if (comment.isLineComment()) {
                val line = comment.asLineComment().getContent().trim()
                if (line.startsWith("focal:")) {
                    focal_method = line.substring("focal:".length).trim()
                }
                else if (line.startsWith("symbolic:")) {
                    symbolic_methods = line.substring("symbolic:".length).trim().split(",").map(_.trim).toList
                }
            }
        }

        if (true) { // remove comments
            val comments = _cu.getAllContainedComments()
            for (j <- 0 until comments.size())
                comments.get(j).remove()
        }

        // clazz is the only class in the file
        val clazz: ClassOrInterfaceDeclaration = _cu.getClassByName(prog).get
        // remove main method if it exists
        if (! clazz.getMethodsByName("main").isEmpty) {
            clazz.getMethodsByName("main").get(0).remove()
        }
        // create a map : string (symbolic method name) -> Paths
        var paths_map: Map[String, Paths] = Map[String, Paths]()
        for (symbolic_method <- symbolic_methods) {
            if (!clazz.getMethodsByName(symbolic_method).isEmpty()) {
                val method = clazz.getMethodsByName(symbolic_method).get(0)
                paths_map = paths_map.updated(symbolic_method, traverse(method.getBody.get))
            }
            else {
                println(s"Symbolic method: ${symbolic_method} not found in class ${prog}")
            }
        }
        
        // expand recursion
        //var paths = RecursionExpander.expand_recursion(paths_map(focal_method), 
        //       clazz.getMethodsByName(symbolic_method).get(0).getBody.get)

        // function inlining (recursive resolution + symbolic fusing)
        var paths = AdvancedInliner.inline_functions(paths_map, clazz, symbolic_methods, focal_method)

        // flatten paths
        assert(_flatten_paths, "Flatten paths must be enabled")
        paths = PathFlattener.flatten_paths(paths)

        // constant propagation
        if (Configs._propagate_constant_assignment)
        paths = paths.map(path => {
            (ConstantPropagator.propagate_constant_assignment_forward(path._1), path._2)
        })

        // remove paths with assertFalse(true) or assertTrue(false)
        paths = paths.filter(path => !path._1.contains("assertFalse(true)"))
        paths = paths.filter(path => !path._1.contains("assertTrue(false)"))

        paths = paths.take(_max_paths)

        // add intermediate paths that are prefixes of the original paths
        if (_use_dfs) {
            IntermediatePathAdder.add_intermediate_paths(paths)
            paths = IntermediatePathAdder.pathsets.toList.map(path => (path, NORMAL))
        }
        // sort paths by length
        paths = paths.sortBy(_._1.length)
        
        // output the IntermediatePathAdder.parents map into {prog}.tree file
        // child -> parent (both id)
        if (_use_dfs) { // save the tree
            val path_id_map = scala.collection.mutable.Map[String, Int]()
            for ((path, idx) <- paths.zipWithIndex) {
                path_id_map(path._1) = idx
            }

            val tree = IntermediatePathAdder.parents.map { 
                case (child, parent) => s"${path_id_map(child)} -> ${path_id_map(parent)}"
            }.mkString("\n")
            val tree_writer = new PrintWriter(new File(s"${_extract_dir}/${prog.toLowerCase}.tree"))
            tree_writer.write(tree)
            tree_writer.close()
        }

        
        
        // save paths to file

        for ((path, idx) <- paths.zipWithIndex) {
            val writer = new PrintWriter(new File(s"${_extract_dir}/${prog.toLowerCase}.${idx}.java"))
            // [0] compilable path checker
            val code_string = get_path_variant_compilable(path._1, symbolic_methods, focal_method, _cu, clazz)
            // [1] path condition
            val focal_string = get_path_variant_prompt(path._1, symbolic_methods, focal_method, _cu, clazz)
            // [2] method call list
            //val method_call_string = FunctionExtractor.get_method_calls(code_string, _class_name, _method_name)
            val method_call_string = ""
            // [3] propogated constraints
            val propagated_constraints = AbstractInterpreter.propagate_values("{\n" + path._1 + "\n}")

            writer.write(code_string)
            writer.write(_separator)
            writer.write("/*\n" + focal_string + "\n*/\n")
            writer.write(_separator)
            writer.write("/*\n" + method_call_string + "\n*/\n")
            writer.write(_separator)
            writer.write("/*\n" + propagated_constraints + "\n*/\n")
            writer.close()
        }


        // rewrite the original program
        if (true) {
            val writer = new PrintWriter(new File(s"${_extract_dir}/${prog.toLowerCase}.java"))
            val code_string = import_to_string(_cu.getImports()) + clazz.toString()
            writer.write(code_string)
            writer.close()
        }

        if (true) { // make a profiler 
            val entire_profiler = PathProfiler.entire_path_profiler(_cu, clazz, symbolic_methods)
            val writer = new PrintWriter(new File(s"${_extract_dir}/${prog.toLowerCase}_.java"))
            writer.write(entire_profiler)
            writer.close()
        }
        return paths
    }
    def main(args: Array[String]): Unit = {
        // PathFlattener.test_flatten_paths()
        // ConstantPropagator.test_constant_propagation()
        // AbstractInterpreter.test_propagate_values()
        // RecursionExpander.test_recursion_expansion()
        // PathProfiler.test_path_profiler()
        // return ()

        // set up configurable options
        var progs: Array[String] = Array[String]()
        for (arg <- args) {
            if (arg == "-flatten-paths") Configs._flatten_paths = true
            else if (arg == "-constant-propagate=false") Configs._propagate_constant_assignment = false
            else if (arg == "-constant-propagate") Configs._propagate_constant_assignment = true
            else if (arg.startsWith("-program-dir=")) Configs._program_dir = arg.substring("-program-dir=".length)
            else if (arg.startsWith("-extract-dir=")) Configs._extract_dir = arg.substring("-extract-dir=".length)
            else if (arg.startsWith("-max-paths=")) Configs._max_paths = arg.substring("-max-paths=".length).toInt
            else if (arg.startsWith("-loop-iter-bound=")) Configs._loop_iter_bound = arg.substring("-loop-iter-bound=".length).toInt
            else if (arg.startsWith("-recursive-iter-bound=")) Configs._recursive_iter_bound = arg.substring("-recursive-iter-bound=".length).toInt
            else if (arg.startsWith("-use-dfs")) Configs._use_dfs = true
            else progs = progs :+ arg
        }
        println("flatten-paths=" + Configs._flatten_paths)
        println("program-dir=" + Configs._program_dir)
        println("extract-dir=" + Configs._extract_dir)
        println("max-paths=" + Configs._max_paths)
        println("loop-iter-bound=" + Configs._loop_iter_bound)
        println("recursive-iter-bound=" + Configs._recursive_iter_bound)
        println("use-dfs=" + Configs._use_dfs)

        for (prog <- progs) {
            println(s"[${getCurrentTime()}] ${prog}")
            val paths = getPaths(prog)
        }
    }
}