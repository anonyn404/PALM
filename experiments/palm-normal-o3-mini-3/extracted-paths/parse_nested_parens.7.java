import java.util.*;
import java.util.ArrayList;
import java.util.List;

class PARSE_NESTED_PARENS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> parse_nested_parens(String paren_string){
    String[] paren_groups_1 = paren_string.split(" ");
    List<Integer> result_1 = new ArrayList<Integer>();
    String paren_group_1;
    assertTrue(0 < paren_groups_1.length, "Path condition is violated: assertTrue(0 < paren_groups_1.length) //[1]");
    paren_group_1 = paren_groups_1[0];
    int depth_1 = 0;
    int max_depth_1 = 0;
    char[] c_array_1 = paren_group_1.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[2]");
    result_1.add(0);
    assertFalse(1 < paren_groups_1.length, "Path condition is violated: assertFalse(1 < paren_groups_1.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> parse_nested_parens(String paren_string){
    String[] paren_groups_1 = paren_string.split(" ");
    List<Integer> result_1 = new ArrayList<Integer>();
    String paren_group_1;
    assertTrue(0 < paren_groups_1.length); //[1]
    paren_group_1 = paren_groups_1[0];
    int depth_1 = 0;
    int max_depth_1 = 0;
    char[] c_array_1 = paren_group_1.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[2]
    result_1.add(0);
    assertFalse(1 < paren_groups_1.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < paren_string.split(" ").length)
2#assertFalse(0 < paren_groups_1[0].toCharArray().length)
3#assertFalse(1 < paren_string.split(" ").length)

*/
