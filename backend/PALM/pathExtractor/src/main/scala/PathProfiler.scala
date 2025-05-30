/*
This a function profiler that turns a single Java program into a function profiler.
We insert a print statement before each statement in the function.
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
import java.util.List
import java.util.ArrayList

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import Configs._ // import the configs

object PathProfiler {
    val coverage_computer: String =
        f"""
    static void process_coverage(String profile) {
        // process the profiling info of a given test
        if (profile.length() == 0) return ;

        String[] parts = profile.split("_");
        HashMap<String, Integer> occurance = new HashMap<>();
        for (String part: parts)
        if (part.length() > 0) {
            if (occurance.containsKey(part)) {
                int count = occurance.get(part) + 1;
                // if (count > ${_loop_iter_bound}) return ;
                // if (count > ${_recursive_iter_bound}) return ;
                occurance.put(part, count);
            }
            else {
                occurance.put(part, 1);
            }
        }

        path_set.add(profile);

        for (String part: parts)
        if (part.length() > 0) {
            if (part.startsWith("b")) {
                branch_set.add(part);
            }
            else {
                statement_set.add(part);
            }
        }
    }
        """
    def path_profiler(function: String): String = {
        val top = StaticJavaParser.parseMethodDeclaration(function)

        var statement_id = 0
        top.accept(new VoidVisitorAdapter[Unit] {
            // add a print statement before each statement in block
            override def visit(node: BlockStmt, arg: Unit): Unit = {
                val stmts = node.getStatements()
                // traverse the statements in reverse order
                for (i <- stmts.size() - 1 to 0 by -1) {
                    statement_id += 1
                    val printStatement = StaticJavaParser.parseStatement(
                        s"""${_profile_var} += \"_${statement_id}\";"""
                    )
                    val errorStatement = StaticJavaParser.parseStatement(
                        s"""if (${_profile_var}.length() > 1000) throw new Exception("Profiler string too long");"""
                    )
                    stmts.get(i).accept(this, arg)
                    stmts.add(i, printStatement)
                    stmts.add(i, errorStatement)
                }
            }
            // turn a single statement for then/else branch into a block statement
            override def visit(node: IfStmt, arg: Unit): Unit = {
                val thenStmt = node.getThenStmt()
                val elseStmt = node.getElseStmt()

                if (true) {
                    if (!thenStmt.isBlockStmt()) {
                        val block = new BlockStmt()
                        block.addStatement(thenStmt)
                        node.setThenStmt(block)
                    }
                    node.getThenStmt().accept(this, arg)
                }

                if (elseStmt.isPresent()) {
                    if (!elseStmt.get().isBlockStmt()) {
                        val block = new BlockStmt()
                        block.addStatement(elseStmt.get())
                        node.setElseStmt(block)
                    }
                    node.getElseStmt().get().accept(this, arg)
                }
            }
            // turn a single statement for while body into a block statement
            override def visit(node: WhileStmt, arg: Unit): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, arg)
            }
            // turn a single statement for do while body into a block statement
            override def visit(node: DoStmt, arg: Unit): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, arg)
            }
            // turn a single statement for for body into a block statement
            override def visit(node: ForStmt, arg: Unit): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, arg)
            }
            // turn a single statement for foreach body into a block statement
            override def visit(node: ForEachStmt, arg: Unit): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, arg)
            }
            // add profiler for each stmt in SwithchEntry
            override def visit(node: SwitchEntry, arg: Unit): Unit = {
                val stmts = node.getStatements()
                // traverse the statements in reverse order
                for (i <- stmts.size() - 1 to 0 by -1) {
                    statement_id += 1
                    val printStatement = StaticJavaParser.parseStatement(
                        s"""${_profile_var} += \"_${statement_id}\";"""
                    )
                    val errorStatement = StaticJavaParser.parseStatement(
                        s"""if (${_profile_var}.length() > 1000) throw new Exception("Profiler string too long");"""
                    )
                    stmts.get(i).accept(this, arg)
                    stmts.add(i, printStatement)
                    stmts.add(i, errorStatement)
                }
            }
        }, ())

        return top.toString()
    }

    /* Replace the implementation of a method named method_name,
     with a profiler from path_profiler,
     put a empty main method in the class
    */
    def entire_path_profiler(program: String, method_name: String): String = {
        val cu = StaticJavaParser.parse(program)
        val class_name = method_name.toUpperCase
        val clazz = cu.getClassByName(class_name).get
        val method = clazz.getMethodsByName(method_name).get(0)
        // remove the original method
        clazz.remove(method)
        // remove the original main method
        val mains = clazz.getMethodsByName("main")
        if (mains.size() > 0) {
            clazz.remove(mains.get(0))
        }
        // remove package declaration
        val packageDecl = cu.getPackageDeclaration()
        if (packageDecl.isPresent()) {
            cu.remove(packageDecl.get())
        }
        // insert import java.io.* java.util.*
        val imports = cu.getImports()
        val import1 = StaticJavaParser.parseImport("import java.io.*;")
        val import2 = StaticJavaParser.parseImport("import java.util.*;")

        if (!imports.contains(import1)) {
            cu.addImport(import1)
        }
        if (!imports.contains(import2)) {
            cu.addImport(import2)
        }

        // add the coverage_computer
        val coverage_computer_decl = StaticJavaParser.parseMethodDeclaration(coverage_computer)
        clazz.addMember(coverage_computer_decl)
        
        // add the profiler to the method
        val newMethod = path_profiler(method.toString())
        val newMethodDecl = StaticJavaParser.parseMethodDeclaration(newMethod)
        // add throw exception to the method
        newMethodDecl.getThrownExceptions().addLast(
            StaticJavaParser.parseClassOrInterfaceType("Exception")
        )
        clazz.addMember(newMethodDecl)
        // add the main method
        val newMain = StaticJavaParser.parseMethodDeclaration(
            s"""
            public static void main(String[] args) {
                
            }
            """
        )
        clazz.addMember(newMain)

        
        // add declaration for profile_var, helper ds
        val profile_var = StaticJavaParser.parseBodyDeclaration(
            s"""static String ${_profile_var} = "";"""
        )
        clazz.addMember(profile_var)
        val path_set_decl = StaticJavaParser.parseBodyDeclaration(
            s"""static Set<String> path_set = new HashSet<>();"""
        )
        val branch_set_decl = StaticJavaParser.parseBodyDeclaration(
            s"""static Set<String> branch_set = new HashSet<>();"""
        )
        val statement_set_decl = StaticJavaParser.parseBodyDeclaration(
            s"""static Set<String> statement_set = new HashSet<>();"""
        )
        clazz.addMember(path_set_decl)
        clazz.addMember(branch_set_decl)
        clazz.addMember(statement_set_decl)
        return cu.toString()
    }
    def test_path_profiler() = {
        val function = """
            public static boolean triples_sum_to_zero(int[] numbers) {
                for (int i = 0; i < numbers.length; i += 1) {
                    for (int j = i + 1; j < numbers.length; j += 1) {
                        for (int k = j + 1; k < numbers.length; k += 1) {
                            if (numbers[i] + numbers[j] + numbers[k] == 0)
                                return true;
                        }
                    }
                }

                if (a > 0) ;
                else ;

                for (; true; ) ;

                if (1 > 2) print("a");
                return false;

                switch (a) {
                    case 1:
                        System.out.println("a");
                        break;
                    case 2:
                        System.out.println("b");
                        break;
                    default:
                        System.out.println("c");
                }
            }
        """
        print(path_profiler(function))
    }
}
