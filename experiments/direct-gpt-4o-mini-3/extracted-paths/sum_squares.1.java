import java.util.*;

class SUM_SQUARES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int sum_squares(int[] lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
    result_1 += lst[0] * lst[0];
    i_1 += 1;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int sum_squares(int[] lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.length); //[1]
    assertTrue(true); //[2]
    result_1 += lst[0] * lst[0];
    i_1 += 1;
    assertFalse(1 < lst.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertTrue(true)
3#assertFalse(1 < lst.length)

*/
