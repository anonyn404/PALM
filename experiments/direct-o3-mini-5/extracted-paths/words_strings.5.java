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
    assertTrue(0 < result_array_1.length, "Path condition is violated: assertTrue(0 < result_array_1.length) //[3]");
    r_1 = result_array_1[0];
    result_1.add(r_1);
    assertTrue(1 < result_array_1.length, "Path condition is violated: assertTrue(1 < result_array_1.length) //[4]");
    r_1 = result_array_1[1];
    result_1.add(r_1);
    assertFalse(2 < result_array_1.length, "Path condition is violated: assertFalse(2 < result_array_1.length) //[5]");
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
    assertTrue(0 < result_array_1.length); //[3]
    r_1 = result_array_1[0];
    result_1.add(r_1);
    assertTrue(1 < result_array_1.length); //[4]
    r_1 = result_array_1[1];
    result_1.add(r_1);
    assertFalse(2 < result_array_1.length); //[5]
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
3#assertTrue(0 < "".trim().split("\\s+").length)
4#assertTrue(1 < "".trim().split("\\s+").length)
5#assertFalse(2 < "".trim().split("\\s+").length)

*/
