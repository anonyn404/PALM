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
import com.github.javaparser.ast.Node
import com.github.javaparser.ast.comments.LineComment;

import Configs._
import ProgramPaths._

object AdvancedInliner {
    val func_args_map = scala.collection.mutable.Map[String, List[(String, String)]]() // method name -> (type, name) list
    val method_type_map = scala.collection.mutable.Map[String, String]() // method name -> return type
    val method_args_map = scala.collection.mutable.Map[String, List[(String, String)]]() // method name -> argument list(type, name)

    class StructuredHole(_ret_type: String, _ret_name: String, _ret_op: String,
        _call_scope: String, _call_method: String, _call_params: List[String], _hole_name: String) {
        val ret_type = _ret_type // ret_type might be empty
        val ret_name = _ret_name
        val ret_op = _ret_op
        val call_scope = _call_scope // this is the scope of the call, might be empty, this in the callee becomes _call_scope
        val call_method = _call_method // this is the method name of the call
        val call_params = _call_params
        val hole_name = _hole_name

        override def toString(): String = {
            return f"${hole_name} (${call_params.mkString(",")}) -> (${ret_type} ${ret_name} ${ret_op})"
        }
    }
    class StructuredPath(_path_str: String, _holes: List[StructuredHole], _ret_expr: String, _belonged_method: String) { 
        val path_str = _path_str
        val holes = _holes
        val ret_expr = _ret_expr
        val belonged_method = _belonged_method 

