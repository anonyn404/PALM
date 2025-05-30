import logging
import argparse
import glob

logging.basicConfig(level=logging.INFO)
parser = argparse.ArgumentParser(description="Compare two sets of generated test cases.")
parser.add_argument("--program", type=str, help="program name", dest='program', default=None)
parser.add_argument("--path", type=str, help="path name", dest='path', default=None)
parser.add_argument("--prompt", type=str, help="prompt name", dest='prompt', default=None)
parser.add_argument("--test", type=str, help="path name for tests", dest='test', default=None)

if __name__ == "__main__":
    args = parser.parse_args()
    
    if args.program is not None:
        with open(f"extracted-paths/flattened/{args.program}.java", "r") as f:
            program = f.read()
        logging.info(f"Program: {args.program}")
        logging.info(f"Program content: \n{program}")
    if args.path is not None:
        with open(f"extracted-paths/flattened/{args.path}.java", "r") as f:
            path = f.read()
        logging.info(f"Path: {args.path}")
        logging.info(f"Path content: \n{path}")
    if args.prompt is not None:
        with open(f"generated-inputs/direct-o3-mini-0/{args.prompt}.prompt", "r") as f:
            prompt = f.read()
        logging.info(f"Direct generation prompt for {args.prompt}")
        logging.info(f"Prompt content: \n{prompt}")
    if args.test is not None:
        for gen_path in glob.glob(f"generated-inputs/path-normal-o3-mini-*"):
            test_paths = glob.glob(f"{gen_path}/{args.test}@*.java")
            for test_path in glob.glob(f"{gen_path}/{args.test}@{len(test_paths)-1}.java"):
                with open(test_path, "r") as f:
                    test = f.read()
                logging.info(f"Test: {test_path}")
                logging.info(f"Test content: \n{test}")