from PALM.testMaker.generators.direct_generator import DirectGenerator
from PALM.testMaker.generators.path_generator import PathGenerator
from PALM.testMaker.configs import GlobalConfig
from concurrent.futures import ThreadPoolExecutor
from PALM.testMaker.models import OpenaiModel
import logging

logging.basicConfig(level=logging.INFO)
logging.getLogger("httpx").setLevel(logging.WARNING)
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
        if True:
            gen.clean_dir()
            for idx, benchmark in enumerate(benchmarks):
                logging.info(f"Generating tests for {benchmark} .. {idx}/{len(benchmarks)}")
                gen.generate_tests(benchmark)

        logging.info(f"Verifying tests for {len(benchmarks)} benchmarks .. (multithreaded)")
        gen.clean_logging()
        with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
            results = list(executor.map(gen.replay, benchmarks))

        assert len(gen.outcome) > 0, "No verification performed"
        gen.store_outcome()

    logging.info(f"direct-{model_name}-{id}")
    logging.info(gen.path_coverage(benchmarks))
    return gen

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
        for idx, benchmark in enumerate(benchmarks):
            logging.info(f"Generating tests for {benchmark} .. {idx}/{len(benchmarks)}")
            for pcid in gen.get_pcids(benchmark):
                logging.debug(f"Generating {benchmark} {pcid}")
                gen.generate_test(benchmark, pcid)
        gen.store_outcome()

    logging.info(f"path-{mode}-{model_name}-{id}")
    logging.info(gen.path_coverage(benchmarks))
    return gen

def run_exprs(run):
    benchmarks = GlobalConfig._benchmarks
    print('benchmarks', len(benchmarks))
    for id in [10]:
        print("iteration", id, time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

        #run_direct(run, benchmarks=benchmarks, id=id, model_name="gpt-4o-mini")
        run_direct(run, benchmarks=benchmarks, id=id, model_name="o3-mini")
        #run_path(run, benchmarks=benchmarks, id=id, model_name="gpt-4o-mini", mode="normal", wkp=False, refine_loop=5)
        #run_path(run, benchmarks=benchmarks, id=id, model_name="o3-mini", mode="normal", wkp=False, refine_loop=5)
        #run_path(run, benchmarks=benchmarks, id=id, model_name="gpt-4o-mini", mode="propagated", wkp=True, refine_loop=5)

    return True

if __name__ == "__main__":
    os.chdir(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))  # Ensure we are in the root directory
    #run_exprs(True)
    if True:
        gen = run_direct(False, benchmarks=GlobalConfig._benchmarks, id=10, model_name="o3-mini")
        
        #with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
        #    results = list(executor.map(gen.run_profiler, GlobalConfig._benchmarks))
        for idx, benchmark in enumerate(GlobalConfig._benchmarks):
            logging.info(f"Running profiler for {benchmark} .. {idx} / {len(GlobalConfig._benchmarks)} #pc: {sum([v['path coverage'] for k, v in gen.outcome2.items()])}")
            gen.run_profiler(benchmark)
        print(gen.outcome2)
        print(sum([v['path coverage'] for k, v in gen.outcome2.items()]))
        gen.store_outcome2()