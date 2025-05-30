// Workflow
//  1. Path Extraction CodeString -> Paths: List[(String, Int)], (no code branch after extraction)
//  2. Recursive Elimination
//  3. Constant Propagation
//  4. Path Flattening Paths: String (path str) -> List[(String, Int)]
//  5. Path constraint Backward Inference -> Paths: List[(String, Int)]
//  6. Assertion Error Message Insertion during path saving
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

object PathExtractor {
    var _class_name: String = null
    var _method_name: String = null
    var _cu: CompilationUnit = null
    
    val symbolSolver = new JavaSymbolSolver(new ReflectionTypeSolver());
    StaticJavaParser.getConfiguration().setSymbolResolver(symbolSolver);

    def load_parse_program(name: String) = {
        _class_name = name.toUpperCase
        _method_name = name.toLowerCase

        val in = new FileInputStream(s"${_program_dir}/${_class_name}.java")
        _cu = StaticJavaParser.parse(in)
    }

    def locate_focal_method() : MethodDeclaration = {
        val clazz = _cu.getClassByName(_class_name).get
        val method = clazz.getMethodsByName(_method_name).get(0)
        method
    }
    def get_other_methods(): String = {
        val clazz = _cu.getClassByName(_class_name).get
        var ret = ""

        // add all inner classes
        for (i <- 0 until clazz.getMembers().size) {
            val member = clazz.getMembers().get(i)
            if (member.isClassOrInterfaceDeclaration()) {
                val inner = member.asClassOrInterfaceDeclaration()
                ret += s"${inner}\n"
            }
        }
        // add all methods except the focal method
        for (i <- 0 until clazz.getMethods().size) {
            val method = clazz.getMethods().get(i)
            if (method.getName().toString != _method_name)
                ret += s"${method}\n"
        }
        return ret
    }
    def get_imports(): String = {
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
    def save_paths(paths: Paths, decl: String) = {
        for ((path, idx) <- paths.zipWithIndex) {
            val writer = new PrintWriter(new File(s"${_extract_dir}/${_method_name}.${idx}.java"))
            // [0] compilable path checker
            val code_string = get_imports() +
                                s"\nclass ${_class_name} {\n" +
                                (if (_add_errmsg) _asserts_errmsg else _asserts) +
                                get_other_methods() + 
                                decl + getPrettyPathStatemenet(
                                    (if (_add_errmsg) AssertExpander.add_errmsg("{\n" + path._1 + "\n}")
                                    else "{\n" + path._1 + "\n}" )) +
                                s"\n\n\npublic static void main(String args[]) { ${_hole_placeholder} }\n}\n"
            // [1] path condition
            val focal_string = (if (_path_imports) get_imports() else "") + 
                                (if (_path_assert) _asserts else "") +
                                (if (_path_other_funcs) get_other_methods() else "") + 
                                decl + 
                                    (if (_add_errno) AssertExpander.add_errno(getPrettyPathStatemenet("{\n" + path._1 + "\n}"))
                                    else getPrettyPathStatemenet("{\n" + path._1 + "\n}") )
            // [2] method call list
            val method_call_string = FunctionExtractor.get_method_calls(code_string, _class_name, _method_name)
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
        if (_rewrite_original) {
            val writer = new PrintWriter(new File(s"${_extract_dir}/${_method_name}.java"))
            val _clazz = _cu.getClassByName(_class_name).get()
            
            if (!_rewrite_comment) {
                val comments = _cu.getAllContainedComments()
                for (j <- 0 until comments.size())
                    comments.get(j).remove()
            }
            val code_string = (if (_rewrite_imports) import_to_string(_cu.getImports()) else "") +
                                _clazz.toString()
            writer.write(code_string)
            writer.close()
        }
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
            return ret.take(_max_paths)
        }
        if (top.isIfStmt()) {
            var ret: Paths = List()
            val cond = top.asIfStmt().getCondition().toString()
            ret = ret ::: sequential_prod(s"assertTrue(${cond});", traverse(top.asIfStmt().getThenStmt()))
            if (top.asIfStmt().getElseStmt().isPresent())
                ret = ret ::: sequential_prod(s"assertFalse(${cond});", traverse(top.asIfStmt().getElseStmt().get))
            else
                ret = ret ::: List((s"assertFalse(${cond});", NORMAL))
            return ret.take(_max_paths)
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
            return ret.take(_max_paths)
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
            return ret.take(_max_paths)
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
            return ret.take(_max_paths)
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
            return ret.take(_max_paths)
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
        load_parse_program(prog)
        val method: MethodDeclaration = locate_focal_method()
        var paths = traverse(method.getBody.get)
        
        // expand recursion
        paths = RecursionExpander.expand_recursion(paths, method)
        // flatten paths
        // if (_flatten_paths)
        assert(_flatten_paths, "Flatten paths must be enabled")
        paths = PathFlattener.flatten_paths(paths)
        // constant propagation
        if (Configs._propagate_constant_assignment)
        paths = paths.map(path => {
            // println(ConstantPropagator.propagate_constant_assignment_forward(path._1))
            (ConstantPropagator.propagate_constant_assignment_forward(path._1), path._2)
        })
        
        save_paths(paths, method.getDeclarationAsString())
        return paths
    }
    def main(args: Array[String]): Unit = {
        // PathFlattener.test_flatten_paths()
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
            else progs = progs :+ arg
        }
        println("flatten-paths=" + Configs._flatten_paths)
        println("program-dir=" + Configs._program_dir)
        println("extract-dir=" + Configs._extract_dir)
        println("max-paths=" + Configs._max_paths)
        println("loop-iter-bound=" + Configs._loop_iter_bound)
        println("recursive-iter-bound=" + Configs._recursive_iter_bound)

        if (progs.length > 1) {
            for (prog <- progs) {
                println(s"[${getCurrentTime()}] ${prog}")
                val paths = getPaths(prog)
            }
        }
        else {
            val paths = getPaths(if (progs.length <= 0) "SPLIT_WORDS" else args(0))
            print_paths(paths)
        }

        // generate a test_profiler file
        for (prog <- progs) {
            load_parse_program(prog)
            val entire_profiler = PathProfiler.entire_path_profiler(_cu.toString(), _method_name)
            val writer = new PrintWriter(new File(s"${_extract_dir}/${_method_name}_.java"))
            writer.write(entire_profiler)
            writer.close()
        }
    }
}