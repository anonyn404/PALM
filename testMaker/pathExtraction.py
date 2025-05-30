import glob, subprocess, os, sys, shutil, datetime, functools
from concurrent.futures import ThreadPoolExecutor
from threading import Lock

from testMaker.configs import GlobalConfig

class PathExtractor:
    logging = "../syntax.log"

    file_lock = Lock()

    @staticmethod
    def cleanPaths(root_dir=GlobalConfig._extract_dir):
        for fpath in glob.glob("*.java", root_dir=root_dir):
            os.remove(f"{root_dir}/{fpath}")

    @staticmethod
    def movePaths(to_dir):
        os.makedirs(to_dir, exist_ok=True)
        PathExtractor.cleanPaths(to_dir)
        for fpath in glob.glob("*.java", root_dir=GlobalConfig._extract_dir):
            shutil.move(f"{GlobalConfig._extract_dir}/{fpath}", f"{to_dir}/{fpath}")

    @staticmethod
    def runPathExtractor(benchmarks, options=[]):
        benchList = " ".join(benchmarks)
        optList = " ".join(options)
        command = f"sbt \"run {benchList} {optList}\""
        subprocess.run(command, shell=True, cwd=GlobalConfig._path_extractor)
        '''
        for name in benchmarks:
            command = f"sbt \"run {name}\""
            subprocess.run(command, shell=True, cwd=_path_extractor)
        '''

    @staticmethod
    def verifyPathSyntax(benchmarks, root_dir=GlobalConfig._extract_dir):
        for name in benchmarks:
            path_ids = list(sorted(glob.glob(f"{name}.*.java", root_dir=root_dir)))
            for path in path_ids:
                if path.removeprefix(f"{name}.").removesuffix(".java") == "-":
                    continue
                print(f"[{datetime.datetime.now()}] {path}")
                command = f"javac -d /tmp {path}"
                p = subprocess.run(command, shell=True, cwd=root_dir, capture_output=True)
                if p.returncode != 0:
                    with open(PathExtractor.logging, "a+") as f:
                        f.write(path + ", " + (str(p.stderr) if p.returncode != 0 else "-") + "\n")

        with open(PathExtractor.logging, "a+") as f:
            f.write(">" * 20 + "\n")
    

    @staticmethod
    def verifyPathSyntaxParallel(benchmarks, root_dir=GlobalConfig._extract_dir):
        paths = []
        for name in benchmarks:
            path_ids = list(sorted(glob.glob(f"{name}.*.java", root_dir=root_dir)))
            for path in path_ids:
                if path.removeprefix(f"{name}.").removesuffix(".java") == "-":
                    continue
                paths += [path]
        
        print(paths)

        with ThreadPoolExecutor(max_workers=os.cpu_count()) as executor:
            func = functools.partial(PathExtractor.verifyPathSyntaxSingle, root_dir=root_dir)
            results = executor.map(func, paths)

        with open(PathExtractor.logging, "a+") as f:
            f.write(">" * 20 + "\n")
    
    @staticmethod
    def verifyPathSyntaxSingle(path, root_dir):
        print(f"[{datetime.datetime.now()}] {path}")
        outdir = "/tmp/path/" + path.removesuffix(".java")
        os.makedirs(outdir, exist_ok=True)
        command = f"javac -d {outdir} {path}"
        p = subprocess.run(command, shell=True, cwd=root_dir, capture_output=True)

        with PathExtractor.file_lock:
            if p.returncode != 0:
                with open(PathExtractor.logging, "a+") as f:
                    f.write(path + ", " + (str(p.stderr) if p.returncode != 0 else "-") + "\n")
            else:
                with open(PathExtractor.logging, "a+") as f:
                    f.write(path + ", " + "OKAY" + "\n")
        pass

if __name__ == "__main__":
    script_path = os.path.abspath(__file__)
    script_dir = os.path.dirname(script_path)
    os.chdir(script_dir)

    if "-verify" in sys.argv:
        PathExtractor.verifyPathSyntaxParallel(root_dir=f"{GlobalConfig._extract_dir}/flattened")
        #PathExtractor.verifyPathSyntaxParallel(root_dir=f"{GlobalConfig._extract_dir}/unflattened")
    else:
        PathExtractor.cleanPaths()
        PathExtractor.cleanPaths(f"{GlobalConfig._extract_dir}/flattened")
        os.makedirs(f"{GlobalConfig._extract_dir}/flattened", exist_ok=True)
        PathExtractor.runPathExtractor(options=["-flatten-paths", f"-max-paths={GlobalConfig._max_gen}", \
                                                f"-program-dir={GlobalConfig._program_dir}", \
                                                f"-extract-dir={GlobalConfig._extract_dir}/flattened"])
        # PathExtractor.movePaths(f"{GlobalConfig._extract_dir}/flattened")
        #PathExtractor.cleanPaths(f"{GlobalConfig._extract_dir}/unflattened")
        #PathExtractor.runPathExtractor(options=[])
        #PathExtractor.movePaths(f"{GlobalConfig._extract_dir}/unflattened")