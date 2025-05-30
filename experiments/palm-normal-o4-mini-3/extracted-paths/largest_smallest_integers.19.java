import java.util.*;

class LARGEST_SMALLEST_INTEGERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] largest_smallest_integers(int[] lst){
    boolean negative_1 = false, positive_1 = false;
    int max_negative_1 = Integer.MIN_VALUE, min_positive_1 = Integer.MAX_VALUE;
    int i_1 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    assertTrue(!false, "Path condition is violated: assertTrue(!false) //[2]");
    max_negative_1 = 0;
    assertTrue(!false, "Path condition is violated: assertTrue(!false) //[3]");
    min_positive_1 = 0;
    int[] result_1 = { 0, 0 };
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] largest_smallest_integers(int[] lst){
    boolean negative_1 = false, positive_1 = false;
    int max_negative_1 = Integer.MIN_VALUE, min_positive_1 = Integer.MAX_VALUE;
    int i_1 = 0;
    assertFalse(0 < lst.length); //[1]
    assertTrue(!false); //[2]
    max_negative_1 = 0;
    assertTrue(!false); //[3]
    min_positive_1 = 0;
    int[] result_1 = { 0, 0 };
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertTrue(!false)
3#assertTrue(!false)

*/
