```def palm(program: str, is_compile=False, is_gen=False, pcid=None) -> dict:```

To get the PALM output, use palm(<program code str>, true, true) to get a dictionary
 - is_compile: whether to compile the program
 - is_gen: whether to generate tests
 - pcid: None => generate for all paths, not None => a specific path (if is_gen is true)


<span style="color:red">**Warning: this function will change the current working directory to the directory of this file**</span>

return: a dictionary with the following keys:
 - compile: "pass" or "fail"
 - errline: the line number of the error (if compile fails)
 - errmsg: the error message (if compile fails)
 - paths: a dictionary: pcid -> path detail (if compile passes):
   - key: pcid, the path condition id
   - value: a dictionary with the following keys:
     - path-variant: the path condition
     - generated-tests: a list of generated tests
       - genid: the id of the generated test
       - status: the status of the generated test (UNSAT / PASS / FAIL)
       - test: the generated test
       - errmsg: the error message (if any)
       - prompt: the prompt used to generate the test
       - errid: the index of the failed assert statement (if any)
                errid is an integer, 
                  possible failed statement in path-variant: assertTrue(i_1 < n) //[3]
                  errid = 3 means the 3rd assert statement failed