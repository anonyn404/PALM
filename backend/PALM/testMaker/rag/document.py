from PALM.testMaker.models import OpenaiModel
from PALM.testMaker.configs import GlobalConfig
import json
class Document:
    def __init__(self, db_file = "docs/knowledge.json"):
        self.db = {}
        self.db_file = db_file
        if self.db_file is not None:
            self.load_db()
        pass

    def load_db(self):
        # load json file from db_file
        try:
            with open(self.db_file, 'r') as f:
                self.db = json.load(f)
        except FileNotFoundError:
            self.db = {}
        except json.JSONDecodeError as e:
            print("Error loading JSON. Starting with an empty database.")
            print(e)
            exit(0)

    def get_key(self, func_descriptor):
        if "scope-type" not in func_descriptor:
            print(func_descriptor)
        key = func_descriptor["name"] + "@" + \
                func_descriptor["scope-type"] + "+" + \
                "+".join(func_descriptor["args-type"])
        return key

    def get_enhanced(self, func_descriptor):
        key = self.get_key(func_descriptor)
        if key not in self.db:
            return None
        return self.db[key]
    
    def enhance(self, func, get_type=False, get_documentation=False, get_io_pair=False):
        enhanced = self.get_enhanced(func)
        ret = {
            "statement": func["statement"]
        }

        if enhanced is not None:
            if get_documentation:
                ret["description"] = enhanced["documentation"]
            if get_io_pair:
                ret["input-output"] = enhanced["input-output"]

        if get_type:
            type_info = dict()
            if 'scope' in func:
                type_info[func['scope']] = func['scope-type']
            if 'args' in func:
                assert len(func['args']) == len(func['args-type'])
                for argi, argi_type in zip(func['args'], func['args-type']):
                    type_info[argi] = argi_type
            ret['type-info'] = type_info
            
        return ret
                
class DocumentBuilder(Document):
    def __init__(self, db_file="docs/knowledge.json"):
        super().__init__(db_file)
        self.model = OpenaiModel("gpt-4o")
        self.count_outdated = 0
        self.threshold = 2
    
    def store_db(self):
        # store json file db into db_file
        with open(self.db_file, 'w') as f:
            json.dump(self.db, f, indent=2)
        self.count_outdated = 0
    
    def _build_prompt(self, entry):
        m_entry = {
            "name": entry["name"],
            "args-type": entry["args-type"],
            "scope-type": entry["scope-type"]
        }
        example_input = {
            "name": "toString",
            "args-type": ["java.lang.Integer"],
            "scope-type": "java.lang.Integer"
        }
        example_output = {
            "documentation": "Converts the specified integer to its string representation.",
            "input-output": [{"input": {"#arg1": "123"}, "output": "\"123\""},
                        {"input": {"#arg1": "-5"}, "output": "\"-5\""}]
        }

        prompt = f"""
Enhance the following method dictionary by generating:
1. Description: A concise explanation of the method's purpose.
2. Input-Output Pairs: A list of valid input-output examples.
    
Method Call:
{m_entry}

Instructions:
The input JSON describes a method, including the method name, argument types, and scope type.
If the method is static, the scope will be the library name.
For non-static methods, include the assignment to the scope in the input.
The output JSON should include two key-value pairs:
  documentation: A brief description of the method.
  input-output: A list where each item includes:
	input: A dictionary representing the arguments passed to the method (and scope if applicable). Argument index starts from 1.
	output: The expected result of the method call.

Example input:
{example_input}
Example output:
{example_output}

Make sure every input and output is a JSON string to represent a Java statement.
For example, if the input argument is a string, it could be "new ArrayList<>(Arrays.asList(1, 23, 456))".
"""
        return prompt

    
    def build_prompt(self, entry):
        assert False
        example_input = {
            "statement": "Integer.toString(arr.get(i))",
            "name": "toString",
            "args": ["arr.get(i)"],
            "args-type": ["java.lang.Integer"],
            "scope": "Integer",
            "scope-type": "java.lang.Integer"
        }
        example_output = {
            "documentation": "Converts the specified integer to its string representation.",
            "input-output": [{"input": {"arr.get(i)": 123}, "output": "123"},
                        {"input": {"arr.get(i)": -5}, "output": "-5"}]
        }

        prompt = f"""
Enhance the following method dictionary by generating:
1. Description: A concise explanation of the method's purpose.
2. Input-Output Pairs: A list of valid input-output examples.
    
Method Call:
{entry}

Instructions:
The input JSON describes the method call, including the statement, method name, arguments, argument types, scope, and scope type.
If the method is static, the scope will be the library name.
For non-static methods, include the assignment to the scope in the input.
The output JSON should include two key-value pairs:
  documentation: A brief description of the method.
  input-output: A list where each item includes:
	input: A dictionary representing the arguments passed to the method (and scope if applicable).
	output: The expected result of the method call.

Example input:
{example_input}
Example output:
{example_output}

If the output is null, true, false, make sure to write it as valid string.
"""
        return prompt
    
    def add_func(self, func_descriptor):
        key = self.get_key(func_descriptor)
        if key not in self.db:
            self.db[key] = func_descriptor
            self.count_outdated += 1
            if self.count_outdated > self.threshold:
                self.store_db()
        
        return ()
    

    def expand_db(self, entry):
        if "scope-type" not in entry:
            return True
        
        if self.get_enhanced(entry) is not None:
            return True
        prompt = self._build_prompt(entry)
        try:
            print(f"[Expanding] {entry['statement']}")
            response = self.model.generate(prompt)
            response = response.strip()
            response = response.removeprefix("```json")
            response = response.removesuffix("```")
            enhanced_entry = eval(response)
        except SyntaxError:
            print(response)
            print(e)
            return False
        except Exception as e:
            print(response)
            print(e)
            return False
        
        if "documentation" in enhanced_entry and "input-output" in enhanced_entry:
            entry["documentation"] = enhanced_entry["documentation"]
            entry["input-output"] = enhanced_entry["input-output"]
            self.add_func(entry)
            return True

        print("Enhanced entry is problematic.")
        print(enhanced_entry)
        return False

    def build(self, root_dir):
        for benchmark in GlobalConfig._benchmarks:
            print(f">{benchmark}")
            for pcid in GlobalConfig.get_pcids(benchmark):
                entrys = GlobalConfig.get_pcondition(pcid, 2)
                for entry in eval(entrys):
                    self.expand_db(entry)
        self.store_db()

if __name__ == "__main__":
    doc = DocumentBuilder()
    doc.build(f"{GlobalConfig._extract_dir}/flattened")
    #doc.build(f"{GlobalConfig._extract_dir}/flattened")