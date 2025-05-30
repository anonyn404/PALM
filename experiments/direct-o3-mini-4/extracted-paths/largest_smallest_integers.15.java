import java.util.*;

class LARGEST_SMALLEST_INTEGERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] largest_smallest_integers(int[] lst){
    boolean negative_1 = false, positive_1 = false;
    int max_negative_1 = Integer.MIN_VALUE, min_positive_1 = Integer.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    assertFalse(lst[0] < 0, "Path condition is violated: assertFalse(lst[0] < 0) //[2]");
    assertTrue(lst[0] > 0, "Path condition is violated: assertTrue(lst[0] > 0) //[3]");
    positive_1 = true;
    min_positive_1 = Math.min(min_positive_1, lst[0]);
    i_1++;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[4]");
    assertTrue(!false, "Path condition is violated: assertTrue(!false) //[5]");
    max_negative_1 = 0;
    assertTrue(!true, "Path condition is violated: assertTrue(!true) //[6]");
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
    assertTrue(0 < lst.length); //[1]
    assertFalse(lst[0] < 0); //[2]
    assertTrue(lst[0] > 0); //[3]
    positive_1 = true;
    min_positive_1 = Math.min(min_positive_1, lst[0]);
    i_1++;
    assertFalse(1 < lst.length); //[4]
    assertTrue(!false); //[5]
    max_negative_1 = 0;
    assertTrue(!true); //[6]
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
1#assertTrue(0 < lst.length)
2#assertFalse(lst[0] < 0)
3#assertTrue(lst[0] > 0)
4#assertFalse(1 < lst.length)
5#assertTrue(!false)
6#assertTrue(!true)

*/
