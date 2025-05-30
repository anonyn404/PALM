import java.util.*;
import java.util.ArrayList;
import java.util.List;

class PARSE_NESTED_PARENS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void parse_nested_parens(String paren_string){
    String[] paren_groups_1 = paren_string.split(" ");
    List<Integer> result_1 = new ArrayList<Integer>();
    String paren_group_1;
    assertTrue(0 < paren_groups_1.length, "Path condition is violated: assertTrue(0 < paren_groups_1.length) //[1]");
    paren_group_1 = paren_groups_1[0];
    int depth_1 = 0;
    int max_depth_1 = 0;
    char[] c_array_1 = paren_group_1.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[2]");
    c_1 = c_array_1[0];
    assertTrue(c_1 == '(', "Path condition is violated: assertTrue(c_1 == '(') //[3]");
    depth_1 += 1;
    max_depth_1 = Math.max(1, 0);
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[4]");
    c_1 = c_array_1[1];
    assertTrue(c_1 == '(', "Path condition is violated: assertTrue(c_1 == '(') //[5]");
    depth_1 += 1;
    max_depth_1 = Math.max(2, max_depth_1);
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[6]");
    result_1.add(max_depth_1);
    assertTrue(1 < paren_groups_1.length, "Path condition is violated: assertTrue(1 < paren_groups_1.length) //[7]");
    paren_group_1 = paren_groups_1[1];
    int depth_2 = 0;
    int max_depth_2 = 0;
    char[] c_array_2 = paren_group_1.toCharArray();
    char c_2;
    assertTrue(0 < c_array_2.length, "Path condition is violated: assertTrue(0 < c_array_2.length) //[8]");
    c_2 = c_array_2[0];
    assertTrue(c_2 == '(', "Path condition is violated: assertTrue(c_2 == '(') //[9]");
    depth_2 += 1;
    max_depth_2 = Math.max(1, 0);
    assertTrue(1 < c_array_2.length, "Path condition is violated: assertTrue(1 < c_array_2.length) //[10]");
    c_2 = c_array_2[1];
    assertFalse(c_2 == '(', "Path condition is violated: assertFalse(c_2 == '(') //[11]");
    depth_2 -= 1;
    assertFalse(2 < c_array_2.length, "Path condition is violated: assertFalse(2 < c_array_2.length) //[12]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void parse_nested_parens(String paren_string){
    String[] paren_groups_1 = paren_string.split(" ");
    List<Integer> result_1 = new ArrayList<Integer>();
    String paren_group_1;
    assertTrue(0 < paren_groups_1.length); //[1]
    paren_group_1 = paren_groups_1[0];
    int depth_1 = 0;
    int max_depth_1 = 0;
    char[] c_array_1 = paren_group_1.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[2]
    c_1 = c_array_1[0];
    assertTrue(c_1 == '('); //[3]
    depth_1 += 1;
    max_depth_1 = Math.max(1, 0);
    assertTrue(1 < c_array_1.length); //[4]
    c_1 = c_array_1[1];
    assertTrue(c_1 == '('); //[5]
    depth_1 += 1;
    max_depth_1 = Math.max(2, max_depth_1);
    assertFalse(2 < c_array_1.length); //[6]
    result_1.add(max_depth_1);
    assertTrue(1 < paren_groups_1.length); //[7]
    paren_group_1 = paren_groups_1[1];
    int depth_2 = 0;
    int max_depth_2 = 0;
    char[] c_array_2 = paren_group_1.toCharArray();
    char c_2;
    assertTrue(0 < c_array_2.length); //[8]
    c_2 = c_array_2[0];
    assertTrue(c_2 == '('); //[9]
    depth_2 += 1;
    max_depth_2 = Math.max(1, 0);
    assertTrue(1 < c_array_2.length); //[10]
    c_2 = c_array_2[1];
    assertFalse(c_2 == '('); //[11]
    depth_2 -= 1;
    assertFalse(2 < c_array_2.length); //[12]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < paren_string.split(" ").length)
2#assertTrue(0 < paren_groups_1[0].toCharArray().length)
3#assertTrue(c_array_1[0] == '(')
4#assertTrue(1 < paren_groups_1[0].toCharArray().length)
5#assertTrue(c_array_1[1] == '(')
6#assertFalse(2 < paren_groups_1[0].toCharArray().length)
7#assertTrue(1 < paren_string.split(" ").length)
8#assertTrue(0 < paren_groups_1[1].toCharArray().length)
9#assertTrue(c_array_2[0] == '(')
10#assertTrue(1 < paren_groups_1[1].toCharArray().length)
11#assertFalse(c_array_2[1] == '(')
12#assertFalse(2 < paren_groups_1[1].toCharArray().length)

*/
