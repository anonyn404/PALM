import java.util.*;

class SUM_SQUARED_NUMS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static long sum_squared_nums(double[] lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    result_1 += (Math.ceil(lst[0])) * (Math.ceil(lst[0]));
    i_1++;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[2]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static long sum_squared_nums(double[] lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.length); //[1]
    result_1 += (Math.ceil(lst[0])) * (Math.ceil(lst[0]));
    i_1++;
    assertFalse(1 < lst.length); //[2]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertFalse(1 < lst.length)

*/
