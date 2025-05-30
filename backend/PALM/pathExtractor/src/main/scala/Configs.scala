object Configs {

    var _loop_iter_bound = 2 // loop bound
    var _recursive_iter_bound = 2 // recursive bound
    var _max_paths = 20 // max paths to generate
    var _program_dir = s"../benchmarks/src/main/java/humaneval/correct"
    var _extract_dir = s"../extracted-paths"
    var _propagate_constant_assignment = true
    val _cut_loop_check = true // whether assert not cond when loop bound reached
    val _hole_placeholder = s";" // placeholder used in test func body
    val _avoid_literal_copy = true // array[] copy in foreach statement, this might be buggy
    val _add_loop_guard = true // add parenthesis around loops to avoid variable redef
    var _flatten_paths = true // rename conflict var names and flatten resulted paths
    val _handle_compound_assignments = false // turn x += y into x = x + y
    val _add_errmsg = true // add error message printing in assertTrue/assertFalse
    val _add_errno = true // add error number as comments after assertTrue/assertFalse

    val _path_assert = false // whether keep assertTrue/assertFalse in path condition
    val _path_other_funcs = true // whether keep other functions in path condition
    val _path_imports = false // whether keep imports in path condition

    val _rewrite_original = true // whether rewrite the original program into a new separate file
    val _rewrite_comment = false // whether keep comments in the rewritten program
    val _rewrite_imports = true // whether keep imports in the rewritten program

    val _separator = "/* SEPARATOR */\n"
    val _profile_var = "profile_var"

    val _imports = """import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
"""

    val _asserts = """    static void assertFalse(boolean v) {assert(v == false);}
    static void assertTrue(boolean v) {assert(v == true);}
    """
    val _asserts_errmsg = """    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    """
}