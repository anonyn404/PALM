import glob, os, json

class GlobalConfig:
    _base_dir = os.path.dirname(os.path.abspath(__file__))
    _extract_dir = "../extracted-paths"
    _generation_dir = "../generated-inputs"
    _verify_dir = "../immediate"
    _path_extractor = "../pathExtractor"
    _program_dir = "../subjects"
    _max_gen = 20
    
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