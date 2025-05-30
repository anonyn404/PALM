import java.util.*;

class FIND_CLOSEST_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double[] find_closest_elements(double[] numbers){
    double[] result_1 = new double[2];
    double distance_1 = Double.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[1]");
    int j_1 = 1;
    assertFalse(1 < numbers.length, "Path condition is violated: assertFalse(1 < numbers.length) //[2]");
    i_1 += 1;
    assertTrue(1 < numbers.length, "Path condition is violated: assertTrue(1 < numbers.length) //[3]");
    int j_2 = 2;
    assertFalse(2 < numbers.length, "Path condition is violated: assertFalse(2 < numbers.length) //[4]");
    i_1 += 1;
    assertFalse(2 < numbers.length, "Path condition is violated: assertFalse(2 < numbers.length) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static double[] find_closest_elements(double[] numbers){
    double[] result_1 = new double[2];
    double distance_1 = Double.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length); //[1]
    int j_1 = 1;
    assertFalse(1 < numbers.length); //[2]
    i_1 += 1;
    assertTrue(1 < numbers.length); //[3]
    int j_2 = 2;
    assertFalse(2 < numbers.length); //[4]
    i_1 += 1;
    assertFalse(2 < numbers.length); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.length)
2#assertFalse(1 < numbers.length)
3#assertTrue(1 < numbers.length)
4#assertFalse(2 < numbers.length)
5#assertFalse(2 < numbers.length)

*/
