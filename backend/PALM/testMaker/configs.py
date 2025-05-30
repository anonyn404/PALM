import glob, os, json

class GlobalConfig:
    _base_dir = os.path.dirname(os.path.abspath(__file__))
    _extract_dir = "../extracted-paths"
    _generation_dir = "../generated-inputs"
    _verify_dir = "../immediate"
    _path_extractor = "../pathExtractor"
    _program_dir = "../benchmarks/src/main/java/humaneval/correct"
    _max_gen = 20

    _humaneval = list(map(lambda x: x.removesuffix(".java").lower(), \
                    sorted(glob.glob("*.java", root_dir=f"{_base_dir}/{_program_dir}"))))
    assert len(_humaneval) > 0, "No benchmarks found"
    _excluded = ["decode_cyclic", "do_algebra", "find_max", "fruit_distribution", "get_row", \
                "sort_array_binary", "sort_numbers", "sorted_list_sum", "valid_date", "test", "histogram", "find_zero"]
    _multfunc = ["even_odd_palindrome", "intersection", "is_multiply_prime", "make_palindrome", "match_parens", \
                 "prime_fib", "skjkasdkd", "compare_one", "fib", "fibfib"]
    _benchmarks = sorted(list(set(_humaneval) - set(_excluded))) #  - set(_multfunc)

    _separator = "/* SEPARATOR */\n"

    _small = ["check_if_last_char_is_a_letter", "bf", "by_length", "change_base", "count_upper", \
                "cycpattern_check", "digit_sum", "digits", "double_the_difference", "eat", \
                "even_odd_count", "string_xor", "solve_string", "smallest_change"]
    
    def get_pcids(benchmark, root_dir):
        paths = list(map(lambda x: x.removesuffix(".java").lower(), \
                        sorted(glob.glob(f"{benchmark}.*.java", root_dir=root_dir))))
        return paths
    
    def read_code(fpath):
        with open(fpath, "r") as f:
            lines = f.readlines()
            code = ''.join(lines)
        return code

    def write_code(fpath, code):
        with open(fpath, "w") as f:
            f.write(code)
        return code
    
    def get_pcondition(self, pcid, part=None):
        code = GlobalConfig.read_code(f"{self.extract_dir}/{pcid}.java")
        code = code.replace("{ ; }", "{\n<hole>\n}")
        
        if part is not None:
            code = code.split(GlobalConfig._separator)[part]
            code = code.removeprefix("/*\n").removesuffix("\n*/\n")
            
        return code
    
    def write_json(fpath, data):
        with open(fpath, "w") as f:
            json.dump(data, f)
        return True
    
    def load_json(fpath):
        with open(fpath, "r") as f:
            data = json.load(f)
        return data