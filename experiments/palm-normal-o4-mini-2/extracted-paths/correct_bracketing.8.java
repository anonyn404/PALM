import java.util.*;

class CORRECT_BRACKETING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void correct_bracketing(String brackets){
    int depth_1 = 0;
    char[] b_array_1 = brackets.toCharArray();
    char b_1;
    assertTrue(0 < b_array_1.length, "Path condition is violated: assertTrue(0 < b_array_1.length) //[1]");
    b_1 = b_array_1[0];
    assertTrue(b_1 == '<', "Path condition is violated: assertTrue(b_1 == '<') //[2]");
    depth_1 += 1;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[3]");
    assertTrue(1 < b_array_1.length, "Path condition is violated: assertTrue(1 < b_array_1.length) //[4]");
    b_1 = b_array_1[1];
    assertTrue(b_1 == '<', "Path condition is violated: assertTrue(b_1 == '<') //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void correct_bracketing(String brackets){
    int depth_1 = 0;
    char[] b_array_1 = brackets.toCharArray();
    char b_1;
    assertTrue(0 < b_array_1.length); //[1]
    b_1 = b_array_1[0];
    assertTrue(b_1 == '<'); //[2]
    depth_1 += 1;
    assertFalse(false); //[3]
    assertTrue(1 < b_array_1.length); //[4]
    b_1 = b_array_1[1];
    assertTrue(b_1 == '<'); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < brackets.toCharArray().length)
2#assertTrue(b_array_1[0] == '<')
3#assertFalse(false)
4#assertTrue(1 < brackets.toCharArray().length)
5#assertTrue(b_array_1[1] == '<')

*/
