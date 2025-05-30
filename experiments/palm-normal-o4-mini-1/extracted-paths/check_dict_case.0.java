import java.util.*;
import java.util.HashMap;

class CHECK_DICT_CASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void check_dict_case(HashMap<Object, Object> dict){
    assertFalse(dict.size() == 0, "Path condition is violated: assertFalse(dict.size() == 0) //[1]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashMap;
public static void check_dict_case(HashMap<Object, Object> dict){
    assertFalse(dict.size() == 0); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(dict.size() == 0)

*/
