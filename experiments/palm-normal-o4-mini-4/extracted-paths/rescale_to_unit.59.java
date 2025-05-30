import java.util.*;

class RESCALE_TO_UNIT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void rescale_to_unit(double[] numbers){
    double min_1 = Double.MAX_VALUE;
    double max_1 = Double.MIN_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[1]");
    assertFalse(numbers[0] > max_1, "Path condition is violated: assertFalse(numbers[0] > max_1) //[2]");
    assertTrue(numbers[0] < min_1, "Path condition is violated: assertTrue(numbers[0] < min_1) //[3]");
    min_1 = numbers[0];
    i_1 += 1;
    assertFalse(1 < numbers.length, "Path condition is violated: assertFalse(1 < numbers.length) //[4]");
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[5]");
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertTrue(1 < numbers.length, "Path condition is violated: assertTrue(1 < numbers.length) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void rescale_to_unit(double[] numbers){
    double min_1 = Double.MAX_VALUE;
    double max_1 = Double.MIN_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length); //[1]
    assertFalse(numbers[0] > max_1); //[2]
    assertTrue(numbers[0] < min_1); //[3]
    min_1 = numbers[0];
    i_1 += 1;
    assertFalse(1 < numbers.length); //[4]
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length); //[5]
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertTrue(1 < numbers.length); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.length)
2#assertFalse(numbers[0] > Double.MIN_VALUE)
3#assertTrue(numbers[0] < Double.MAX_VALUE)
4#assertFalse(1 < numbers.length)
5#assertTrue(0 < numbers.length)
6#assertTrue(1 < numbers.length)

*/
