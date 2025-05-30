from testMaker.models import OpenaiModel, Model
from testMaker.rag.document import Document
from testMaker.pathExtraction import PathExtractor
import glob, subprocess, datetime, os, shutil, json
from threading import Lock
import subprocess
from concurrent.futures import ThreadPoolExecutor

import logging

logging.basicConfig(level=logging.INFO)
logging.getLogger("httpx").setLevel(logging.WARNING)

class BaseGenerator:
    def __init__(self, model: Model,
                 program_dir,
                 root_dir,
                 max_gen, # considered total paths
                 nickname="test",
                 path_flatten=True, # [1] whether flatten path
                 show_method_type=False, # [2] whether show method type
                 show_method_doc=False, # [3] whether show method doc
                 show_method_io_pair=False, # [4] whether show input-output pairs
                 refine_loop=None, # [5] #rounds of refine-loop if not none
                 show_history=True, # [6] show the history of the generation during refinement or not
                 propagated=False, # [7] whether to propagate conditions
                 use_dfs=False, # [8] whether to use DFS for path generation
                ):
        """
        Active objects, will be used during the generation process
         errmsg: error message from the last verification
        """

        self.errmsg = None

        self.model = model
        self.max_gen = max_gen # total number of paths to be generated
        self.nickname = nickname
        self.path_flatten = path_flatten #[1]
        self.show_method_type = show_method_type #[2]
        self.show_method_doc = show_method_doc #[3]
        self.show_method_io_pair = show_method_io_pair #[4]
        self.refine_loop = refine_loop #[5]
        self.show_history = show_history #[6]
        self.propagated = propagated #[7]
        self.use_dfs = use_dfs #[8]

        self.root_dir = root_dir
        self.extract_dir = f"{root_dir}/extracted-paths"
        self.generation_dir = f"{root_dir}/generated-tests"
        self.verify_dir = f"{root_dir}/verify-tests"
        self.class_dir = f"{root_dir}/class-files"
        self.program_dir = program_dir

        os.makedirs(root_dir, exist_ok=True)
        os.makedirs(self.verify_dir, exist_ok=True)
        os.makedirs(self.extract_dir, exist_ok=True)
        os.makedirs(self.generation_dir, exist_ok=True)

        assert os.path.exists(program_dir), f"Program directory {program_dir} does not exist"

        # caching, to avoid reloading the same file multiple times
        self.pcondition_cache = dict()
        self.method_cache = dict()
        self.program_cache = dict()

        # RAG, method doc
        if show_method_doc or show_method_io_pair:
            self.doc = Document()
        else:
            self.doc = Document(db_file=None)
        
        self._separator = "/* SEPARATOR */\n"

        # store the verification result, in json format, processed by analytics
        self.outcome = dict()
        self.outcome_path = f"{self.root_dir}/_output.json"
        self.outcome_lock = Lock()

        # store the verification result, in plain text
        self.logger_path = f"{self.root_dir}/_output.log"
        self.logger_lock = Lock()
        self.pc_path = f"{self.root_dir}/_pc.log"

        # store the profiler result, in json format
        self.outcome2 = dict()
        self.outcome2_path = f"{self.root_dir}/_output2.json"
        self.outcome2_lock = Lock()

        self.logger2_path = f"{self.root_dir}/_output2.log"
        self.logger2_lock = Lock()
        self.pc_path2 = f"{self.root_dir}/_pc2.log"
        pass

    """
    Helper functions
    """
    
    def clean_dir(self, dir):
        if os.path.exists(dir):
            shutil.rmtree(dir)
        os.makedirs(dir, exist_ok=True)

    def clear_experiments(self):
        self.clean_dir(self.root_dir)
                
    def logging(self, content):
        with self.logger_lock:
            with open(self.logger_path, "a+") as f_logger:
                f_logger.write(f"[{self.get_time_stamp()}], {content}\n")
                
    def clean_logging(self):
        if os.path.exists(self.logger_path):
            os.remove(self.logger_path)
        if os.path.exists(self.outcome_path):
            os.remove(self.outcome_path)
        return True

    def write_json(self, fpath, data):
        with open(fpath, "w") as f:
            json.dump(data, f)
        return True
    
    def load_json(self, fpath):
        with open(fpath, "r") as f:
            data = json.load(f)
        return data
    
    def read_code(self, fpath):
        with open(fpath, "r") as f:
            lines = f.readlines()
            code = ''.join(lines)
        return code

    def write_code(self, fpath, code):
        with open(fpath, "w") as f:
            f.write(code)
        return code

    def store_outcome(self):
        self.write_json(self.outcome_path, self.outcome)

    def store_outcome2(self):
        self.write_json(self.outcome2_path, self.outcome2)
    
    def load_outcome(self):
        if os.path.exists(self.outcome_path):
            self.outcome = self.load_json(self.outcome_path)
        else:
            self.outcome = dict()
    
    def generator_info(self):
        return "\n".join([f"path-flatten: {self.path_flatten}",
            f"show-method-type: {self.show_method_type}",
            f"show-method-io-pair: {self.show_method_io_pair}",
            f"show-method-doc: {self.show_method_doc}",
            f"generator-name: {self.get_generator_name()}",
            f"model: {self.model.get_name()}",
            f"refine-loop: {self.refine_loop}",
            f"show-history: {self.show_history}",
            f"propagated: {self.propagated}",
        ])
    
    def get_generator_name(self):
        return "base-generator"
    
    def get_time_stamp(self):
        return datetime.datetime.now().strftime("%Y-%m-%d-%H:%M:%S")
    
    def update_outcome(self, benchmark, pcid, 
                       genid=None, 
                       status=None, 
                       errmsg=None, 
                       test_path=None, 
                       errid=None,
                       errcontent=None,
                       test_code=None)-> dict:
        assert status in ["PASS", "UNSAT", "CATCH", "ERROR", "SYNTAX", "NOCALL"]

        with self.outcome_lock:
            if benchmark not in self.outcome:
                self.outcome[benchmark] = dict()
            if pcid not in self.outcome[benchmark]:
                self.outcome[benchmark][pcid] = []

            if genid is None:
                genid = len(self.outcome[benchmark][pcid])

            this_outcome = {
                "genid": genid,
                "status": status,
                "errmsg": errmsg,
                "test_path": test_path,
                "errid": errid,
                "errcontent": errcontent,
                "test_code": test_code,
            }
            self.outcome[benchmark][pcid].append(this_outcome)

        return this_outcome
    

    
    # read content from extracted files related to path (specified by pcid)
    #  the extracted path contains auxiliary information for the path delimited by _separator
    #  when part is None, the whole content is returned
    #  when part is not None, the content is split by _separator and the part-th part is returned
    def get_pcondition(self, pcid, part=None):
        if pcid not in self.pcondition_cache:
            code = self.read_code(f"{self.extract_dir}/{pcid}.java")
            code = code.replace("{ ; }", "{\n<hole>\n}")
            self.pcondition_cache[pcid] = code

        code = self.pcondition_cache[pcid]
        if part is not None:
            assert self._separator in code, f"Invalid code: {pcid} \n Code: {code}"
            code = code.split(self._separator)[part]
            code = code.removeprefix("/*\n").removesuffix("\n*/\n")
            
        return code
    
    # return the propagated condition for a single assertion (specified by errid) in the path (specified by pcid)
    def get_propagated_condition(self, pcid, errid):
        propagated = self.get_pcondition(pcid, 3).strip()
        for line in propagated.split("\n"):
            pound_idx = line.find("#")
            if pound_idx != -1:
                id = line[:pound_idx].strip() # get the id before #
                if id == str(errid):
                    return line[pound_idx + 1:].strip()
        return None
    
    def get_method(self, benchmark):
        if benchmark not in self.method_cache:
            code = self.read_code(f"{self.extract_dir}/{benchmark}.java")
            self.method_cache[benchmark] = code

        return self.method_cache[benchmark]
    
    def get_assertion_id(self, pcid, errmsg):
        if "Path condition is violated:" in errmsg:
            violated = errmsg.split("Path condition is violated:")[1].split("\n")[0]
            errid = violated.strip().split("//")[-1].strip().removeprefix("[").removesuffix("]")
            return int(errid)
        return None
    
    def get_assertion_content(self, pcid, errmsg):
        if "Path condition is violated:" in errmsg:
            violated = errmsg.split("Path condition is violated:")[1].split("\n")[0]
            errcontent = violated.strip().split("//")[0]
            return errcontent
        return None
    
    def get_pcids(self, benchmark):
        paths = list(map(lambda x: x.removesuffix(".java").lower(), \
                        sorted(glob.glob(f"{benchmark}.*.java", root_dir=self.extract_dir))))
        # sort paths according to path_id (numerically, not lexicographically)
        paths = sorted(paths, key=lambda x: int(x.split(".")[-1]))
        # cap the paths to max_gen
        if len(paths) > self.max_gen:
            paths = paths[:self.max_gen]

        return paths

    """
    Actual functions
    """
    
    def remove_wrapper(self, test_code):
        # remove ```java``` and also main function wrapper
        test_code = test_code.strip()
        test_code = test_code.removeprefix("```java")
        test_code = test_code.removesuffix("```")

        if "public static void main(String args[]) {" in test_code:
            # if the test code is a main method, we need to remove it
            test_code = test_code.replace("public static void main(String args[]) {", "")
            test_code = test_code.strip().removesuffix("}")
        if "public static void main(String[] args) {" in test_code:
            # if the test code is a main method, we need to remove it
            test_code = test_code.replace("public static void main(String[] args) {", "")
            test_code = test_code.strip().removesuffix("}")
        return test_code


    # When using direct generation mode,
    #  genid corresponds to the overall generation id
    # When using path-guided generation mode,
    #  genid corresponds to the round of trial
    def verify_test(self, benchmark, pcid, test_code, test_path, genid=None):
        assert not pcid.endswith(".java")

        # LLM returns unsat
        if "UNSAT" in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, UNSAT")
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="UNSAT", genid=genid)
        
        # LLM incorreclty write try-catch statement in the test code
        #  we do not want to verify the test code with try-catch statement
        if "catch" in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, CATCH")
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="CATCH", genid=genid)
        
        test_code = self.remove_wrapper(test_code)

        # The test code does not invoke the target method
        if benchmark not in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, NOCALL")
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="NOCALL", genid=genid)

        code_with_inputs = self.get_pcondition(pcid, 0).replace("<hole>", test_code) + "\n"
        if "assertTrue(false)" in code_with_inputs or "assertFalse(true)" in code_with_inputs:
            self.logging(f"{benchmark}, {pcid}, {test_path}, UNSAT")
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="UNSAT", genid=genid)
        self.write_code(f"{self.verify_dir}/{pcid}.java", code_with_inputs)
        
        command = f"javac -d {self.class_dir} {pcid}.java"
        p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)
        if p.returncode != 0:
            self.logging(f"{benchmark}, {pcid}, {test_path}, SYNTAX, {str(p.stderr)}")
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="SYNTAX", genid=genid, errmsg=p.stderr.decode('utf-8'))
        
        command = f"java -ea {benchmark.upper()}"
        p = subprocess.run(command, shell=True, cwd=self.class_dir, capture_output=True)
        if p.returncode != 0:
            errmsg = p.stderr.decode('utf-8')
            errid = self.get_assertion_id(pcid, errmsg)
            errcontent = self.get_assertion_content(pcid, errmsg)
            self.logging(f"{benchmark}, {pcid}, {test_path}, ERROR, {str(p.stderr)}")
            if self.refine_loop:
                self.errmsg = p.stderr.decode('utf-8')
            return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, status="ERROR", genid=genid, errmsg=errmsg, errid=errid, errcontent=errcontent)

        self.logging(f"{benchmark}, {pcid}, {test_path}, PASS, {str(p.stderr)}")
        return self.update_outcome(benchmark, pcid, test_path=test_path, test_code=test_code, genid=genid, status="PASS")

    # Before running the coverage collector,
    #  (1) generate_tests for all benchmarks
    #  (2) run the verifier to verify all tests
    def path_coverage(self, benchmarks):
        # load verification infomation from the log file
        self.load_outcome()
        if len(self.outcome) == 0:
            logging.warning("No verification information found")
            return None

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
    
    def filter_syntax_error(self, benchmark, tests):
        """
        Return if the test code has syntax error,
        run in parallel by modifying the class name
        """
        benchmark = benchmark.lower()
        clazz = benchmark.upper()

        original_code = self.get_method(benchmark)

        for idx, test in enumerate(tests):
            # replace AA.aa to AA{idx}.aa in the test code
            test = test.replace(f"{clazz}.", f"{clazz}{idx}.")
            combined_code = original_code.strip()
            assert combined_code.endswith("}")


            combined_code = combined_code.replace(f"class {clazz}", f"class {clazz}{idx}")
            combined_code = combined_code.replace(f" {clazz} ", f" {clazz}{idx} ")
            combined_code = combined_code[:-1] + "public void my_test() {" + test + "}\n}"

            self.write_code(f"{self.verify_dir}/{clazz}{idx}.java", combined_code)
        
        # combined compilation to check syntax error
        if False: 
            target_files = " ".join([f"{clazz}{idx}.java" for idx in range(len(tests))])
            command = f"javac -d {self.class_dir} {target_files}"
            logging.debug(f"Running command: {command} in {self.verify_dir}")
            p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)

            if p.returncode != 0:
                logging.warning(f"Syntax error in {benchmark} tests: {str(p.stderr)}")
        else:
            # compile in parallel
            def compile_test(idx):
                command = f"javac -d {self.class_dir} {clazz}{idx}.java"
                logging.debug(f"Running command: {command} in {self.verify_dir}")
                p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)
                if p.returncode != 0:
                    logging.warning(f"Syntax error in {benchmark} test {idx}: {str(p.stderr)}")
                return p.returncode == 0
            with ThreadPoolExecutor() as executor:
                executor.map(compile_test, range(len(tests)))
        # filter out the tests that have syntax error

        new_tests = []
        for idx, test in enumerate(tests):
            if os.path.exists(f"{self.class_dir}/{clazz}{idx}.class"):
                new_tests.append(test)
            else:
                logging.warning(f"test {idx} is removed due to syntax error")
        return new_tests

    def get_final_tests(self, benchmark, max_round=None):
        """
        Return the final tests for the benchmark
        """
        pass

    
    def profile_single_benchmark(self, benchmark, max_round=None):
        tests = self.get_final_tests(benchmark, max_round=max_round)

        profile_output_file = "\"" + benchmark + ".txt\""
        main_code = ""

        for test_code in tests:
            main_code += """
                try {
                    profile_var = "";
                    counter_ABC_0 = 0;
                    {test_code}
                    process_coverage();
                }
                catch (Exception e) { }
                """.replace("{test_code}", test_code)
        
        main_code += \
        """
            try {
                FileWriter writer = new FileWriter({profile_output_file});
                for (String path : path_set)
                    writer.write(path + "\\n");
                // writer.write(path_set.size() + "\\n");
                // writer.write(branch_set.size() + "\\n");
                // writer.write(statement_set.size() + "\\n");
                writer.close();
            }
            catch (Exception e) {
                ;
            }
        """.replace("{profile_output_file}", profile_output_file)
        # insert main_code into the main method of extract_dir/benchmark_.java

        with open(f"{self.extract_dir}/{benchmark}_.java", "r") as f:
            profiler_code = f.read()

        profiler_code = profiler_code.replace("main(String[] args) {", 
                                              "main(String[] args) {\n" + main_code)
        
        with open(f"{self.verify_dir}/{benchmark.upper()}.java", "w") as f:
            f.write(profiler_code)

        command = f"javac -d {self.class_dir} {benchmark.upper()}.java"
        p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)
        if p.returncode != 0:
            self.outcome2[benchmark] = "SYNTAX"
            return None
        
        command = f"java -ea {benchmark.upper()} {benchmark}.txt"
        p = subprocess.run(command, shell=True, cwd=self.class_dir, capture_output=True)
        if p.returncode != 0:
            self.outcome2[benchmark] = "ERROR"
            return None
        else:
            with open(f"{self.class_dir}/{benchmark}.txt", "r") as f:
                lines = f.readlines()
                paths, branches, statements = set(), set(), set()
                for line in lines:
                    if line.strip():
                        paths.add(line.strip())
                        for component in line.strip().split("_"):
                            if component.startswith("T") or component.startswith("F"):
                                branches.add(component)
                            if component.startswith("s"):
                                statements.add(component)
                self.outcome2[benchmark] = {
                    "path coverage": len(paths),
                    "branch coverage": len(branches),
                    "statement coverage": len(statements),
                }

        return self.outcome2[benchmark]
    
    """
    Experiment scripts
    """
    def count_generated_tests(self, benchmarks):
        """
        Count the number of generated tests for each benchmark
        """
        pass

    def run_path_extractor(self, benchmarks):
        self.clean_dir(self.extract_dir)
        benchmarks = list(map(lambda x: x.upper(), benchmarks))
        PathExtractor.runPathExtractor(benchmarks, options=[
            "-flatten-paths",
            f"-max-paths={self.max_gen}",
            f"-program-dir={self.program_dir}",
            f"-extract-dir={self.extract_dir}",
            f"-use-dfs" if self.use_dfs else "",])
        
        for test_path in glob.glob("*.*.java", root_dir=self.extract_dir):
            with open(f"{self.extract_dir}/{test_path}", "r") as f:
                code = f.read()
                assert "/* SEPARATOR */\n" in code, f"Invalid code: {test_path} \n {code}"
        
    def run_test_generator(self, benchmarks):
        pass

    def run_test_verifier(self, benchmarks):
        pass

    def run_test_profiler(self, benchmarks):
        pass

    def run_test_generator_verifier(self, benchmarks):
        self.run_test_generator(benchmarks)
        self.run_test_verifier(benchmarks)
        pass

    def run_stats(self, benchmarks):
        logging.info(f"Running stats analyzers for {self.nickname} ..")
        logging.info(self.path_coverage(benchmarks))
    
    def run_profiler(self, benchmarks):
        self.clean_dir(self.verify_dir)
        self.clean_dir(self.class_dir)
        self.load_outcome()

        logging.info(f"Running profiler for {len(benchmarks)} benchmarks .. (single-threaded)")
        for idx, benchmark in enumerate(benchmarks):
            logging.info(f"Running profiler for {benchmark} .. {idx} / {len(benchmarks)}")
            self.profile_single_benchmark(benchmark)
        self.write_json(self.outcome2_path, self.outcome2)

        statistics = {
            "path coverage": sum([v['path coverage'] for _, v in self.outcome2.items() if "path coverage" in v]),
            "branch coverage": sum([v['branch coverage'] for _, v in self.outcome2.items() if "branch coverage" in v]),
            "statement coverage": sum([v['statement coverage'] for _, v in self.outcome2.items() if "statement coverage" in v]),
            "benchmarks": len(benchmarks),
            "total-tests": self.count_generated_tests(benchmarks),
        }

        self.write_json(self.pc_path2, statistics)

        if self.refine_loop is not None:
            for k in range(1, self.refine_loop):
                self.outcome2 = dict()
                logging.info(f"Running profiler for {k}th round of refinement ..")
                for idx, benchmark in enumerate(benchmarks):
                    logging.info(f"Running profiler for {benchmark} .. {idx} / {len(benchmarks)}")
                    self.profile_single_benchmark(benchmark, max_round=k)
                statistics[f"path coverage@{k}"] = sum([v["path coverage"] for _, v in self.outcome2.items() if "path coverage" in v])
                statistics[f"branch coverage@{k}"] = sum([v["branch coverage"] for _, v in self.outcome2.items() if "branch coverage" in v])
                statistics[f"statement coverage@{k}"] = sum([v["statement coverage"] for _, v in self.outcome2.items() if "statement coverage" in v])
        
        self.write_json(self.pc_path2, statistics)