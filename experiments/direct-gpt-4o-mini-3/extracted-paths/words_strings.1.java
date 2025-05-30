import java.util.*;
import java.util.ArrayList;

class WORDS_STRINGS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<String> words_strings(String s){
    ArrayList<String> result_1 = new ArrayList<String>();
    assertFalse(s == null || s.isEmpty(), "Path condition is violated: assertFalse(s == null || s.isEmpty()) //[1]");
    String s_list_1 = "";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[2]");
    String[] result_array_1 = s_list_1.trim().split("\\s+");
    String r_1;
    assertFalse(0 < result_array_1.length, "Path condition is violated: assertFalse(0 < result_array_1.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static ArrayList<String> words_strings(String s){
    ArrayList<String> result_1 = new ArrayList<String>();
    assertFalse(s == null || s.isEmpty()); //[1]
    String s_list_1 = "";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[2]
    String[] result_array_1 = s_list_1.trim().split("\\s+");
    String r_1;
    assertFalse(0 < result_array_1.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(s == null || s.isEmpty())
2#assertFalse(0 < s.toCharArray().length)
3#assertFalse(0 < "".trim().split("\\s+").length)

*/
