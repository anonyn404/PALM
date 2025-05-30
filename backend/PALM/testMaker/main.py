import os, subprocess, glob, sys, json
import logging, time

from PALM.testMaker.pathExtraction import PathExtractor
from PALM.testMaker.generators import PathGenerator
from PALM.testMaker.models import OpenaiModel

def get_class_name(program: str) -> str:
    lines = program.split("\n")
    for line in lines:
        if "public class" in line:
            return line.strip().split("{")[0].strip().split(" ")[-1]
    return None

def get_err_line(errmsg: str) -> int:
    lines = errmsg.split("\n")
    for line in lines:
        if "error:" in line:
            return int(line.split(":")[1])
    return 1

def read_file(file_path: str) -> str:
    with open(file_path, "r") as f:
        content = f.read()
    return content

def write_file(file_path: str, content: str) -> None:
    with open(file_path, "w") as f:
        f.write(content)
    return None

def generate_paths(program: str, max_paths=100) -> dict:
    """
        run path extractor to generate paths,
         store the code in {workdir}/{program}.java and extracted paths in {workdir}/{pcid}.java

        Return:
            a dictionary
            - key: pcid, the path condition id
            - value: the content from the pcid.java file
    """

    workdir = "../_workdir"

    class_name = get_class_name(program)
    benchmark_name = class_name.lower()

    """
    If {benchmark_name}_paths.json exists in the sample directory,
        we will read the generated result json file and return the result
    """
    if os.path.exists(f"../sample/{benchmark_name}_paths.json"):
        with open(f"../sample/{benchmark_name}_paths.json", "r") as f:
            result = json.load(f)
        if len(result) > 0:
            logging.info(f"Found {benchmark_name}_paths.json, returning the result")
            return result

    # write program into a file
    program_path = f"{workdir}/{class_name}.java"
    with open(program_path, "w") as f:
        f.write(program)

    # run PathExtractor to extract the path
    PathExtractor.logging = f"{workdir}/_path.log"
    PathExtractor.runPathExtractor(benchmarks=[benchmark_name], 
                                    options=["-flatten-paths", 
                                            f"-program-dir={workdir}",
                                            f"-max-paths={max_paths}"],)
    PathExtractor.movePaths(workdir) # PathExtractor generate files in /extracte-paths, we move them to workdir

    # compose the path content into a json file
    path_dict = dict()
    for pcid in glob.glob(f"{benchmark_name}.*.java", root_dir=workdir):
        content = read_file(f"{workdir}/{pcid}")
        pcid = pcid.removesuffix(".java")
        path_dict[pcid] = content
    
    if benchmark_name not in ["test"]:
        # write the result to a json file
        with open(f"../sample/{benchmark_name}_paths.json", "w") as f:
            json.dump(path_dict, f, indent=2)

    return path_dict

def verify_test(program: str, path_id: str, test: str) -> bool:
    """
        verify whether the test can cover the path

        Warning: this function relies that path_id.java is valid in the workdir
        
        Arguments:
            - program: the program code (needed to get the class name)
            - path_id: the path id
            - test: the test code
        Return:
            - a dictionary with the following keys
                - status: "PASS" or "ERROR" or "SYNTAX" or ..
        The sent-in test will not be added in the test history
    """
    workdir = "../_workdir"
    gen = PathGenerator(model=OpenaiModel("o3-mini"),
                        path_flatten=True,
                        extract_dir=workdir,
                        generation_dir=workdir)
    
    class_name = get_class_name(program)
    benchmark_name = class_name.lower()
    
    # load the paths because the result might be preloaded,
    #  so workdir may not contain the desired path_id.java file
    path_dict = generate_paths(program)
    assert path_id in path_dict, f"Path id {path_id} not found in the generated paths"
    write_file(f"{workdir}/{path_id}.java", path_dict[path_id])

    result = gen.verify_test(benchmark=benchmark_name,
                    pcid=path_id,
                    test_code=test,
                    test_path=f"None")
    print(result)

    errid, errline = -1, -1
    if result["status"] == "ERROR" and result["errid"] is not None:
        errid = result["errid"]
        for lineno, line in enumerate(gen.get_pcondition(path_id, 1).strip().split("\n")):
            if line.strip().endswith(f"//[{errid}]"):
                errline = lineno
                print(line)
        assert errline != -1, "cannot find the line number of the failed assert statement"

    return {
        "status": result["status"],
        "errid": errid,
        "errline": errline,
    }

