from PALM.testMaker.configs import GlobalConfig
from PALM.testMaker.models import OpenaiModel
from PALM.testMaker.rag.document import Document

import glob, subprocess, datetime, os
from threading import Lock

class BaseGenerator:
    def __init__(self, model=None,
                 extract_dir=None, 
                 generation_dir=GlobalConfig._generation_dir,
                 program_dir=GlobalConfig._program_dir,
                 verify_dir=GlobalConfig._verify_dir,
                 path_flatten=True, # [1] whether flatten path
                 show_method_type=False, # [2] whether show method type
                 show_method_doc=False, # [3] whether show method doc
                 show_method_io_pair=False, # [4] whether show input-output pairs
                 refine_loop=None, # [5] #rounds of refine-loop if not none
                 show_history=True, # [6] show the history of the generation during refinement or not
                 propagated=False, # [7] whether to propagate conditions
                ):
        
        self.model = model if model else OpenaiModel("gpt-4o-mini")
        self.path_flatten = path_flatten #[1]
        self.show_method_type = show_method_type #[2]
        self.show_method_doc = show_method_doc #[3]
        self.show_method_io_pair = show_method_io_pair #[4]
        self.refine_loop = refine_loop #[5]
        self.show_history = show_history #[6]
        self.propagated = propagated #[7]

        self.extract_dir = extract_dir if extract_dir else \
            GlobalConfig._extract_dir + ("/flattened" if path_flatten else "/unflattened")
        
        self.generation_dir = generation_dir
        self.program_dir = program_dir
        self.verify_dir = verify_dir

        self.pcondition_cache = dict()
        self.method_cache = dict()
        self.program_cache = dict()

        if show_method_doc or show_method_io_pair:
            self.doc = Document()
        else:
            self.doc = Document(db_file=None)

        self.outcome = dict()
        self.outcome_path = f"{generation_dir}/_output.json"
        self.logger_path = f"{generation_dir}/_output.log"
        self.logger_lock = Lock()
        self.outcome_lock = Lock()
        self.pc_path = f"{generation_dir}/_pc.log"
        self.errmsg = None

        self.outcome2 = dict()
        self.outcome2_path = f"{generation_dir}/_output2.json"
        self.outcome2_lock = Lock()
        self.logger2_path = f"{generation_dir}/_output2.log"
        self.logger2_lock = Lock()
        self.pc_path2 = f"{generation_dir}/_pc2.log"
        pass
    
    def logging(self, content):
        with self.logger_lock:
            with open(self.logger_path, "a+") as f_logger:
                f_logger.write(f"[{self.get_time_stamp()}], {content}\n")
                
    def clean_logging(self):
        with self.logger_lock:
            with open(self.logger_path, "w") as f_logger:
                f_logger.write("")
    
    def update_outcome(self, benchmark, pcid, 
                       genid=None, 
                       status=None, 
                       errmsg=None, 
                       test_path=None, 
                       errid=None,
                       errcontent=None)-> dict:
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
                "errcontent": errcontent
            }
            self.outcome[benchmark][pcid].append(this_outcome)

        return this_outcome

    def store_outcome(self):
        GlobalConfig.write_json(self.outcome_path, self.outcome)

    def store_outcome2(self):
        GlobalConfig.write_json(self.outcome2_path, self.outcome2)
    
    def load_outcome(self):
        if os.path.exists(self.outcome_path):
            self.outcome = GlobalConfig.load_json(self.outcome_path)
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
    
    # read content from extracted files related to path (specified by pcid)
    #  the extracted path contains auxiliary information for the path delimited by GlobalConfig._separator
    #  when part is None, the whole content is returned
    #  when part is not None, the content is split by GlobalConfig._separator and the part-th part is returned
    def get_pcondition(self, pcid, part=None):
        if pcid not in self.pcondition_cache:
            code = GlobalConfig.read_code(f"{self.extract_dir}/{pcid}.java")
            code = code.replace("{ ; }", "{\n<hole>\n}")
            self.pcondition_cache[pcid] = code

        code = self.pcondition_cache[pcid]
        if part is not None:
            assert GlobalConfig._separator in code, f"Invalid code: {code}"
            code = code.split(GlobalConfig._separator)[part]
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
            code = GlobalConfig.read_code(f"{self.extract_dir}/{benchmark}.java")
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
    
    # When using direct generation mode,
    #  genid corresponds to the overall generation id
    # When using path-guided generation mode,
    #  genid corresponds to the round of trial
    def verify_test(self, benchmark, pcid, test_code, test_path, genid=None):
        assert not pcid.endswith(".java")

        # LLM returns unsat
        if "UNSAT" in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, UNSAT")
            return self.update_outcome(benchmark, pcid, test_path=test_path, status="UNSAT", genid=genid)
        
        # LLM incorreclty write try-catch statement in the test code
        #  we do not want to verify the test code with try-catch statement
        if "catch" in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, CATCH")
            return self.update_outcome(benchmark, pcid, test_path=test_path, status="CATCH", genid=genid)
        
        test_code = test_code.strip()
        test_code = test_code.removeprefix("```java")
        test_code = test_code.removesuffix("```")

        # The test code does not invoke the target method
        if benchmark not in test_code:
            self.logging(f"{benchmark}, {pcid}, {test_path}, NOCALL")
            return self.update_outcome(benchmark, pcid, test_path=test_path, status="NOCALL", genid=genid)

        code_with_inputs = self.get_pcondition(pcid, 0).replace("<hole>", test_code) + "\n"
        GlobalConfig.write_code(f"{self.verify_dir}/{pcid}.java", code_with_inputs)
        
        command = f"javac -d /tmp {pcid}.java"
        p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)
        if p.returncode != 0:
            self.logging(f"{benchmark}, {pcid}, {test_path}, SYNTAX, {str(p.stderr)}")
            return self.update_outcome(benchmark, pcid, test_path=test_path, status="SYNTAX", genid=genid, errmsg=p.stderr.decode('utf-8'))
        
        command = f"java -ea {benchmark.upper()}"
        p = subprocess.run(command, shell=True, cwd="/tmp", capture_output=True)
        if p.returncode != 0:
            errmsg = p.stderr.decode('utf-8')
            errid = self.get_assertion_id(pcid, errmsg)
            errcontent = self.get_assertion_content(pcid, errmsg)
            self.logging(f"{benchmark}, {pcid}, {test_path}, ERROR, {str(p.stderr)}")
            if self.refine_loop:
                self.errmsg = p.stderr.decode('utf-8')
            return self.update_outcome(benchmark, pcid, test_path=test_path, status="ERROR", genid=genid, errmsg=errmsg, errid=errid, errcontent=errcontent)

        self.logging(f"{benchmark}, {pcid}, {test_path}, PASS, {str(p.stderr)}")
        return self.update_outcome(benchmark, pcid, test_path=test_path, genid=genid, status="PASS")
    
    def get_pcids(self, benchmark):
        paths = list(map(lambda x: x.removesuffix(".java").lower(), \
                        sorted(glob.glob(f"{benchmark}.*.java", root_dir=self.extract_dir))))
        return paths


    def run_profiler(self, benchmark):
        test_paths = glob.glob(f"{self.generation_dir}/{benchmark}@*.java")
        main_code = ""
        for test_path in test_paths:
            test_code = GlobalConfig.read_code(test_path)

            test_code = test_code.strip()
            test_code = test_code.removeprefix("```java")
            test_code = test_code.removesuffix("```")

            main_code += \
                """
                try {
                    profile_var = "";
                    {test_code}
                    process_coverage(profile_var);
                }
                catch (Exception e) { }
                """.replace("{test_code}", test_code)
        
        main_code += \
        """
            try {
                FileWriter writer = new FileWriter({coverage_file});
                writer.write(path_set.size() + "\\n");
                writer.write(branch_set.size() + "\\n");
                writer.write(statement_set.size() + "\\n");
                writer.close();
            }
            catch (Exception e) {
                ;
            }
        """.replace("{coverage_file}", f"\"{benchmark}.txt\"")
        # insert main_code into the main method of extract_dir/benchmark_.java

        with open(f"{self.extract_dir}/{benchmark}_.java", "r") as f:
            profiler_code = f.read()

        profiler_code = profiler_code.replace("main(String[] args) {", 
                                              "main(String[] args) {\n" + main_code)
        
        with open(f"{self.verify_dir}/{benchmark.upper()}.java", "w") as f:
            f.write(profiler_code)

        command = f"javac -d /tmp {benchmark.upper()}.java"
        p = subprocess.run(command, shell=True, cwd=self.verify_dir, capture_output=True)
        if p.returncode != 0:
            self.outcome2[benchmark] = "SYNTAX"
            return None
        
        command = f"java -ea {benchmark.upper()} {benchmark}.txt"
        p = subprocess.run(command, shell=True, cwd="/tmp", capture_output=True)
        if p.returncode != 0:
            self.outcome2[benchmark] = "ERROR"
            return None
        else:
            with open(f"/tmp/{benchmark}.txt", "r") as f:
                lines = f.readlines()
                self.outcome2[benchmark] = {
                    "path coverage": int(lines[0].strip()),
                    "branch coverage": int(lines[1].strip()),
                    "statement coverage": int(lines[2].strip())
                }