import argparse, glob
from PALM.testMaker.generators import DirectGenerator, PathGenerator
import logging
logging.basicConfig(level=logging.INFO)

def get_passed_pcids(gen):
    """
    Get the passed pcids from the generator's outcome.
    Return:
        - A dictionary benchmark -> set of pcids
    """
    passed_pcids = dict()
    for benchmark, pcids in gen.outcome.items():
        passed_pcids[benchmark] = set()
        for pcid, test_runs in pcids.items():
            if any([test_run["status"] == "PASS" for test_run in test_runs]):
                passed_pcids[benchmark].add(pcid)
    return passed_pcids

def get_passed_pcids_mults(gens):
    """
    Get the passed pcids from a set of generator's outcome.
    Return:
        - A dictionary benchmark -> set of pcids
    """
    passed_pcids = dict()
    for gen in gens:
        for benchmark, pcids in gen.outcome.items():
            if benchmark not in passed_pcids:
                passed_pcids[benchmark] = set()
            for pcid, test_runs in pcids.items():
                if any([test_run["status"] == "PASS" for test_run in test_runs]):
                    passed_pcids[benchmark].add(pcid)
    return passed_pcids

def diff(gen1, gen2):
    """
    Compare two sets of generated test cases and print the differences.
    Find paths covered by gen2, but not gen1
    Return:
        - A set of (benchmark, pcid) tuples that are different between the two sets.
    """
    gen1.load_outcome()
    gen2.load_outcome()

    gen1_passed_pcids = get_passed_pcids(gen1)
    gen2_passed_pcids = get_passed_pcids(gen2)
    diff_pcids = dict()

    for benchmark, pcids in gen2_passed_pcids.items():
        if benchmark not in gen1_passed_pcids:
            diff_pcids[benchmark] = pcids
        else:
            diff_pcids[benchmark] = pcids - gen1_passed_pcids[benchmark]
    
    for benchmark, pcids in diff_pcids.items():
        if len(pcids) == 0:
            continue
        logging.info(f"Benchmark: {benchmark}")
        logging.info(f"  PC of gen2: {len(gen2_passed_pcids[benchmark])}")
        logging.info(f"  PC of gen1: {len(gen1_passed_pcids[benchmark])}")
        for pcid in pcids:
            logging.info(f"  PCID: {pcid}")

def diff_mults(gen1, gen2):
    """
    Compare two sets of generated test cases and print the differences.
    Find paths covered by gen2 (a list), but not gen1
    Return:
        - A set of (benchmark, pcid) tuples that are different between the two sets.
    """
    for _gen1 in gen1:
        _gen1.load_outcome()
    for _gen2 in gen2:
        _gen2.load_outcome()

    gen1_passed_pcids = get_passed_pcids_mults(gen1)
    gen2_passed_pcids = get_passed_pcids_mults(gen2)
    diff_pcids = dict()

    logging.info(f"number of gen1 generators: {len(gen1)}")
    logging.info(f"number of gen2 generators: {len(gen2)}")

    for benchmark, pcids in gen2_passed_pcids.items():
        if benchmark not in gen1_passed_pcids:
            diff_pcids[benchmark] = pcids
        else:
            diff_pcids[benchmark] = pcids - gen1_passed_pcids[benchmark]
    
    for benchmark, pcids in diff_pcids.items():
        if len(pcids) == 0:
            continue
        logging.info(f"Benchmark: {benchmark}")
        logging.info(f"  PC of gen2: {len(gen2_passed_pcids[benchmark])}")
        logging.info(f"  PC of gen1: {len(gen1_passed_pcids[benchmark])}")
        for pcid in pcids:
            logging.info(f"  PCID: {pcid}")

    
if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Compare two sets of generated test cases.")
    parser.add_argument("--gen1", type=str, help="Path to the first set of generated test cases.", dest='gen1', default="generated-inputs/direct-o3-mini-*")
    parser.add_argument("--gen2", type=str, help="Path to the second set of generated test cases.", dest='gen2', default="generated-inputs/path-normal-o3-mini-*")
    parser.add_argument("--is_direct_gen1", action="store_true", help="Specify if the first set is generated using direct generation.", dest='is_direct_gen1', default=True)
    parser.add_argument("--is_direct_gen2", action="store_true", help="Specify if the second set is generated using direct generation.", dest='is_direct_gen2', default=False)

    args = parser.parse_args()

    if args.is_direct_gen1:
        gen1 = [DirectGenerator(generation_dir=dir) for dir in glob.glob(args.gen1)]
    else:
        gen1 = [PathGenerator(generation_dir=dir) for dir in glob.glob(args.gen1)]
    if args.is_direct_gen2:
        gen2 = [DirectGenerator(generation_dir=dir) for dir in glob.glob(args.gen2)]
    else:
        gen2 = [PathGenerator(generation_dir=dir) for dir in glob.glob(args.gen2)]
    
    outcome = diff_mults(gen1, gen2)