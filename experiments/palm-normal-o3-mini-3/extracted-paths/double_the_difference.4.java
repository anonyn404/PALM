import java.util.*;

class DOUBLE_THE_DIFFERENCE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void double_the_difference(double[] lst){
    int result_1 = 0;
    Double d_1;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    d_1 = lst[0];
    assertFalse((int) d_1.doubleValue() == d_1, "Path condition is violated: assertFalse((int) d_1.doubleValue() == d_1) //[2]");
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void double_the_difference(double[] lst){
    int result_1 = 0;
    Double d_1;
    assertTrue(0 < lst.length); //[1]
    d_1 = lst[0];
    assertFalse((int) d_1.doubleValue() == d_1); //[2]
    assertTrue(1 < lst.length); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertFalse((int) (lst[0]).doubleValue() == lst[0])
3#assertTrue(1 < lst.length)

*/
