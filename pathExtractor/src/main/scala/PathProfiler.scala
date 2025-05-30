/*
This a function profiler that turns a single Java program into a function profiler.
We insert a print statement before each statement in the function.

Previously, this method will generate a profiled program that will print out the path coverage / line coverage directly,
now we only print out the profiled stream for each test case, the actual coverage will be computed later in the testMaker module.
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

import Configs._ // import the configs

object PathProfiler {
    val coverage_computer: String =
        f"""
    static void process_coverage() {
        if (${_profile_var}.length() == 0) return ;
        path_set.add(${_profile_var});
        ${_profile_var} = "";
    }
        """
    
    def profile_block(tag: String): Statement = {
        return StaticJavaParser.parseStatement(s"""
            {
            ${_profile_var} += "_${tag}";
            if (${_profile_var}.length() > 10000) throw new Exception("Profiler string too long");
            }
            """
        )
    }
    def profile_counter(id: Int): Statement = {
        return StaticJavaParser.parseStatement(s"""
            int counter_ABC_${id} = 0;
            """
        )
    }
    def profiler_increase_counter(id: Int): Statement = {
        return StaticJavaParser.parseStatement(s"""
            {
                counter_ABC_${id} += 1;
                if (counter_ABC_${id} > 2) throw new Exception("Out of loop-bound. Invalid path.");
            }
            """
        )
    }
    var statement_id = 0
    def path_profiler(function: String): String = {
        val top = StaticJavaParser.parseMethodDeclaration(function)
        
        top.accept(new VoidVisitorAdapter[Int] {
            // add a print statement before each statement in block
            override def visit(node: BlockStmt, pid: Int): Unit = {
                val stmts = node.getStatements()
                // traverse the statements in reverse order
                // add a statement tag for each statement
                for (i <- stmts.size() - 1 to 0 by -1) {
                    statement_id += 1
                    val id = statement_id
                    stmts.get(i).accept(this, id)
                    stmts.add(i, profile_block("s" + id)) // statement tag: s{id}
                    stmts.add(i, profile_counter(id)) // create counter: counter_ABC_{id}
                }

                // add a loop bound check for each counter
                stmts.add(0, profiler_increase_counter(pid))
            }
            // turn a single statement for then/else branch into a block statement
            override def visit(node: IfStmt, pid: Int): Unit = {
                val thenStmt = node.getThenStmt()
                val elseStmt = node.getElseStmt()

                if (true) {
                    if (!thenStmt.isBlockStmt()) {
                        val block = new BlockStmt()
                        block.addStatement(thenStmt)
                        node.setThenStmt(block)
                    }
                    node.getThenStmt().accept(this, pid)

                    // add a branch predicate tag for each then branch
                    statement_id += 1
                    node.getThenStmt().asInstanceOf[BlockStmt].addStatement(
                        0, profile_block("T" + statement_id)
                    ) // branch predicate tag: T{id}
                }

                if (elseStmt.isPresent()) {
                    if (!elseStmt.get().isBlockStmt()) {
                        val block = new BlockStmt()
                        block.addStatement(elseStmt.get())
                        node.setElseStmt(block)
                    }
                    node.getElseStmt().get().accept(this, pid)


                    // add a branch predicate tag for each else branch
                    statement_id += 1
                    val id = statement_id
                    node.getElseStmt().get().asInstanceOf[BlockStmt].addStatement(
                        0, profile_block("F" + statement_id)
                    ) // branch predicate tag: F{id}
                }
            }
            // turn a single statement for while body into a block statement
            override def visit(node: WhileStmt, pid: Int): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, pid)
            }
            // turn a single statement for do while body into a block statement
            override def visit(node: DoStmt, pid: Int): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, pid)
            }
            // turn a single statement for for body into a block statement
            override def visit(node: ForStmt, pid: Int): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, pid)
            }
            // turn a single statement for foreach body into a block statement
            override def visit(node: ForEachStmt, pid: Int): Unit = {
                val body = node.getBody()
                if (!body.isBlockStmt()) {
                    val block = new BlockStmt()
                    block.addStatement(body)
                    node.setBody(block)
                }
                node.getBody().accept(this, pid)
            }
            // add profiler for each stmt in SwithchEntry
            override def visit(node: SwitchEntry, pid: Int): Unit = {
                val stmts = node.getStatements()
                // traverse the statements in reverse order
                for (i <- stmts.size() - 1 to 0 by -1) {
                    statement_id += 1
                    val id = statement_id
                    stmts.get(i).accept(this, id)
                    stmts.add(i, profile_block("s" + id)) // statement tag: s{id}
                }
            }
        }, 0)

        return top.toString()
    }

    /* Replace the implementation of a method named method_name,
     with a profiler from path_profiler,
     put a empty main method in the class
    */
    def entire_path_profiler(cu: CompilationUnit, clazz: ClassOrInterfaceDeclaration, symbolic_methods: List[String]): String = {
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

        // remove the original method
        statement_id = 0 // reset the statement id
        for (method_name <- symbolic_methods) {
            val method = clazz.getMethodsByName(method_name).get(0)
            val method_content = method.toString()
            clazz.remove(method)
            val newMethod = path_profiler(method_content)
            val newMethodDecl = StaticJavaParser.parseMethodDeclaration(newMethod)
            // add the profiler to the method
            // add throw exception to the method
            newMethodDecl.getThrownExceptions().addLast(
                StaticJavaParser.parseClassOrInterfaceType("Exception")
            )
            clazz.addMember(newMethodDecl)
        }
        
        // add the coverage_computer
        val coverage_computer_decl = StaticJavaParser.parseMethodDeclaration(coverage_computer)
        clazz.addMember(coverage_computer_decl)
        
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
        val target_profile_counter = StaticJavaParser.parseBodyDeclaration(
            s"""static int counter_ABC_0 = -1000000;"""
        )
            // to track the execution times of the focal method
        clazz.addMember(profile_var)
        clazz.addMember(target_profile_counter)
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
        // clazz.addMember(branch_set_decl)
        // clazz.addMember(statement_set_decl)
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
