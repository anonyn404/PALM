from testMaker.generators.direct_generator import DirectGenerator
from testMaker.generators.path_generator import PathGenerator
from concurrent.futures import ThreadPoolExecutor
from testMaker.models import OpenaiModel
from testMaker.pathExtraction import PathExtractor
from testMaker.eval.send_email import send_email
import logging

logging.basicConfig(level=logging.INFO)
logging.getLogger("httpx").setLevel(logging.WARNING)
import os, sys, time, glob, ast, json

PALM_DIR = "/mnt/ssd/anonymized/PALM"
PROGRAM_DIR = f"{PALM_DIR}/subjects"
EXPERIMENT_DIR = f"{PALM_DIR}/experiments"
os.makedirs(EXPERIMENT_DIR, exist_ok=True)
HUMANEVAL = list(map(lambda x: x.removesuffix(".java").lower(), sorted(glob.glob("*.java", root_dir=PROGRAM_DIR))))
EXCLUDED = ["decode_cyclic", "do_algebra", "find_max", "fruit_distribution", "get_row", \
            "sort_array_binary", "sort_numbers", "sorted_list_sum", "valid_date", "test", "histogram", "find_zero", \
            "is_palindrome", "is_prime", "make_palindrome", "match_parens", "numerical_letter_grade", "skjkasdkd", "fibfib", "fib", "even_odd_palindrome", "intersection", \
            "get_max_triples", "is_multiply_prime", "factorial", "min_path", "order_by_points", "remove_paths", "strongest_extension", "triples_sum_to_zero", "words_in_sentence", "select_words", "move_one_ball", "count_nums"] # too many paths
TOO_SIMPLE = ["add", "numerical_letter_grade", "triangle_area", "truncate_number", "sum_to_n", "strlen", "multiply", "is_cude", "is_equal_to_sum_even", "decimal_to_binary"]

_multfunc = ["even_odd_palindrome", "intersection", "is_multiply_prime", "make_palindrome", "match_parens", \
                "prime_fib", "skjkasdkd", "compare_one", "fib", "fibfib"]
BENCHMAKRS = sorted(list(set(HUMANEVAL) - set(EXCLUDED) - set(TOO_SIMPLE)))

def remove_programs():
    for program in HUMANEVAL:
        if program not in BENCHMAKRS:
            program = program.upper()
            if os.path.exists(f"{PROGRAM_DIR}/{program}.java"):
                os.remove(f"{PROGRAM_DIR}/{program}.java")
    
    return True
#remove_programs()

def get_direct(id, model_name, max_gen, nickname=None):
    if nickname is None:
        nickname = f"direct-{model_name}-{id}"
    return DirectGenerator(nickname=nickname,
        model=OpenaiModel(model_name),
        program_dir=PROGRAM_DIR,
        root_dir=f"{EXPERIMENT_DIR}/{nickname}",
        max_gen=max_gen,
        refine_loop=None)

def get_palm(id, model_name, mode, max_gen, show_history=True, refine_loop=5, propagated=False, use_dfs=False, nickname=None):
    if nickname is None:
        nickname = f"palm-{mode}-{model_name}-{id}"
    return PathGenerator(nickname=nickname,
                        model=OpenaiModel(model_name),
                        program_dir=PROGRAM_DIR,
                        root_dir=f"{EXPERIMENT_DIR}/{nickname}",
                        max_gen=max_gen,
                        refine_loop=refine_loop,
                        show_history=show_history,
                        use_dfs=use_dfs,
                        propagated=propagated)

def run_exprs(input_ids):
    start_time = time.time()
    experiments = []
    for id in input_ids:
        experiments += [
            get_direct(id, model_name="o3-mini", max_gen=50),
            get_palm(id, model_name="o3-mini", mode="normal", max_gen=50, use_dfs=True),
            get_direct(id, model_name="gpt-4o-mini", max_gen=50),
            get_palm(id, model_name="gpt-4o-mini", mode="normal", max_gen=50, use_dfs=True),
            get_direct(id, model_name="o4-mini", max_gen=50),
            get_palm(id, model_name="o4-mini", mode="normal", max_gen=50, use_dfs=True),
        ]

    for idx, expr in enumerate(experiments):
        logging.info(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
        logging.info(f"Running pathExtractor {idx} / {len(experiments)} .. {expr.nickname}")
        expr.run_path_extractor(BENCHMAKRS)
    
    for idx, expr in enumerate(experiments):
        logging.info(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
        logging.info(f"Running experiment {idx} / {len(experiments)} .. {expr.nickname}")
        if isinstance(expr, PathGenerator):
            expr.run_test_generator_verifier(BENCHMAKRS)
            expr.run_stats(BENCHMAKRS)
            expr.run_profiler(BENCHMAKRS)
        elif isinstance(expr, DirectGenerator):
            expr.run_test_generator(BENCHMAKRS)
            expr.run_profiler(BENCHMAKRS)
        
        try:
            email_content = f"Experiment {expr.nickname} finished.\n"
            if os.path.exists(expr.pc_path2):
                # read json file and append to email content (indent = 2 for pretty print)
                with open(expr.pc_path2, 'r') as f:
                    data = json.load(f)
                    email_content += json.dumps(data, indent=2) + "\n"
            send_email(content=email_content)
        except Exception as e:
            logging.error(f"Error sending email for {expr.nickname}: {e}")

    end_time = time.time()
    elapsed_hours = (end_time - start_time) / 3600
    logging.info(f"Elapsed time: {elapsed_hours:.2f} hours")
    return True

if __name__ == "__main__":
    os.chdir(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))  # Ensure we are in the root directory
    #BENCHMAKRS = ["add_elements"]
    run_exprs(sys.argv[1:])
