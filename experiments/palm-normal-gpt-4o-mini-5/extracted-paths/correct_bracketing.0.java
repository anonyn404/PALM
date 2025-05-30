import java.util.*;

class CORRECT_BRACKETING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void correct_bracketing(String brackets){
    int depth_1 = 0;
    char[] b_array_1 = brackets.toCharArray();
    char b_1;
    assertTrue(0 < b_array_1.length, "Path condition is violated: assertTrue(0 < b_array_1.length) //[1]");
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
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < brackets.toCharArray().length)

*/
