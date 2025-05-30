from testMaker.generators.base_generator import BaseGenerator
import glob, os, json
import logging

logging.basicConfig(level=logging.INFO)
logging.getLogger("httpx").setLevel(logging.WARNING)
class PathGenerator(BaseGenerator):
    def get_generator_name(self):
        return "path-generator" 

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
            return f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with the type information of scope and arguments.
{signatures}"""
        if self.show_method_doc:
            signatures = self.get_signature(pcid)
            return f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with its description.
{signatures}"""
        if self.show_method_io_pair:
            signatures = self.get_signature(pcid)
            return f"""** Method call description **
Below is a potential list of dictionary which will help you to understand method calls in the path condition.
Each dictionary refers to a method call with some representative input-output pairs.
{signatures}"""
        
        return ""

    def get_run_history(self, history):
        if len(history) > 0:
            condensed_history = "\n".join(history)
            return f"""** Feedback **
You have previously generated concrete unit tests, but each of them violated some assertions. Please regenerate a valid unit test based on the feedback provided below.
{condensed_history}"""
        else:
            return ""
        
    """
    Actual test generation
    """
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
    
    def generate_test_no_refine(self, benchmark, pcid):
        prompt = self.build_prompt(benchmark, pcid)
        self.write_code(f"{self.generation_dir}/{pcid}.prompt", prompt)
        test_code = self.model.generate(prompt)
        self.write_code(f"{self.generation_dir}/{pcid}.java", test_code)
        result = self.verify_test(benchmark, pcid, test_code, f"{self.generation_dir}/{pcid}.java")
        return result["status"]
    
    def generate_test_with_refine(self, benchmark, pcid):
        history = []
        for round in range(self.refine_loop):
            prompt = self.build_prompt(benchmark, pcid, history)
            self.write_code(f"{self.generation_dir}/{pcid}@{round}.txt", prompt)
            test_code = self.model.generate(prompt)
            assert not os.path.exists(f"{self.generation_dir}/{pcid}@{round}.java"), \
                f"File {self.generation_dir}/{pcid}@{round}.java already exists, please check your code."
            self.write_code(f"{self.generation_dir}/{pcid}@{round}.java", test_code)
            result = self.verify_test(benchmark, pcid, test_code, f"{self.generation_dir}/{pcid}@{round}.java", round)
            if result["status"] in ["UNSAT", "PASS"]:
                return result["status"]
            
            if self.show_history:
                enhanced_prompt = f"""Round {round} generation:
{test_code}
{self.generate_refine_info(pcid, result)}"""
                history.append(enhanced_prompt)
        return "ERROR"
    
    def generate_test(self, benchmark, pcid):
        for simple_unsat_statement in ["assertTrue(false);", "assertFalse(true);"]:
            if simple_unsat_statement in self.get_pcondition(pcid, 1):
                return "UNSAT"
            
        if self.refine_loop is None:
            return self.generate_test_no_refine(benchmark, pcid)
        else:
            return self.generate_test_with_refine(benchmark, pcid)
    
    def generate_test_dfs(self, benchmark):
        """
        Generate tests for a benchmark using DFS.
        This function is called by the test generator verifier.
        """
        logging.info(f"Generating tests for {benchmark} using DFS")
        parents, pcids, degree = self.get_symbolic_tree(benchmark)
        
        status = dict()
        # set debug logging
        for pcid in pcids:
            if degree.get(pcid, 0) == 1:
                # if the pcid has only one child and not a leaf node, we can skip it
                logging.debug(f"Skipping {benchmark} {pcid} because it has only one child")
                status[pcid] = status[parents[pcid]] if parents.get(pcid) else "PASS"
                continue

            if pcid in parents and parents[pcid] in status and status[parents[pcid]] != "PASS":
                logging.debug(f"Skipping {benchmark} {pcid} because parent {parents[pcid]} is not PASS")
                status[pcid] = "SKIP"
                continue
            
            logging.debug(f"Generating test for {benchmark} {pcid}")
            status[pcid] = self.generate_test(benchmark, pcid)
            logging.debug(status[pcid])


    def run_test_generator_verifier(self, benchmarks):
        if os.path.exists(self.outcome_path):
            logging.info(f"Loading existing outcome from {self.outcome_path}")
            self.load_outcome()
            return True

        self.clean_logging()
        self.clean_dir(self.generation_dir)
        self.clean_dir(self.verify_dir)
        self.clean_dir(self.class_dir)
        for idx, benchmark in enumerate(benchmarks):
            logging.info(f"Generating tests for {benchmark} .. {idx}/{len(benchmarks)}")
            if self.use_dfs:
                self.generate_test_dfs(benchmark)
            else:
                for pcid in self.get_pcids(benchmark):
                    logging.debug(f"Generating {benchmark} {pcid}")
                    self.generate_test(benchmark, pcid)
        self.store_outcome()
    
    def get_final_tests(self, benchmark, max_round=None) -> list[str]:
        if benchmark not in self.outcome:
            logging.warning(f"No outcome for {benchmark}")
            return []
        
        tests = []
        for pcid, attempts in self.outcome[benchmark].items():
            for attempt in attempts:
                if max_round is not None and attempt["genid"] >= max_round: # genid starts from 0
                    continue
                if attempt["status"] == "PASS":
                    test_path = attempt["test_path"]
                    assert os.path.exists(test_path), f"Test path {test_path} does not exist"
                    with open(test_path, "r") as f:
                        test_code = f.read()
                    
                    test_code = self.remove_wrapper(test_code)
                    tests.append(test_code)
        
        return tests # self.filter_syntax_error(benchmark, tests)
    
    def get_symbolic_tree(self, benchmark):
        """
        return:
            dict: parent of each node
            list: a order following the tree structure, father before children
        """
        parents = dict()
        degree = dict()

        pcids = self.get_pcids(benchmark)
        pcids.sort(key=lambda pcid: len(self.get_pcondition(pcid, 1)))

        with open(f"{self.extract_dir}/{benchmark}.tree", "r") as f:
            for line in f.readlines():
                if line.strip():
                    child, father = line.strip().split("->")
                    child = benchmark + "." + child.strip()
                    father = benchmark + "." + father.strip()
                    if child in pcids and father in pcids:
                        parents[child] = father
                        degree[father] = degree.get(father, 0) + 1
        
        # sort pcids according to their path variant length, by len(get_pcondition(pcid, 1))
        return parents, pcids, degree
    
    def count_generated_tests(self, benchmarks):
        count = 0
        for benchmark in benchmarks:
            count += len(glob.glob(f"{self.generation_dir}/{benchmark}.*@*.java"))
        return count