def find_path(program: str, test: str) -> str:
    """
        find the path that the test can cover
        Arguments:
            - program: the program code
            - test: the test code
        Return:
            - the path id, -1 if no path is found
    """

    workdir = "../_workdir"
    gen = PathGenerator(model=OpenaiModel("o3-mini"),
                        path_flatten=True,
                        extract_dir=workdir,
                        generation_dir=workdir)
    
    class_name = get_class_name(program)
    benchmark_name = class_name.lower()
    
    # load the paths because the result might be preloaded,
    #  so workdir may not contain the desired path_id.java file
    path_dict = generate_paths(program)
    assert len(path_dict) > 0, "No path found in the generated paths"

    for pcid, content in path_dict.items():
        write_file(f"{workdir}/{pcid}.java", content)
        result = gen.verify_test(benchmark=benchmark_name,
                        pcid=pcid,
                        test_code=test,
                        test_path=f"None")
        print(result)
        if result["status"] == "PASS":
            return pcid
    
    return "-1"
    
def get_symbolic_tree(paths: list) -> dict:
    """
        assemble generated paths as a symbolic tree
        each node is a dictionary with the following keys, recursively
        - type: "branch" or "statement" or "end" (referring to the end of the program path)
        - true-branch: a child node, the true branch (if type is "branch")
        - false-branch: a child node, the false branch (if type is "branch")
        - next: a child node, the next node (if type is "statement")
        - statement: the statement (if type is "statement")
        - branch: the branch condition (if type is "branch")
        - path-id: the path id (if type is "end")
        - status: whether tests cover this path (if type is "end")
    """

    root = {"type": "statement", "next": None, "statement": "n/a"}
    for pcid, path_detail in paths.items():
        path_variant = path_detail["path-variant"] # assume each path-variant is a single function, well formatted
        generate_tests = path_detail["generated-tests"]
        node, ptr = root, "next" # start from the root
        for line in path_variant.split("\n")[1:-1]: # remove the first and last line, which are the function signature and ending }
            line = line.strip()
            if line.startswith("assert"):
                branch_condition = line[:line.rfind("//")].strip().removesuffix(");")
                branch_condition = branch_condition.removeprefix("assertTrue(")
                branch_condition = branch_condition.removeprefix("assertFalse(")
                is_true = "assertTrue" in line
                if node[ptr] is None:
                    node[ptr] = {"type": "branch", "true-branch": None, "false-branch": None, "branch": branch_condition}
                node = node[ptr]
                ptr = "true-branch" if is_true else "false-branch"
            else:
                if node[ptr] is None:
                    node[ptr] = {"type": "statement", "next": None, "statement": line.strip()}
                node = node[ptr]
                ptr = "next"
        
        # after all the statements, add the end node
        assert node[ptr] is None, "the next node should be None"

        node[ptr] = {"type": "end", "path-id": pcid, "status": generate_tests[-1]["status"]}
        # the status of the last call to LLM is the status of the path
    
    return root["next"]


