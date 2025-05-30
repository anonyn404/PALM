from PALM.testMaker.generators.direct_generator import DirectGenerator
from PALM.testMaker.configs import GlobalConfig

import glob, os, json
class PathGenerator(DirectGenerator):
    def get_generator_name(self):
        return "path-generator"
    
    def prompt_output_format(self):
        return \
"""** Output Format **
If satisfiable, output :
```java
// write you code here
```

Only output the code to replace <hole> in the auxiliary test driver:
public static void main(String args[]) { <hole> }

If no input can satisfy the path condition, output:
UNSAT

Only generate a java unit test or UNSAT without any explanation or comments."""

    def _build_prompt(self, benchmark, pcid, history=[]):
        # Java program is removed
        '''** Java Program **
{self.get_method(benchmark)}'''

        prompt = \
f"""** Task Description **
Generate a Java test case to satisfy a specific program path. Given an extracted Java program path, which is a java method containing a sequence of assertTrue or assertFalse statements as path constraints and other statements as path effects. The extracted path includes no loops or if-branches.

** Extracted Program Path **
{self.get_pcondition(pcid, 1)}

{self.get_method_infos(pcid)}

{self.get_run_history(history)}

Write a Java unit test (if the path is reachable) that:
1. Invokes {benchmark} with concrete inputs satisfying the path condition.
2. Focuses solely on satisfying the given path condition, without assumptions about other conditions or outputs.
3. Allows valid edge-case inputs (e.g., nulls, empty strings) if they meet the constraints.
4. Excludes printing, error handling, or unrelated logic.
5. Does not check the returned value from the target function.
""" + self.prompt_output_format()
        return prompt

    def build_prompt(self, benchmark, pcid, history=[]):
        return \
f"""You are a Java test generator. Invoke the target method ({benchmark}) with concrete inputs so that all `assertTrue` and `assertFalse` statements pass.
Allow edge cases (e.g. null, empty) if they meet those constraints. Include no printing, error handling, unrelated logic or return‑value checks.

** Input program **
{self.get_pcondition(pcid, 1)}
{self.get_method_infos(pcid)}
{self.get_run_history(history)}
""" + self.prompt_output_format()
    
    def generate_test(self, benchmark, pcid):
        for simple_unsat_statement in ["assertTrue(false);", "assertFalse(true);"]:
            if simple_unsat_statement in self.get_pcondition(pcid, 1):
                return {"status": "UNSAT"}
            
        if self.refine_loop is None:
            prompt = self.build_prompt(benchmark, pcid)
            GlobalConfig.write_code(f"{self.generation_dir}/{pcid}.prompt", prompt)
            test_code = self.model.generate(prompt)
            GlobalConfig.write_code(f"{self.generation_dir}/{pcid}.java", test_code)
            result = self.verify_test(benchmark, pcid, test_code, f"{self.generation_dir}/{pcid}.java")
            return result
        else:
            history = []
            for round in range(self.refine_loop):
                prompt = self.build_prompt(benchmark, pcid, history)
                GlobalConfig.write_code(f"{self.generation_dir}/{pcid}@{round}.txt", prompt)
                test_code = self.model.generate(prompt)
                GlobalConfig.write_code(f"{self.generation_dir}/{pcid}@{round}.java", test_code)
                result = self.verify_test(benchmark, pcid, test_code, f"{self.generation_dir}/{pcid}@{round}.java")
                if result["status"] in ["UNSAT", "PASS"]:
                    return result
                
                if self.show_history:
                    enhanced_prompt = \
f"""Round {round} generation:
{test_code}
{self.generate_refine_info(pcid, result)}"""
                    history.append(enhanced_prompt)
            return result["status"]

    def generate_refine_info(self, pcid, result):
        if result["status"] == "SYNTAX":
            return f"Error reason: Syntax error."
        if result["status"] == "CATCH":
            return f"Error reason: Do not include try-catch statements in your generated test."
        if result["status"] == "NOCALL":
            return f"Error reason: The target method is not invoked in your generated test."
        if result["status"] in ["ERROR"] and result["errid"] is not None:
            errcontent = result["errcontent"]
            errid = result["errid"]
            if self.propagated:
                hint = self.get_propagated_condition(pcid, result["errid"])
                return f"Error reason: the assertion [{errid}] is not satisfied, {errcontent}\n" + \
                    f"Hint: we now express that assertion directly as a requirement on input variables: {hint}.\n" + \
                    "Please refine your test so that it satisfies this constraint."
            else:
                return f"Error reason: the assertion [{errid}] is not satisfied, {errcontent}"
        
        return f"Error reason: {self.errmsg}"

    def get_signature(self, pcid):
        method_infos = eval(self.get_pcondition(pcid, 2))
        # empty scope => method inv within test class
        method_infos = [
            info
            for info in method_infos
            if "scope" in info and "scope-type" in info
        ]
        for idx in range(len(method_infos)):
            method_infos[idx] = self.doc.enhance(method_infos[idx],
                                    get_type = self.show_method_type,
                                    get_documentation=self.show_method_doc,
                                    get_io_pair=self.show_method_io_pair)
        
        return json.dumps(method_infos)

    def get_method_infos(self, pcid):
        if self.show_method_type:
            signatures = self.get_signature(pcid)
            return \
f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with the type information of scope and arguments.
{signatures}"""
        if self.show_method_doc:
            signatures = self.get_signature(pcid)
            return \
f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with its description.
{signatures}"""
        if self.show_method_io_pair:
            signatures = self.get_signature(pcid)
            return \
f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with some representative input-output pairs.
{signatures}"""
        
        return ""

    def get_run_history(self, history):
        if len(history) > 0:
            condensed_history = "\n".join(history)
            return \
f"""** Feedback **
You have previously generated concrete unit tests, but each of them violated some assertions. Please regenerate a valid unit test based on the feedback provided below.
{condensed_history}"""
        else:
            return ""