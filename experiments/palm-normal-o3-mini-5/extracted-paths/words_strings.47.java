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
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[2]");
    c_1 = c_array_1[0];
    assertTrue(c_1 == ',', "Path condition is violated: assertTrue(c_1 == ',') //[3]");
    s_list_1 += ' ';
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[4]");
    c_1 = c_array_1[1];
    assertFalse(c_1 == ',', "Path condition is violated: assertFalse(c_1 == ',') //[5]");
    s_list_1 += c_1;
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[6]");
    String[] result_array_1 = s_list_1.trim().split("\\s+");
    String r_1;
    assertTrue(0 < result_array_1.length, "Path condition is violated: assertTrue(0 < result_array_1.length) //[7]");
    r_1 = result_array_1[0];
    result_1.add(r_1);
    assertFalse(1 < result_array_1.length, "Path condition is violated: assertFalse(1 < result_array_1.length) //[8]");
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
    assertTrue(0 < c_array_1.length); //[2]
    c_1 = c_array_1[0];
    assertTrue(c_1 == ','); //[3]
    s_list_1 += ' ';
    assertTrue(1 < c_array_1.length); //[4]
    c_1 = c_array_1[1];
    assertFalse(c_1 == ','); //[5]
    s_list_1 += c_1;
    assertFalse(2 < c_array_1.length); //[6]
    String[] result_array_1 = s_list_1.trim().split("\\s+");
    String r_1;
    assertTrue(0 < result_array_1.length); //[7]
    r_1 = result_array_1[0];
    result_1.add(r_1);
    assertFalse(1 < result_array_1.length); //[8]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(s == null || s.isEmpty())
2#assertTrue(0 < s.toCharArray().length)
3#assertTrue(c_array_1[0] == ',')
4#assertTrue(1 < s.toCharArray().length)
5#assertFalse(c_array_1[1] == ',')
6#assertFalse(2 < s.toCharArray().length)
7#assertTrue(0 < ("" + ' ') + c_1.trim().split("\\s+").length)
8#assertFalse(1 < ("" + ' ') + c_1.trim().split("\\s+").length)

*/