"""
Warning: this function will change the current working directory to the directory of this file

To get the PALM output, use palm(<program code str>, true, true) to get a dictionary
Arguments:
    -  is_compile: whether to compile the program
    -  is_gen: whether to generate tests
    -  pcid: None => generate for all paths, not None => a specific path (if is_gen is true)
Return:
    a dictionary with the following keys
    - compile: "pass" or "fail"
    - errline: the line number of the error (if compile fails)
    - errmsg: the error message (if compile fails)
    - paths: a dictionary: pcid -> path detail (if compile passes):
        - key: pcid, the path condition id
        - value: a dictionary with the following keys:
            - path-variant: the path condition
            - generated-tests: a list of generated tests
            - genid: the id of the generated test
            - status: the status of the generated test (UNSAT / PASS / FAIL)
            - test: the generated test
            - errmsg: the error message (if any)
            - prompt: the prompt used to generate the test
            - errid: the index of the failed assert statement (if any)
                     errid is an integer, 
                       possible failed statement in path-variant: assertTrue(i_1 < n) //[3]
                       errid = 3 means the 3rd assert statement failed
            - errline: the line number of the error (the lineno of the failed assert statement)
      - tree: the symbolic tree, a recursive strucutre
        each node is a dictionary with the following keys
        see details in the function get_symbolic_tree

Working directory:
    - ../_workdir: the directory where the compiled program and generated tests are stored
    - ../immediate: the directory where the immediate files are stored
    - ../extracted-paths: the directory where the extracted paths are stored
"""
def palm(program: str, is_compile=False, is_gen=False, pcid=None, max_paths=100, refine_loop=5) -> dict:
    os.chdir(os.path.dirname(os.path.abspath(__file__)))

    print("Backend PALM is running...")

    workdir = "../_workdir" # Path to all the intermediate files
    os.makedirs("../immediate", exist_ok=True)
    os.makedirs("../extracted-paths", exist_ok=True)

    # (1) read the given program, get the class name, and write into a file {workdir}/{class_name}.java

    class_name = get_class_name(program)
    if class_name is None:
        return {
            "compile": "fail",
            "errline": 1,
            "errmsg": "cannot find class name"
        }
    
    benchmark_name = class_name.lower()

    """
    If the benchmark name is in the ../sample directory,
        we will read the generated result json file and return the result
    """
    
    if is_compile:
        os.makedirs(workdir, exist_ok=True) 
        for fpath in glob.glob("*", root_dir=workdir):
            os.remove(f"{workdir}/{fpath}")
        program_path = f"{workdir}/{class_name}.java"
        with open(program_path, "w") as f:
            f.write(program)
    
    if os.path.exists(f"../sample/{benchmark_name}.json"):
        with open(f"../sample/{benchmark_name}.json", "r") as f:
            result = json.load(f)
        if result["compile"] == "pass" and len(result["paths"]) > 0:
            logging.info(f"Found {benchmark_name}.json, returning the result")
            print(result)
            return result

    # (2) compile the program
    if is_compile:
        command = f"javac -d {workdir} {class_name}.java"
        logging.info(f"Compiling {class_name}.java")
        p = subprocess.run(command, shell=True, cwd=workdir, capture_output=True)
        if p.returncode != 0:
            return {
                "compile": "fail",
                "errline": get_err_line(str(p.stderr)),
                "errmsg": str(p.stderr)
            }
    
    # (3) run PathExtractor to extract the path
    if is_compile:
        PathExtractor.logging = f"{workdir}/_path.log"
        PathExtractor.runPathExtractor(benchmarks=[benchmark_name], 
                                       options=["-flatten-paths", 
                                                f"-program-dir={workdir}",
                                                f"-max-paths={max_paths}"],)
        PathExtractor.movePaths(workdir) # PathExtractor generate files in /extracte-paths, we move them to workdir

    # (4) run generator to generate tests
    gen = PathGenerator(model=OpenaiModel("o3-mini"),
                        path_flatten=True,
                        extract_dir=workdir,
                        generation_dir=workdir,
                        refine_loop=refine_loop)
    gen.load_outcome()

    if is_gen:
        logging.info("Generating tests...")
        if pcid is not None:
            gen.generate_test(benchmark_name, pcid)
        else:
            pcids = gen.get_pcids(benchmark_name)
            for idx, pcid in enumerate(pcids):
                logging.info(f"Compiling {class_name}.java .. {idx}/{len(pcids)}")
                status = gen.generate_test(benchmark_name, pcid)

    # (5) compose the result
    pc_generateds = {}
    
    if benchmark_name in gen.outcome:
        for pcid, test_runs in gen.outcome[benchmark_name].items():

            pc_generateds[pcid] = {
                "path-variant": gen.get_pcondition(pcid, 1).strip(),
                "generated-tests": []
            }

            # sort test_runs by genid
            test_runs = sorted(test_runs, key=lambda x: x["genid"])
            for test_run in test_runs:
                test = read_file(test_run["test_path"])
                test = test.removesuffix("```").removeprefix("```java").strip()

                prompt_path = test_run["test_path"].replace(".java", ".txt")
                prompt = read_file(prompt_path)
                
                errid, errline = -1, -1
                if test_run["errid"] is not None:
                    errid = test_run["errid"]
                    for lineno, line in enumerate(gen.get_pcondition(pcid, 1).strip().split("\n")):
                        if line.strip().endswith(f"//[{errid}]"):
                            errline = lineno
                    assert errline != -1, "cannot find the line number of the failed assert statement"

                pc_generateds[pcid]["generated-tests"].append({
                    "genid": test_run["genid"],
                    "status": test_run["status"],
                    "test": test,
                    "errmsg": test_run["errmsg"] if test_run["errmsg"] is not None else "",
                    "prompt": prompt,
                    "errid": errid,
                    "errline": errline
                })

    result = {
        "compile": "pass",
        "paths": pc_generateds,
        "tree": get_symbolic_tree(pc_generateds), #symbolic tree
    }

    if benchmark_name not in ["test"]:
        # write the result to a json file
        with open(f"../sample/{benchmark_name}.json", "w") as f:
            json.dump(result, f, indent=2)
    
    return result


