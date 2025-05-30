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


object FunctionExtractor {
    def get_method_calls(statements: String, class_name: String, method_name: String): String = {
        val cu = StaticJavaParser.parse(statements)
        val clazz = cu.getClassByName(class_name).get
        val method = clazz.getMethodsByName(method_name).get(0)
        var ret: ListBuffer[String] = ListBuffer.empty[String]
        val top = method.getBody().get

        if (true) {
            return "[]"
        }
        
        top.accept(new VoidVisitorAdapter[Unit] {
            override def visit(methodCall: MethodCallExpr, arg: Unit): Unit = {
                super.visit(methodCall, arg)

                if (methodCall.getName().toString.contains("assert"))
                    return ()
                
                // generate a json.
                //  {"statement": <method-call-expr>, "name": <func-name>, "scope": , "args": []}
                val arguments = methodCall.getArguments()
                var args_type: List[String] = List()
                var args: List[String] = List()
                for (i <- 0 until arguments.size) {
                    val argi = arguments.get(i)
                    val argi_str = s"${argi}".replace("\"", "\\\"")
                    args = args :+ ("\"" + argi_str + "\"")
                    args_type = args_type :+ (s"""\"${argi.calculateResolvedType().describe()}\"""")
                }
                val methodCall_str = s"${methodCall}".replace("\"", "\\\"")
                var cinfo = s"""
                \"statement\": \"${methodCall_str}\", 
                \"name\": \"${methodCall.getName()}\", 
                \"args\": [${args.mkString(", ")}],
                \"args-type\": [${args_type.mkString(", ")}]
                """
                
                if (methodCall.getScope().isPresent()) {
                    val scope = methodCall.getScope().get()
                    val scope_str = s"${scope}".replace("\"", "\\\"")
                    cinfo += s""",
                    \"scope\": \"${scope_str}\",
                    \"scope-type\": \"${scope.calculateResolvedType().describe()}\"
                    """
                }
                // ret += s"${scope_type}${mcall.getName()}(${args_type.mkString(",")})"
                ret += "{" + cinfo + "}"
            }
        }, ())
        //for ((name, idx) <- mapping)
        //    _top.replace(new SimpleName(name), new SimpleName(f"${name}_${idx}"))

        return "[" + ret.toList.mkString(",\n") + "]"
    }
}
