import java.util.*;
import java.util.HashMap;

class CHECK_DICT_CASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean check_dict_case(HashMap<Object, Object> dict){
    assertTrue(dict.size() == 0, "Path condition is violated: assertTrue(dict.size() == 0) //[1]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashMap;
public static boolean check_dict_case(HashMap<Object, Object> dict){
    assertTrue(dict.size() == 0); //[1]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(dict.size() == 0)

*/
