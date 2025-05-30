import java.util.*;

class DOUBLE_THE_DIFFERENCE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void double_the_difference(double[] lst){
    int result_1 = 0;
    Double d_1;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    d_1 = lst[0];
    assertTrue((int) d_1.doubleValue() == d_1, "Path condition is violated: assertTrue((int) d_1.doubleValue() == d_1) //[2]");
    int d_int_1 = (int) d_1.doubleValue();
    assertTrue(d_int_1 % 2 == 1 && d_int_1 >= 0, "Path condition is violated: assertTrue(d_int_1 % 2 == 1 && d_int_1 >= 0) //[3]");
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
    assertTrue((int) d_1.doubleValue() == d_1); //[2]
    int d_int_1 = (int) d_1.doubleValue();
    assertTrue(d_int_1 % 2 == 1 && d_int_1 >= 0); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertTrue((int) (lst[0]).doubleValue() == lst[0])
3#assertTrue((int) lst[0].doubleValue() % 2 == 1 && (int) lst[0].doubleValue() >= 0)

*/
