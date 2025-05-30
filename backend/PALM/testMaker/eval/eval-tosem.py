from PALM.testMaker.generators.direct_generator import DirectGenerator
from PALM.testMaker.generators.path_generator import PathGenerator
from PALM.testMaker.generators.smt_generator import SMTGenerator
from PALM.testMaker.configs import GlobalConfig
from concurrent.futures import ThreadPoolExecutor
from PALM.testMaker.models.model import OpenaiModel
import os, sys, time

def run_direct(run, benchmarks, id):
    gen = DirectGenerator(path_flatten=True,
                          show_method_type=False,
                          show_method_doc=False,
                          show_method_io_pair=False,
                          generation_dir=f"{GlobalConfig._generation_dir}/direct-{id}",
                          refine_loop=None)
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

def run_direct_gpt_4o(run, benchmarks, id):
    gen = DirectGenerator(model=OpenaiModel("gpt-4o"),
                          path_flatten=True,
                          show_method_type=False,
                          show_method_doc=False,
                          show_method_io_pair=False,
                          generation_dir=f"{GlobalConfig._generation_dir}/direct-4o-{id}",
                          refine_loop=None)
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

def run_path(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=False,
                        show_method_io_pair=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path-{id}",
                        refine_loop=None)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))

def run_path_type(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=True,
                        show_method_doc=False,
                        show_method_io_pair=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path+type-{id}",
                        refine_loop=None)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))

def run_path_description(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=True,
                        show_method_io_pair=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path+doc-{id}",
                        refine_loop=None)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))

def run_path_io(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=False,
                        show_method_io_pair=True,
                        generation_dir=f"{GlobalConfig._generation_dir}/path+io-{id}",
                        refine_loop=None)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))

def run_path_refine(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=False,
                        show_method_io_pair=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path+refine-{id}",
                        refine_loop=5)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))


def run_path_refine_no_history(run, benchmarks, id):
    gen = PathGenerator(path_flatten=True,
                        show_method_type=False,
                        show_method_doc=False,
                        show_method_io_pair=False,
                        show_history=False,
                        generation_dir=f"{GlobalConfig._generation_dir}/path+refine-nohistory-{id}",
                        refine_loop=5)
    if run:
        gen.clean_dir()
        for benchmark in benchmarks:
            for pcid in gen.get_pcids(benchmark):
                gen.generate_test(benchmark, pcid)

    print(gen.statistics(benchmarks))


def run_exprs(run):
    benchmarks = GlobalConfig._benchmarks
    for id in range(0, 5):
        print("iteration", id, time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
        run_direct(run, benchmarks, id)
        run_direct_gpt_4o(run, benchmarks, id)

        run_path(run, benchmarks, id)
        run_path_type(run, benchmarks, id)
        run_path_description(run, benchmarks, id)
        run_path_io(run, benchmarks, id)

        run_path_refine(run, benchmarks, id)
        run_path_refine_no_history(run, benchmarks, id)

    #print('benchmarks', len(benchmarks))

if __name__ == "__main__":
    os.chdir(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))  # Ensure we are in the root directory
    assert sys.argv[1] == "QwQ", "be aware this action will clean up the experiment folder!" + sys.argv[1]
    run_exprs(True)