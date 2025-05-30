import java.util.*;

class LARGEST_SMALLEST_INTEGERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void largest_smallest_integers(int[] lst){
    boolean negative_1 = false, positive_1 = false;
    int max_negative_1 = Integer.MIN_VALUE, min_positive_1 = Integer.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    assertTrue(lst[0] < 0, "Path condition is violated: assertTrue(lst[0] < 0) //[2]");
    negative_1 = true;
    max_negative_1 = Math.max(max_negative_1, lst[0]);
    i_1++;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
    assertTrue(lst[1] < 0, "Path condition is violated: assertTrue(lst[1] < 0) //[4]");
    negative_1 = true;
    max_negative_1 = Math.max(max_negative_1, lst[1]);
    i_1++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[5]");
    assertTrue(!true, "Path condition is violated: assertTrue(!true) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void largest_smallest_integers(int[] lst){
    boolean negative_1 = false, positive_1 = false;
    int max_negative_1 = Integer.MIN_VALUE, min_positive_1 = Integer.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < lst.length); //[1]
    assertTrue(lst[0] < 0); //[2]
    negative_1 = true;
    max_negative_1 = Math.max(max_negative_1, lst[0]);
    i_1++;
    assertTrue(1 < lst.length); //[3]
    assertTrue(lst[1] < 0); //[4]
    negative_1 = true;
    max_negative_1 = Math.max(max_negative_1, lst[1]);
    i_1++;
    assertFalse(2 < lst.length); //[5]
    assertTrue(!true); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertTrue(lst[0] < 0)
3#assertTrue(1 < lst.length)
4#assertTrue(lst[1] < 0)
5#assertFalse(2 < lst.length)
6#assertTrue(!true)

*/
