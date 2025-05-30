import java.util.*;

class RESCALE_TO_UNIT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double[] rescale_to_unit(double[] numbers){
    double min_1 = Double.MAX_VALUE;
    double max_1 = Double.MIN_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[1]");
    assertTrue(numbers[0] > max_1, "Path condition is violated: assertTrue(numbers[0] > max_1) //[2]");
    max_1 = numbers[0];
    assertFalse(numbers[0] < min_1, "Path condition is violated: assertFalse(numbers[0] < min_1) //[3]");
    i_1 += 1;
    assertTrue(1 < numbers.length, "Path condition is violated: assertTrue(1 < numbers.length) //[4]");
    assertTrue(numbers[1] > max_1, "Path condition is violated: assertTrue(numbers[1] > max_1) //[5]");
    max_1 = numbers[1];
    assertTrue(numbers[1] < min_1, "Path condition is violated: assertTrue(numbers[1] < min_1) //[6]");
    min_1 = numbers[1];
    i_1 += 1;
    assertFalse(2 < numbers.length, "Path condition is violated: assertFalse(2 < numbers.length) //[7]");
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[8]");
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertFalse(1 < numbers.length, "Path condition is violated: assertFalse(1 < numbers.length) //[9]");
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
    assertTrue(0 < numbers.length); //[1]
    assertTrue(numbers[0] > max_1); //[2]
    max_1 = numbers[0];
    assertFalse(numbers[0] < min_1); //[3]
    i_1 += 1;
    assertTrue(1 < numbers.length); //[4]
    assertTrue(numbers[1] > max_1); //[5]
    max_1 = numbers[1];
    assertTrue(numbers[1] < min_1); //[6]
    min_1 = numbers[1];
    i_1 += 1;
    assertFalse(2 < numbers.length); //[7]
    double[] result_1 = new double[numbers.length];
    int i_2 = 0;
    assertTrue(0 < numbers.length); //[8]
    result_1[i_2] = (numbers[0] - min_1) / (max_1 - min_1);
    i_2 += 1;
    assertFalse(1 < numbers.length); //[9]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.length)
2#assertTrue(numbers[0] > Double.MIN_VALUE)
3#assertFalse(numbers[0] < Double.MAX_VALUE)
4#assertTrue(1 < numbers.length)
5#assertTrue(numbers[1] > numbers[0])
6#assertTrue(numbers[1] < Double.MAX_VALUE)
7#assertFalse(2 < numbers.length)
8#assertTrue(0 < numbers.length)
9#assertFalse(1 < numbers.length)

*/
