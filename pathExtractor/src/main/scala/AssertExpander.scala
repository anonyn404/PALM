/*
Key function:
- add_errmsg: String -> String
    Add error message to the assert statements in the given string of Java code.
- add_errno: String -> String
    Add error number to the assert statements in the given string of Java code.
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
import com.github.javaparser.ast.Node
import com.github.javaparser.ast.comments.LineComment;

import Configs._
import ProgramPaths._

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map


object AssertExpander {
    // Add error message to the assert statements
    def add_errmsg(statements: String): String = {
        val top = StaticJavaParser.parseStatement(statements)
        var index = 1
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(assertc: MethodCallExpr, arg: Unit): Unit = {
                super.visit(assertc, arg)
                if (assertc.getName().toString() == "assertTrue" ||
                    assertc.getName().toString() == "assertFalse") {
                    val assert_code = assertc.toString().replace("\"", "\\\"")
                    val errmsg = f"""Path condition is violated: ${assert_code} //[${index}]"""
                    assertc.addArgument(new StringLiteralExpr(errmsg))
                    index += 1
                }
            }
        }, ())

        return top.toString()
    }
    // Add error number to the assert statements
    def add_errno(statements: String): String = {
        var index = 1
        val result = new StringBuilder
        return statements.split("\n").map {
            line =>
                if (line.contains("assertTrue") || line.contains("assertFalse")) {
                    val line_no = line + f" //[${index}]"
                    index += 1
                    line_no
                }
                else line
        }.mkString("\n")
    }
}