        def is_clean_path(): Boolean = {
            return holes.isEmpty
        }
        def inplant(subpath: StructuredPath): StructuredPath = {
            assert (!is_clean_path() && subpath.is_clean_path())
            val hole = holes.head
            assert (subpath.belonged_method == hole.call_method)
            var param_tmp_copy = ""
            var param_real_copy = "" // this is to deal with shadow variables, such as f(n-1) resulting in {int n' = n-1;}
            for (idx <- 0 until hole.call_params.size) {
                val (arg_type, arg_name) = method_args_map(subpath.belonged_method)(idx)
                param_tmp_copy += f"${arg_type} arg_${idx} = ${hole.call_params(idx)};\n"
                param_real_copy += f"${arg_type} ${arg_name} = arg_${idx};\n"
            }
            // we first pass the concrete values to temporary variables arg_0, arg_1, ...
            // then we pass them to the real argument variables in the function
            var inlined_body = ""
            if (hole.ret_type != "void" && hole.ret_type != "") {
                var inlined = subpath.path_str
                inlined = inlined.replace("return Return_Expr()", f"${hole.ret_name} = ${subpath.ret_expr}")
                inlined = inlined.replace("this.", f"${hole.call_scope}.") // replace this. with the call scope
                inlined_body = f"""
                |${hole.ret_type} ${hole.ret_name};
                |{
                |   ${param_tmp_copy}
                |   {
                |       ${param_real_copy}
                |       ${inlined}
                |   }
                |}
                """.stripMargin
            }
            else {
                var inlined = subpath.path_str
                inlined = inlined.replace("this.", f"${hole.call_scope}.") // replace this. with the call scope
                if (subpath.ret_expr != null) {
                    inlined = inlined.replace("return Return_Expr()", f"${hole.ret_name} ${hole.ret_op} ${subpath.ret_expr}")
                }
                inlined_body = f"""
                |{
                |   ${param_tmp_copy}
                |   {
                |       ${param_real_copy}
                |       ${inlined}
                |   }
                |}
                """.stripMargin
            }
            return new StructuredPath(path_str.replace(hole.hole_name, inlined_body), holes.tail, ret_expr, belonged_method)
        }
        override def toString(): String = {
            if (ret_expr != null) return path_str.replace("Return_Expr()", ret_expr)
            return path_str
        }
        def print() = {
            val top = StaticJavaParser.parseStatement("{" + toString() + "}")
            println(top.toString() + "\n")
            for (idx <- 0 until holes.size) {
                println("#Hole " + idx.toString() + ": " + holes(idx).toString())
            }
            println(ret_expr)
        }
    }
    def structurize(path_str: String, path_method: String, symbolic_methods: List[String]): StructuredPath = {
        val top = StaticJavaParser.parseStatement("{" + path_str + "}")
        var call_id = 0
        val modifications = scala.collection.mutable.ArrayBuffer[(Statement, Statement)]() // buffered statements (._2) to insert into the block that (._1 in)
        val removes = scala.collection.mutable.ArrayBuffer[Node]() // buffered nodes to remove

        val holes = scala.collection.mutable.ArrayBuffer[StructuredHole]()
        var ret_expr: String = null

        // make each recursive call a hole, and replace it with a placeholer
        // modifications records the statements that lifted from complex method calls (expressions), to prevent parallelization problem
        //  some easier method call expressions are directly changed into a hole
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(ret: ReturnStmt, arg: Unit): Unit = {
                // extract out the return expression, and replace it with a placeholder Return_Expr();
                super.visit(ret, arg)
                if (ret.getExpression().isPresent()) {
                    ret_expr = ret.getExpression().get().toString()

                    // Now, don't remove the return statement, just replace it with a placeholder
                    ret.setExpression(new NameExpr("Return_Expr()"))
                }
                else removes += ret // This is a void return, we just remove it
                
            }
            override def visit(name: MethodCallExpr, arg: Unit): Unit = {
                super.visit(name, arg)
                // only if the method call is in the symbolic_methods list, we lift it
                if (symbolic_methods.contains(name.getName().toString())) {
                    call_id += 1

                    // name.getArguments() is a NodeList[Expression]
                    //  convert it into List[String]
                    
                    val call_params: List[String] = name.getArguments().toArray.map(_.toString).toList
                    val call_scope: String = {if (name.getScope().isPresent()) name.getScope().get().toString() else "this"} // might be empty if it's a static method call
                    val call_ret_name = name.getName().toString() + "_return" + call_id.toString()
                    val call_method = name.getName().toString()

                    val parent = name.getParentNode().get()
                    // traverse name.getParentNode() until it's a statement, then add the lifted expression before it
                    var ancestor = parent
                    while (!ancestor.isInstanceOf[Statement]) {
                        ancestor = ancestor.getParentNode().get()
                    }

                    if (parent.isInstanceOf[ExpressionStmt]) {
                        // case 1, no return value, just a method call
                        // if the method call is a statement without returns, we don't need to lift it
                        
                        val ret_type = method_type_map(name.getName().toString())
                        val hole = new StructuredHole(ret_type, call_ret_name, "", call_scope, call_method, call_params, f"Hole_${call_id}();")
                        holes += hole

                        modifications += ((ancestor.asInstanceOf[Statement], StaticJavaParser.parseStatement(hole.hole_name)))
                        removes += parent
                    }
                    else if (parent.isInstanceOf[VariableDeclarator]) { // TODO: what about a Statement
                        // case 2, with return value, directly assigned to a variable (in declaration)
                        //  e.g. int x = func(..);
                        val ret_type = parent.asInstanceOf[VariableDeclarator].getType().toString()
                        val decl_name = parent.asInstanceOf[VariableDeclarator].getName().toString()
                        val hole = new StructuredHole(ret_type, decl_name, "=", call_scope, call_method, call_params, f"Hole_${call_id}();")
                        holes += hole

                        modifications += ((ancestor.asInstanceOf[Statement], StaticJavaParser.parseStatement(hole.hole_name)))
                        removes += parent
                    }
                    else if (parent.isInstanceOf[AssignExpr]) {
                        // case 3, with return value, but the method call is in the right side of an assignment
                        //  e.g. x += func(..);
                        val ret_op = parent.asInstanceOf[AssignExpr].getOperator().asString() // don't use toString() becausre it returns PLUS instead of +=
                        val assigned_var = parent.asInstanceOf[AssignExpr].getTarget().toString()
                        val hole = new StructuredHole("", assigned_var, ret_op, call_scope, call_method,call_params, f"Hole_${call_id}();")
                        holes += hole

                        println("modifying AssignExpr: ", ancestor.toString(), " -> ", hole.hole_name)
                        println("removing: ", parent)
                        modifications += ((ancestor.asInstanceOf[Statement], StaticJavaParser.parseStatement(hole.hole_name)))
                        removes += ancestor
                    }
                    else {
                        // case x, lift the methodcallExpr to a statement in front
                        val ret_type = method_type_map(name.getName().toString())
                        val hole = new StructuredHole(ret_type, call_ret_name, "=", call_scope, call_method,call_params, f"Hole_${call_id}();")
                        holes += hole
                        
                        name.replace(new NameExpr(call_ret_name))
                        modifications += ((ancestor.asInstanceOf[Statement], StaticJavaParser.parseStatement(hole.hole_name)))
                        removes += name
                    }
                }
            }
        }, ())

        for ((parent_stmt, lifted_stmt) <- modifications) {
            val block = parent_stmt.getParentNode().get().asInstanceOf[BlockStmt]
            val idx = block.getStatements().indexOf(parent_stmt)
            block.addStatement(idx, lifted_stmt)
        }
        for (node <- removes) {
            node.remove()
        }

        // remove empty statements and variable declarations without variables
        removes.clear()
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(exprstmt: ExpressionStmt, arg: Unit): Unit = {
                super.visit(exprstmt, arg)
                val expr = exprstmt.getExpression()
                if (expr.isInstanceOf[VariableDeclarationExpr]) {
                    val vdexpr = expr.asInstanceOf[VariableDeclarationExpr]
                    if (vdexpr.getVariables().size() == 0) {
                        removes += exprstmt
                    }
                }
            }
            override def visit(stmt: EmptyStmt, arg: Unit): Unit = {
                removes += stmt
            }
        }, ())
        for (node <- removes) {
            node.remove()
        }

        
        // in the begining, we add { } to the path_str, so we need to remove them
        val inlined_path_str: String = top.toString().strip().stripPrefix("{").stripSuffix("}").strip()
        return new StructuredPath(inlined_path_str, holes.toList, ret_expr, path_method)
    }

    def inline_functions(paths_map: Map[String, Paths], clazz: ClassOrInterfaceDeclaration, symbolic_methods: List[String], focal_method: String): Paths = {
        // clear method_type_map and method_args_map, and prepare them
        method_type_map.clear()
        method_args_map.clear()
        for (method <- symbolic_methods) {
            val method_decl = clazz.getMethodsByName(method).get(0)
            val method_type = method_decl.getType().toString()
            val method_args = method_decl.getParameters().toArray.map(_.asInstanceOf[Parameter])
                                .map(p => (p.getType().toString(), p.getName().toString())).toList
            
            method_type_map(method) = method_type
            method_args_map(method) = method_args
        }

        // structurize all paths

        var clean_paths = scala.collection.mutable.ArrayBuffer[StructuredPath]()
        val all_paths = scala.collection.mutable.ArrayBuffer[StructuredPath]()

        for ((method_name, paths) <- paths_map) {
            // println("structurizing method: ", method_name)
            val method_type = method_type_map(method_name)
            val method_args = method_args_map(method_name)

            // structurize each path
            for (path <- paths) {
                // path._1 is the path string, path._2 is the path type (CONTINUE/BREAK/RETURN/NORMAL)
                val structured_path = structurize(path._1, method_name, symbolic_methods)
                if (structured_path.is_clean_path()) {
                    clean_paths += structured_path
                }
                all_paths += structured_path
            }
        }
        

        println("#clean paths: ", clean_paths.size)
        println("#all paths: ", all_paths.size)

        for (k <- 2 to Configs._recursive_iter_bound) {
            val new_paths = scala.collection.mutable.ArrayBuffer[StructuredPath]()
            var queue = scala.collection.mutable.Queue[StructuredPath]()
            for (path <- all_paths) {
                queue.enqueue(path)
            }

            while (!queue.isEmpty) {
                val cur_path = queue.dequeue()
                // println("dequeued..")
                // println(cur_path.toString())
                if (cur_path.holes.isEmpty) {
                    new_paths += cur_path
                }
                else {
                    for (subpath <- clean_paths)
                    if (subpath.belonged_method == cur_path.holes.head.call_method) {
                        queue.enqueue(cur_path.inplant(subpath))
                    }
                }
            }

            clean_paths = new_paths.take(_max_paths * 5)
            println(f"(round ${k}): ", clean_paths.size)
        }

        return clean_paths.filter(p => p.belonged_method == focal_method)
            // filter out the paths that are not in the focal method
            .map(p => (p.toString(), 0))
            .toList.take(_max_paths * 5) // up to this point, the PathType is deprecated
    }
}