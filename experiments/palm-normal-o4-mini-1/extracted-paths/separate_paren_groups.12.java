import java.util.*;
import java.util.ArrayList;
import java.util.List;

class SEPARATE_PAREN_GROUPS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<String> separate_paren_groups(String paren_string){
    List<String> result_1 = new ArrayList<String>();
    String current_string_1 = "";
    int current_depth_1 = 0;
    char[] c_array_1 = paren_string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertTrue(c_1 == '(', "Path condition is violated: assertTrue(c_1 == '(') //[2]");
    current_depth_1 += 1;
    current_string_1 += String.valueOf(c_1);
    assertFalse(1 < c_array_1.length, "Path condition is violated: assertFalse(1 < c_array_1.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<String> separate_paren_groups(String paren_string){
    List<String> result_1 = new ArrayList<String>();
    String current_string_1 = "";
    int current_depth_1 = 0;
    char[] c_array_1 = paren_string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertTrue(c_1 == '('); //[2]
    current_depth_1 += 1;
    current_string_1 += String.valueOf(c_1);
    assertFalse(1 < c_array_1.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < paren_string.toCharArray().length)
2#assertTrue(c_array_1[0] == '(')
3#assertFalse(1 < paren_string.toCharArray().length)

*/
