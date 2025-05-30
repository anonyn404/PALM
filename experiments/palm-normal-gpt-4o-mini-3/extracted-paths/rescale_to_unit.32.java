import java.util.*;

class RESCALE_TO_UNIT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double[] rescale_to_unit(double[] numbers){
    double min_1 = Double.MAX_VALUE;
    double max_1 = Double.MIN_VALUE;
    int i_1 = 0;
    assertFalse(0 < numbers.length, "Path condition is violated: assertFalse(0 < numbers.length) //[1]");
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[2]");
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertFalse(1 < numbers.length, "Path condition is violated: assertFalse(1 < numbers.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static double[] rescale_to_unit(double[] numbers){
    double min_1 = Double.MAX_VALUE;
    double max_1 = Double.MIN_VALUE;
    int i_1 = 0;
    assertFalse(0 < numbers.length); //[1]
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length); //[2]
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertFalse(1 < numbers.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < numbers.length)
2#assertTrue(0 < numbers.length)
3#assertFalse(1 < numbers.length)

*/
