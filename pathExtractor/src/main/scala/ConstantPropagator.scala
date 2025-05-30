/* 
Key function:
- propagate_constant_assignment_forward: String -> String
    Propagate constant assignments forward in the given string of Java code.
    This function aims to simplify the code by replacing variables with their constant values where possible.
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

object ConstantPropagator {
    def propagate_constant_assignment_forward(code_block: String): String = {
        // maintain a map from variable name to its value, we aim to support only primitive typed variables, (now only int)
        // - if the variable is assigned a constant value, we update the map
        // - if the variable is updated using +=, -= a constant value, we update the map
        // - if the variable is updated in lhs of = , we update the map
        // - if variable occurs in any expression, we replace it with its value if it is a constant
        val top = StaticJavaParser.parseStatement("{" + code_block + "}")
        var var_map = Map[String, Int]()
        var var_map_boolean = Map[String, Boolean]()
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(decl: VariableDeclarationExpr, arg: Unit): Unit = {
                super.visit(decl, arg)
                val decls = decl.getVariables()
                for (i <- 0 until decls.size) {
                    val var_name = decls.get(i).getName().toString()
                    // remove var_name from var_map.
                    if (var_map.contains(var_name))
                        var_map.remove(var_name)
                    
                    if (decls.get(i).getInitializer().isPresent()) {
                        val init = decls.get(i).getInitializer().get()
                        if (init.isIntegerLiteralExpr()) {
                            val value = init.asIntegerLiteralExpr().asNumber().intValue()
                            var_map.put(var_name, value)
                        }
                        if (init.isBooleanLiteralExpr()) {
                            val value = init.asBooleanLiteralExpr().getValue()
                            var_map_boolean.put(var_name, value)
                        }
                    }
                }
            }
            override def visit(unary: UnaryExpr, arg: Unit): Unit = {
                val op = unary.getOperator()
                val expr = unary.getExpression()
                op match {
                    case UnaryExpr.Operator.POSTFIX_INCREMENT => 
                        if (expr.isNameExpr()) {
                            val var_name = expr.asNameExpr().getName().toString()
                            if (var_map.contains(var_name)) {
                                val value = var_map.getOrElse(var_name, 0)
                                var_map.put(var_name, value + 1)
                                // replace it into var_name = var_name + 1
                                // unary.replace(StaticParser.parseExpression(var_name + " = " + (value).toString))
                            }
                        }
                    case UnaryExpr.Operator.PREFIX_INCREMENT =>
                        if (expr.isNameExpr()) {
                            val var_name = expr.asNameExpr().getName().toString()
                            if (var_map.contains(var_name)) {
                                val value = var_map.getOrElse(var_name, 0)
                                var_map.put(var_name, value + 1)
                                // unary.replace(StaticParser.parseExpression(var_name + " = " + (value+1).toString))
                            }
                        }
                    case UnaryExpr.Operator.POSTFIX_DECREMENT =>
                        if (expr.isNameExpr()) {
                            val var_name = expr.asNameExpr().getName().toString()
                            if (var_map.contains(var_name)) {
                                val value = var_map.getOrElse(var_name, 0)
                                var_map.put(var_name, value - 1)
                                // unary.replace(StaticParser.parseExpression(var_name + " = " + (value).toString))
                            }
                        }
                    case UnaryExpr.Operator.PREFIX_DECREMENT =>
                        if (expr.isNameExpr()) {
                            val var_name = expr.asNameExpr().getName().toString()
                            if (var_map.contains(var_name)) {
                                val value = var_map.getOrElse(var_name, 0)
                                var_map.put(var_name, value - 1)
                                // unary.replace(StaticParser.parseExpression(var_name + " = " + (value-1).toString))
                            }
                        }
                    case _ => super.visit(unary, arg)
                }
            }
            override def visit(assign: AssignExpr, arg: Unit): Unit = {
                // visit value first
                assign.getValue().accept(this, arg)
                val target = assign.getTarget()
                val value = assign.getValue()
                
                if (target.isNameExpr() && value.isIntegerLiteralExpr() && assign.getOperator() == AssignExpr.Operator.ASSIGN) {
                    val var_name = target.asNameExpr().getName().toString()
                    val rhs = value.asIntegerLiteralExpr().asNumber().intValue()
                    var_map.put(var_name, rhs)
                }
                else if (target.isNameExpr() && value.isBooleanLiteralExpr() && assign.getOperator() == AssignExpr.Operator.ASSIGN) {
                    val var_name = target.asNameExpr().getName().toString()
                    val rhs = value.asBooleanLiteralExpr().getValue()
                    var_map_boolean.put(var_name, rhs)
                }
                // += -= *= /= constant
                else if (target.isNameExpr() && value.isIntegerLiteralExpr()) {
                    val var_name = target.asNameExpr().getName().toString()
                    val rhs = value.asIntegerLiteralExpr().asNumber().intValue()
                    if (var_map.contains(var_name)) {
                        val lhs = var_map.getOrElse(var_name, 0)
                        var supported = true
                        val result: Int = assign.getOperator() match {
                            case AssignExpr.Operator.PLUS => lhs + rhs
                            case AssignExpr.Operator.MINUS => lhs - rhs
                            case AssignExpr.Operator.MULTIPLY => lhs * rhs
                            case AssignExpr.Operator.DIVIDE => lhs / rhs
                            case AssignExpr.Operator.REMAINDER => lhs % rhs
                            case AssignExpr.Operator.LEFT_SHIFT => lhs << rhs
                            case AssignExpr.Operator.UNSIGNED_RIGHT_SHIFT => lhs >>> rhs
                            case AssignExpr.Operator.SIGNED_RIGHT_SHIFT => lhs >> rhs
                            case AssignExpr.Operator.BINARY_OR => lhs | rhs
                            case AssignExpr.Operator.BINARY_AND => lhs & rhs
                            case AssignExpr.Operator.XOR => lhs ^ rhs
                            case _ => {supported = false; 0}
                        }
                        if (supported)
                            var_map.put(var_name, result)
                        else // remove var_name from var_map.
                            var_map.remove(var_name)
                    }
                }
                else {
                    if (target.isNameExpr()) {
                        val var_name = target.asNameExpr().getName().toString()
                        // remove var_name from var_map.
                        if (var_map.contains(var_name))
                            var_map.remove(var_name)
                        if (var_map_boolean.contains(var_name))
                            var_map_boolean.remove(var_name)
                    }
                }
            }
            // lift up integer or boolean literal from enclosed expression
            // replace the expression with its value
            override def visit(literal: EnclosedExpr, arg: Unit): Unit = {
                super.visit(literal, arg)
                val expr = literal.getInner()
                if (expr.isIntegerLiteralExpr()) {
                    val value = expr.asIntegerLiteralExpr().asNumber().intValue()
                    literal.replace(new IntegerLiteralExpr(value.toString()))
                }
                if (expr.isBooleanLiteralExpr()) {
                    val value = expr.asBooleanLiteralExpr().getValue()
                    literal.replace(new BooleanLiteralExpr(value))
                }
            }
            override def visit(name: NameExpr, arg: Unit): Unit = {
                super.visit(name, arg)
                val var_name = name.getName().toString()
                if (var_map.contains(var_name)) {
                    val value = var_map.getOrElse(var_name, 0)
                    name.replace(new IntegerLiteralExpr(value.toString()))
                }
                if (var_map_boolean.contains(var_name)) {
                    val value = var_map_boolean.getOrElse(var_name, false)
                    name.replace(new BooleanLiteralExpr(value))
                }
            }
            // When (a method call) assertTrue(literal), mark literal as true
            override def visit(method: MethodCallExpr, arg: Unit): Unit = {
                super.visit(method, arg)
                if (method.getName().toString() == "assertTrue" 
                    || method.getName().toString() == "assertFalse") {
                    val args = method.getArguments()
                    if (args.size() >= 1) {
                        val arg = args.get(0)
                        // if arg is a name expression, mark it as a constant
                        if (arg.isNameExpr()) {
                            val var_name = arg.asNameExpr().getName().toString()
                            if (method.getName().toString() == "assertTrue") {
                                var_map_boolean.put(var_name, true)
                            }
                            else if (method.getName().toString() == "assertFalse") {
                                var_map_boolean.put(var_name, false)
                            }
                        }
                    }
                }
            }
            // simplify binary expressions with constant values
            override def visit(binary: BinaryExpr, arg: Unit): Unit = {
                super.visit(binary, arg)
                val lhs = binary.getLeft()
                val rhs = binary.getRight()
                // lhs is a constant, rhs is a constant
                if (lhs.isIntegerLiteralExpr() && rhs.isIntegerLiteralExpr()) {
                    val lval = lhs.asIntegerLiteralExpr().asNumber().intValue()
                    val rval = rhs.asIntegerLiteralExpr().asNumber().intValue()
                    // replace the entire binary expression with the result
                    //  replace binary with a new IntegerLiteralExpr
                    var supported = true
                    val result = binary.getOperator() match {
                        case BinaryExpr.Operator.PLUS => lval + rval
                        case BinaryExpr.Operator.MINUS => lval - rval
                        case BinaryExpr.Operator.MULTIPLY => lval * rval
                        case BinaryExpr.Operator.DIVIDE => lval / rval
                        case BinaryExpr.Operator.LEFT_SHIFT => lval << rval
                        case BinaryExpr.Operator.UNSIGNED_RIGHT_SHIFT => lval >>> rval
                        case BinaryExpr.Operator.SIGNED_RIGHT_SHIFT => lval >> rval
                        case BinaryExpr.Operator.XOR => lval ^ rval
                        case BinaryExpr.Operator.REMAINDER => lval % rval
                        case BinaryExpr.Operator.NOT_EQUALS => {if (lval != rval) true else false}
                        case BinaryExpr.Operator.EQUALS => {if (lval == rval) true else false}
                        case BinaryExpr.Operator.GREATER => {if (lval > rval) true else false}
                        case BinaryExpr.Operator.GREATER_EQUALS => {if (lval >= rval) true else false}
                        case BinaryExpr.Operator.LESS => {if (lval < rval) true else false}
                        case BinaryExpr.Operator.LESS_EQUALS => {if (lval <= rval) true else false}
                        case BinaryExpr.Operator.BINARY_OR => lval | rval
                        case BinaryExpr.Operator.BINARY_AND => lval & rval
                        case _ => {supported = false; 0}
                    }
                    // replace this entire AST node binary with a new IntegerLiteralExpr
                    if (supported) {
                        if (result.toString() == "true" || result.toString() == "false")
                            binary.replace(new BooleanLiteralExpr(result.toString().toBoolean))
                        else
                            binary.replace(new IntegerLiteralExpr(result.toString()))
                    }
                }


                if (lhs.isBooleanLiteralExpr() && rhs.isBooleanLiteralExpr()) {
                    val lval = lhs.asBooleanLiteralExpr().getValue()
                    val rval = rhs.asBooleanLiteralExpr().getValue()
                    // replace the entire binary expression with the result
                    //  replace binary with a new IntegerLiteralExpr
                    var supported = true
                    val result = binary.getOperator() match {
                        case BinaryExpr.Operator.OR => {if (lval || rval) true else false}
                        case BinaryExpr.Operator.AND => {if (lval && rval) true else false}
                        case BinaryExpr.Operator.NOT_EQUALS => {if (lval != rval) true else false}
                        case BinaryExpr.Operator.EQUALS => {if (lval == rval) true else false}
                        case BinaryExpr.Operator.GREATER => {if (lval > rval) true else false}
                        case BinaryExpr.Operator.GREATER_EQUALS => {if (lval >= rval) true else false}
                        case BinaryExpr.Operator.LESS => {if (lval < rval) true else false}
                        case BinaryExpr.Operator.LESS_EQUALS => {if (lval <= rval) true else false}
                        case _ => {supported = false; 0}
                    }
                    // replace this entire AST node binary with a new IntegerLiteralExpr
                    if (supported) {
                        if (result.toString() == "true" || result.toString() == "false")
                            binary.replace(new BooleanLiteralExpr(result.toString().toBoolean))
                        else
                            binary.replace(new IntegerLiteralExpr(result.toString()))
                    }
                }
            }
        }, ())
        return top.toString().strip().stripPrefix("{").stripSuffix("}")
    }

    def test_constant_propagation() = {
        val code = """boolean neg_1 = num_1 < 0;
    assertFalse(neg_1);
    String num_string_1 = Integer.toString(num_1);
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < num_string_1.length());
    assertFalse((true) && neg_1);
    sum_1 += num_string_1.charAt(0) - '0';
    i_1++;
    assertTrue(1 < num_string_1.length());
    assertFalse((false) && neg_1);
    sum_1 += num_string_1.charAt(1) - '0';
    i_1++;
    assertFalse(2 < num_string_1.length());
    assertFalse(sum_1 > 0);
    assertTrue(num_iter_1.hasNext());
    num_1 = num_iter_1.next();
    boolean neg_2 = num_1 < 0;
    assertFalse(neg_2);
    String num_string_2 = Integer.toString(num_1);
    int sum_2 = 0;
    int i_2 = 0;
    assertTrue(0 < num_string_2.length());
    assertFalse((true) && neg_2);
    sum_2 += num_string_2.charAt(0) - '0';
    i_2++;
    assertTrue(1 < num_string_2.length());
    assertFalse((false) && neg_2);
    sum_2 += num_string_2.charAt(1) - '0';
    i_2++;
    assertFalse(2 < num_string_2.length());
    assertFalse(sum_2 > 0);
    assertFalse(num_iter_1.hasNext());
    return 0;
        """
        val constant_propagation = propagate_constant_assignment_forward(code)
        println(constant_propagation)
    }
}