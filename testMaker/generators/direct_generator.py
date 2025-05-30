from testMaker.generators.base_generator import BaseGenerator
from concurrent.futures import ThreadPoolExecutor
import logging

logging.basicConfig(level=logging.INFO)
logging.getLogger("httpx").setLevel(logging.WARNING)

import glob, os, subprocess
class DirectGenerator(BaseGenerator):
    def get_generator_name(self):
        return "direct-generator"
    
    def parse_tests(self, response):
        tests = []
        if "```java" not in response:
            return []
        for test in response.split("```java")[1:]:
            tests += ["```java" + test.strip()]
        
        if len(tests) > self.max_gen:
            return tests[:self.max_gen]
        return tests
    
    # This function generate tests but does not verify them
    def generate_tests(self, benchmark):
        pcids = self.get_pcids(benchmark)
        program_code = self.get_method(benchmark) # this may contain multiple methods
        prompt = self.build_prompt(benchmark, program_code)
        response = self.model.generate(prompt)
        tests = self.parse_tests(response)

        self.write_code(f"{self.generation_dir}/{benchmark}.prompt", prompt)
        self.write_code(f"{self.generation_dir}/{benchmark}.response", response)

        for idx, test_code in enumerate(tests):
            test_path = f"{self.generation_dir}/{benchmark}@{idx}.java"
            self.write_code(test_path, test_code)
        
        return True
    
    def build_example(self):
        return \
"""** Example input **
boolean foo(int num) {
    if (num > 0) return true;
    else if (num < 0) return true;
    else return false;
}
** Example output **
```java
foo(5);
```
```java
foo(-5);
```
```java
foo(0);
```"""

    def build_prompt(self, benchmark, program_code, loop_bound=2):
        return \
f"""You are a symbolic‐execution‐based Java unit‐test generator. Consider loop‑bound={loop_bound}. For recursive functions, depth-bound={loop_bound}. Only enumerate paths in the target method ({benchmark}); ignore branches in other methods and API calls. Generate up to {self.max_gen} tests invoking {benchmark}. Output each invocation as its own triple‑backtick code block. No comments or explanations.

{self.build_example()}

** Program **
{program_code}
""" 
        assert False, "This area should be unreachable"

    def single_test_verifier(self, benchmark):
        pcids = self.get_pcids(benchmark)
        test_paths = glob.glob(f"{self.generation_dir}/{benchmark}@*.java")
        for test_path in test_paths:
            test_code = self.read_code(test_path)
            genid = int(test_path.removesuffix(".java").split("@")[-1])
            for pcid in pcids:
                self.verify_test(benchmark, pcid, test_code, test_path, genid=genid)
        return True
        
    def run_test_generator(self, benchmarks):
        self.clean_dir(self.generation_dir)
        self.clean_logging()
        for idx, benchmark in enumerate(benchmarks):
            logging.info(f"Generating tests for {benchmark} .. {idx}/{len(benchmarks)}")
            self.generate_tests(benchmark)
    
    def run_test_verifier(self, benchmarks):
        logging.info(f"Verifying tests for {len(benchmarks)} benchmarks .. (multithreaded)")
        self.clean_logging()
        with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
            results = list(executor.map(self.single_test_verifier, benchmarks))

        assert len(self.outcome) > 0, "No verification performed"
        self.store_outcome()
    
    def get_final_tests(self, benchmark, max_round=None) -> list[str]:
        test_paths = glob.glob(f"{self.generation_dir}/{benchmark}@*.java")
        tests = []

        for test_path in test_paths:
            test_code = self.read_code(test_path)

            test_code = self.remove_wrapper(test_code)

            tests += [test_code]
            
        tests = self.filter_syntax_error(benchmark, list(set(tests)))

        return tests

    def count_generated_tests(self, benchmarks):
        count = 0
        for benchmark in benchmarks:
            count += len(glob.glob(f"{self.generation_dir}/{benchmark}@*.java"))
        return count