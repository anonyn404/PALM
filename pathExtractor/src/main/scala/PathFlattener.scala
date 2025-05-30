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

import Configs._
import ProgramPaths._

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map


object PathFlattener {
    var mapping: Map[String, Int] = Map[String, Int]()
    var index: Map[String, Int] = Map[String, Int]()

    def decl_var(name: String) = {
        val idx = index.getOrElse(name, 0) + 1
        index.put(name, idx)
        mapping.put(name, idx)
    }
    def mark_declaration(top: Expression): Unit = {
        if (top.isVariableDeclarationExpr()) {
            val decls = top.asVariableDeclarationExpr.getVariables()
            for (i <- 0 until decls.size) {
                decl_var(decls.get(i).getName().toString())
            }
        }
    }
    def flatten(top: Statement): String = {
        if (top.isBlockStmt()) {
            var ret = ""
            val _mapping = mapping.clone()
            val statements = top.asBlockStmt().getStatements()
            for (i <- 0 until statements.size)
                ret = ret + flatten(statements.get(i)) + "\n"
            mapping = _mapping.clone()
            return ret
        }
        if (top.isExpressionStmt())
            mark_declaration(top.asExpressionStmt().getExpression())
        
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(name: SimpleName, arg: Unit): Unit = {
                super.visit(name, arg)
                val var_name = name.toString
                if (mapping.contains(var_name)) {
                    val var_idx = mapping.getOrElse(var_name, 0)
                    name.setIdentifier(f"${var_name}_${var_idx}")
                }
            }
            override def visit(mcall: MethodCallExpr, arg: Unit): Unit = {
                val arguments = mcall.getArguments()
                for (i <- 0 until arguments.size)
                    arguments.get(i).accept(this, arg)
                val scope = mcall.getScope()
                if (scope.isPresent())
                    scope.get().accept(this, arg)
            }
            override def visit(fieldAccessExpr: FieldAccessExpr, arg: Unit): Unit = {
                fieldAccessExpr.getScope().accept(this, arg)
            }
        }, ())

        return top.toString()
    }
    def flatten_path(path_str: String): String = {
        mapping.clear()
        index.clear()
        val statements = StaticJavaParser.parseStatement("{" + path_str + "}")
        val new_statements = flatten(statements)
        return new_statements // output does not contain the outer { .. }
    }
    def flatten_paths(paths: Paths): Paths = {
        var ret: PathsBuffer = ListBuffer.empty[(String, Int)]
        for (path <- paths) {
            mapping.clear()
            index.clear()
            val statements = StaticJavaParser.parseStatement("{" + path._1 + "}")
            val new_statements = flatten(statements)
            // println(translate_compound_assignent(new_statements))
            // println(index)
            // println(new_statements)
            ret += ((new_statements,  path._2))
        }
        return ret.toList
    }

    // this is used for SSA translation, currently not used.
    var mapping_type: Map[String, Type] = Map[String, Type]()
    def translate_compound_assignent(statements: String): String = {
        val top = StaticJavaParser.parseStatement("{" + statements + "}")
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(assign: AssignExpr, arg: Unit): Unit = {
                val bop = assign.getOperator().toBinaryOperator()
                if (bop.isPresent()) {
                    assign.setOperator(AssignExpr.Operator.ASSIGN)
                    assign.setValue(new BinaryExpr(assign.getTarget().clone(), assign.getValue().clone(), bop.get()))
                }   
                super.visit(assign, arg)
            }
        }, ())
        return top.toString()
    }
    def test_flatten_paths(): Boolean = {
        val code = """
        {
            int i = 1;
            {
                i = 1;
                int i = 2;
                i += 2;
                { i += 2; }
                i += 2;
                { int i = 3; i += 3;}
                i += 2;
            }
            i += 1;
            Node f = a.f.f();
            g.f();
            f.g.f();
        }"""
        val new_code = flatten_paths(List((code, NORMAL)))(0)._1
        println(new_code)
        return true
    }
}