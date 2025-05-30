// This class aims to propagate the assertion content back to function entry point.
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

object AbstractInterpreter {
    // we assume no loop / branch / recursion in the analyzed function
    //  it may contain external API calls
    // For each assertion statement, we propagate it back to the function entry point by replacing 
    // !!! This only works when -flatten is enabled, as we assume the function body is a single block.
    def propagate_values(code_block: String): String = {
        var return_info: String = "" // a single string
        // Format:
        // 1#assertTrue(..)
        // 2#assertFalse(..)
        // .. 

        val top = StaticJavaParser.parseStatement(code_block)
        val value_store = scala.collection.mutable.Map[String, String]()
        assert (top.isInstanceOf[BlockStmt])
        val block = top.asInstanceOf[BlockStmt]
        val statements = block.getStatements()
        var assert_id = 0
        for (idx <- 0 until statements.size) {
            val stmt = statements.get(idx)
            if (stmt.isInstanceOf[ExpressionStmt]) {
                val expr = stmt.asInstanceOf[ExpressionStmt].getExpression()
                if (expr.isInstanceOf[AssignExpr]) {
                    val assign = expr.asInstanceOf[AssignExpr]
                    val target = assign.getTarget().toString()
                    val value = assign.getValue().toString()
                    val op = assign.getOperator()
                    if (op == AssignExpr.Operator.ASSIGN) { // assignment = 
                        value_store.put(target, value)
                    }
                    else { // += -= ,...
                        var old_target = if (value_store.contains(target)) value_store(target) else target
                        if (old_target.contains(" ")) {
                            old_target = "(" + old_target + ")"
                        }
                        val new_value = op match {
                            case AssignExpr.Operator.PLUS => old_target + " + " + value
                            case AssignExpr.Operator.MINUS => old_target + " - " + value
                            case AssignExpr.Operator.MULTIPLY => old_target + " * " + value
                            case AssignExpr.Operator.DIVIDE => old_target + " / " + value
                            case AssignExpr.Operator.REMAINDER => old_target + " % " + value
                            case AssignExpr.Operator.LEFT_SHIFT => old_target + " << " + value
                            case AssignExpr.Operator.SIGNED_RIGHT_SHIFT => old_target + " >> " + value
                            case AssignExpr.Operator.UNSIGNED_RIGHT_SHIFT => old_target + " >>> " + value
                            // case AssignExpr.Operator.AND => old_target + " & " + value
                            case AssignExpr.Operator.XOR => old_target + " ^ " + value
                            // case AssignExpr.Operator.OR => old_target + " | " + value
                            case _ => throw new Exception("Unsupported operator")
                        }
                        value_store.put(target, new_value)
                    }
                }
                else if (expr.isInstanceOf[VariableDeclarationExpr]) {
                    val decl = expr.asInstanceOf[VariableDeclarationExpr]
                    val decls = decl.getVariables()
                    for (i <- 0 until decls.size) {
                        val var_name = decls.get(i).getName().toString()
                        if (decls.get(i).getInitializer().isPresent()) {
                            val init = decls.get(i).getInitializer().get()
                            init.accept(new VoidVisitorAdapter[Unit] {
                                override def visit(n: NameExpr, arg: Unit) {
                                    super.visit(n, arg)
                                    val name = n.toString()
                                    if (value_store.contains(name)) {
                                        n.replace(StaticJavaParser.parseExpression(value_store(name)))
                                    }
                                }
                                override def visit(n: ArrayAccessExpr, arg: Unit) {
                                    super.visit(n, arg)
                                    val name = n.toString()
                                    if (value_store.contains(name)) {
                                        n.replace(StaticJavaParser.parseExpression(value_store(name)))
                                    }
                                }
                            }, ())
                            if (!init.toString().contains("{"))
                                value_store.put(var_name, init.toString())
                        }
                    }
                }
                else if (expr.isInstanceOf[MethodCallExpr]) {
                    val call = expr.asInstanceOf[MethodCallExpr]
                    if (call.getName().toString() == "assertTrue" || call.getName().toString() == "assertFalse") {
                        val assert_content = call.getArguments().get(0)
                        assert_id += 1
                        assert_content.accept(new VoidVisitorAdapter[Unit] {
                            override def visit(n: NameExpr, arg: Unit) {
                                super.visit(n, arg)
                                val name = n.toString()
                                if (value_store.contains(name)) {
                                    n.replace(StaticJavaParser.parseExpression(value_store(name)))
                                }
                            }
                            override def visit(n: ArrayAccessExpr, arg: Unit) {
                                super.visit(n, arg)
                                val name = n.toString()
                                if (value_store.contains(name)) {
                                    n.replace(StaticJavaParser.parseExpression(value_store(name)))
                                }
                            }
                            override def visit(n: MethodCallExpr, arg: Unit) {
                                // add brackets to scope
                                n.getScope().ifPresent((scope) => {
                                    if (value_store.contains(scope.toString())) {
                                        n.setScope(StaticJavaParser.parseExpression("(" + value_store(scope.toString()) + ")"))
                                    }
                                })
                                for (i <- 0 until n.getArguments().size) {
                                    val argi = n.getArguments().get(i)
                                    argi.accept(this, arg)
                                }
                            }
                        }, ())

                        // println(assert_content)
                        return_info += assert_id.toString() + "#" + call.toString() + "\n"
                    }
                }
            }
        }

        return return_info
    }
    def test_propagate_values() = {
        val code = """{
            |int x = 1;
            |int y = 2;
            |int z = x + y;
            |z += 5;
            |assertTrue(z == 3);
            |}""".stripMargin
        val code2 = """{
            String b = a.concat("anonymized");
            str += "c";
            assertFalse(str.equals(b));
        }
        """
        println(propagate_values(code))
        println(propagate_values(code2))
    }
}