if __name__ == "__main__":
    print("This is the entry to PALM")
    traingle_code = """
public class TRIANGLE_TIME {
  public static void triangle_time(int a, int b, int c) {
    int x, y, z;
    if (a <= b) {
      if (b <= c) { x = a; y = b; z = c;}
      else if (c < a) { x = c; y = a; z = b;}
      else { x = a; y = c; z = b;}
    } else {
      if (c > a) { x = b; y = a; z = c;}
      else if (c < b) { x = c; y = b; z = a;}
      else { x = b; y = c; z = a;}
    }
    if (x + y <= z) {
      System.out.println("Not a valid triangle");
    } else {
      System.out.println("A valid triangle");
    }
  }
}
"""
    cutearray_code = """
    public class CUTEARRAY_TIME {
  public static int cutearray_time(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length - 2; i++) {
      if ((a[i] + a[i + 1] + a[i + 2]) % 7 == 0) {
        sum += 1;
        a[i + 1] += 1;
      }
    }
    return sum;
  }
}
"""
    start_time = time.time()
    palm(cutearray_code, is_compile=True, is_gen=True)
    print("Time (min) taken to generate tests: ", (time.time() - start_time) / 60)
    exit(0)
    program = """
import java.util.*;
public class TEST_PALM {
    static int test_palm(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
"""
    program2 = """
public class MYTRI {
    static class IntWrapper {
        int value;
        IntWrapper(int value) {
            this.value = value;
        }
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void mytri(int a, int b, int c) {
        IntWrapper x = new IntWrapper(a);
        IntWrapper y = new IntWrapper(b);
        IntWrapper z = new IntWrapper(c);

        if (x.value > y.value) swap(x, y);
        if (x.value > z.value) swap(x, z);
        if (y.value > z.value) swap(y, z);

        if (x.value + y.value <= z.value) {
            System.out.println("Not a valid triangle");
        } else {
            System.out.println("A valid triangle");
        }
    }
}
"""
    output = palm(program, is_compile=True, is_gen=True)
    print(output)
    
    print("Verifying the generated tests...")
    print(verify_test(program, "test_palm.0", "test_palm(1, 2);"))
    print(verify_test(program, "test_palm.0", "test_palm(2, 1);"))

    print("finding the path...")
    code = """
public class CUTEARRAY {
  public static int cutearray(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length - 2; i++) {
      if ((a[i] + a[i + 1] + a[i + 2]) % 7 == 0) { // B0 
        sum += 1;
        a[i + 1] += 1;
      }
    }
    return sum;
  }
}
"""
    test = "cutearray(new int[]{1, 2, 4, 1});"
    print(find_path(code, test))
    