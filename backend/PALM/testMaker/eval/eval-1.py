from PALM.testMaker.generators.direct_generator import DirectGenerator
from PALM.testMaker.generators.path_generator import PathGenerator
from PALM.testMaker.generators.smt_generator import SMTGenerator
from PALM.testMaker.configs import GlobalConfig
from concurrent.futures import ThreadPoolExecutor
from PALM.testMaker.models import OpenaiModel
import os, sys, time, glob, ast

def run_direct(run, benchmarks, id, model_name):
    gen = DirectGenerator(path_flatten=True,
                          show_method_type=False,
                          show_method_doc=False,
                          show_method_io_pair=False,
                          generation_dir=f"{GlobalConfig._generation_dir}/direct-{model_name}-{id}",
                          refine_loop=None,
                          model=OpenaiModel(model_name))
    if run:
        replay = False
        if replay:
            # Keep Code LM generated tests, but only rerun to compute path coverage.
            gen.clean_logging()

            with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
                results = executor.map(gen.replay, GlobalConfig._benchmarks)
        else:
            gen.clean_dir()
            for benchmark in benchmarks:
                gen.generate_test(benchmark)

            gen.clean_logging()
            with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
                results = executor.map(gen.replay, GlobalConfig._benchmarks)

    print(gen.statistics(benchmarks))

def run_path(run, benchmarks, id, model_name, mode,
             show_history=True,
             refine_loop=None,
             wkp=False):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=False,
                        show_method_io_pair=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path-{mode}-{model_name}-{id}",
                        refine_loop=refine_loop,
                        show_history=show_history,
                        propagated=wkp,
                        model=OpenaiModel(model_name))
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))
    return gen

def run_exprs(run):
    benchmarks = GlobalConfig._benchmarks
    print('benchmarks', len(benchmarks))
    for id in [0]:
        print("iteration", id, time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
        run_direct(run, benchmarks, id, "gpt-4o")
        run_path(run, benchmarks, id, "gpt-4o", "NoHistory", show_history=False, refine_loop=5)

    return True

def get_coverage(folder): # return a set of path_ids
    path_ids = set()
    with open(f"{folder}/_stats.txt", "r") as f:
        lines = f.readlines()
        for line in lines:
            if not line.strip(): continue
            for pcid in line.strip().split(",")[5:] :
                # format: benchmark, #path coverage, #pcs, #runnable tests, #generated tests, <path ids>
                path_ids.add(pcid)
    return path_ids

def diff_coverage(folders1, folders2):
    coverage1 = set()
    for folder1 in folders1:
        coverage1.update(get_coverage(folder1))
    coverage2 = set()
    for folder2 in folders2:
        coverage2.update(get_coverage(folder2))
    diff = coverage1.difference(coverage2)

    print(f"Coverage difference: {len(diff)}")
    print(f"Path IDs in {folder1} but not in {folder2}:")
    def get_covered_folders(pcid):
        folders = set()
        for folder1 in folders1:
            if pcid in get_coverage(folder1):
                folders.add(folder1)
        return folders
    def get_path(pcid):
        return f"../extracted-paths/flattened/{pcid}.java"
    def get_failure(pcid, folders):
        failures = []
        for folder in folders:
            with open(f"{folder}/chatsym.log", "r") as f:
                lines = f.readlines()
                for line in lines:
                    if not line.strip(): continue
                    parsed = []
                    for idx in range(5):
                        pos = line.find(",")
                        parsed.append(line[:pos].strip())
                        line = line[pos+1:]
                    parsed.append(line.strip())
                    
                    if parsed[2] != pcid:
                        continue

                    if "Path condition is violated:" in parsed[-1]:
                        content = ast.literal_eval(parsed[-1].strip()).decode('utf-8')
                        failureid = content.split("\n")[0].strip().split("//")[-1].strip()
                        failures.append(failureid.removeprefix("[").removesuffix("]"))
                    else:
                        failures.append(parsed[-2])

        return failures
    
    for path_id in diff:
        print(path_id, get_path(path_id), get_covered_folders(path_id))
        print(get_failure(path_id, folders2))
    return diff

if __name__ == "__main__":
    os.chdir(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))  # Ensure we are in the root directory
    run_exprs(False)
    #folders1 = glob.glob("../generated-inputs/path+refine-pro-[0-9]*")
    #folders2 = glob.glob("../generated-inputs/path+refine-[0-9]*")
    #diff_coverage(folders1, folders2)