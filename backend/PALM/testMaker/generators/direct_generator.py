from PALM.testMaker.generators.base_generator import BaseGenerator
from PALM.testMaker.configs import GlobalConfig

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
        
        # return at most {num_tests} tests
        if len(tests) > GlobalConfig._max_gen:
            return tests[:GlobalConfig._max_gen]
        return tests
    
    # This function generate tests but does not verify them
    def generate_tests(self, benchmark):
        pcids = self.get_pcids(benchmark)
        program_code = self.get_method(benchmark) # this may contain multiple methods
        prompt = self.build_prompt(benchmark, program_code)
        response = self.model.generate(prompt)
        tests = self.parse_tests(response)

        GlobalConfig.write_code(f"{self.generation_dir}/{benchmark}.prompt", prompt)
        GlobalConfig.write_code(f"{self.generation_dir}/{benchmark}.response", response)

        for idx, test_code in enumerate(tests):
            test_path = f"{self.generation_dir}/{benchmark}@{idx}.java"
            GlobalConfig.write_code(test_path, test_code)
        
        return True

    def clean_dir(self):
        os.makedirs(self.generation_dir, exist_ok=True)
        for fpath in glob.glob("*", root_dir=self.generation_dir):
            os.remove(f"{self.generation_dir}/{fpath}")

    # Before running the coverage collector,
    #  (1) generate_tests for all benchmarks
    #  (2) run the verifier to verify all tests
    def path_coverage(self, benchmarks):
        # load verification infomation from the log file
        self.load_outcome()

        path_coverage = dict()
            
        for benchmark, b_infos in self.outcome.items():
            assert benchmark in self.outcome

            path_coverage[benchmark] = {
                "path coverage": [],
                "total path": [],
            }
            if self.refine_loop is not None:
                for k in range(self.refine_loop):
                    path_coverage[benchmark][f"path coverage@{k}"] = []

            for pcid, p_info in b_infos.items():
                # p_info is a list of verification info
                path_coverage[benchmark]["total path"].append(pcid)
                if self.refine_loop is not None:
                    for k in range(self.refine_loop):
                        if any([info["status"] == "PASS" for info in p_info if info["genid"] <= k]):
                            path_coverage[benchmark][f"path coverage@{k}"].append(pcid)
                if any([info["status"] == "PASS" for info in p_info]):
                    path_coverage[benchmark]["path coverage"].append(pcid)

        statistics = {
            "path coverage": sum([len(v["path coverage"]) for v in path_coverage.values()]),
            "total path": sum([len(v["total path"]) for v in path_coverage.values()]),
            "path coverage rate": sum([len(v["path coverage"]) for v in path_coverage.values()]) / sum([len(v["total path"]) for v in path_coverage.values()]),
            "total benchmark": len(benchmarks),
        }
        if self.refine_loop is not None:
            for k in range(self.refine_loop):
                statistics[f"path coverage@{k}"] = sum([len(v[f"path coverage@{k}"]) for v in path_coverage.values()])

        with open(self.pc_path, "w") as f:
            print(statistics, file=f)
                
        return statistics
    
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

    def build_prompt(self, benchmark, program_code, num_tests=GlobalConfig._max_gen):
        return \
f"""You are a symbolic‐execution‐based Java unit‐test generator. Consider loop‑bound=2. Only enumerate paths in the target method ({benchmark}); ignore branches in other methods and API calls. Generate up to {num_tests} tests invoking {benchmark}. Output each invocation as its own triple‑backtick code block. No comments or explanations.

{self.build_example()}

** Program **
{program_code}
""" 
        assert False, "This area should be unreachable"

    def replay(self, benchmark):
        pcids = self.get_pcids(benchmark)
        test_paths = glob.glob(f"{self.generation_dir}/{benchmark}@*.java")
        for test_path in test_paths:
            test_code = GlobalConfig.read_code(test_path)
            genid = int(test_path.removesuffix(".java").split("@")[-1])
            for pcid in pcids:
                self.verify_test(benchmark, pcid, test_code, test_path, genid=genid)