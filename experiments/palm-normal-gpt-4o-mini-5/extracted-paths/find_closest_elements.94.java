import java.util.*;

class FIND_CLOSEST_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void find_closest_elements(double[] numbers){
    double[] result_1 = new double[2];
    double distance_1 = Double.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length, "Path condition is violated: assertTrue(0 < numbers.length) //[1]");
    int j_1 = 1;
    assertTrue(1 < numbers.length, "Path condition is violated: assertTrue(1 < numbers.length) //[2]");
    double new_distance_1 = Math.abs(numbers[0] - numbers[1]);
    assertTrue(new_distance_1 < distance_1, "Path condition is violated: assertTrue(new_distance_1 < distance_1) //[3]");
    distance_1 = new_distance_1;
    assertTrue(numbers[0] < numbers[1], "Path condition is violated: assertTrue(numbers[0] < numbers[1]) //[4]");
    result_1[0] = numbers[0];
    result_1[1] = numbers[1];
    j_1 += 1;
    assertTrue(2 < numbers.length, "Path condition is violated: assertTrue(2 < numbers.length) //[5]");
    double new_distance_2 = Math.abs(numbers[0] - numbers[2]);
    assertTrue(new_distance_2 < distance_1, "Path condition is violated: assertTrue(new_distance_2 < distance_1) //[6]");
    distance_1 = new_distance_2;
    assertTrue(numbers[0] < numbers[2], "Path condition is violated: assertTrue(numbers[0] < numbers[2]) //[7]");
    result_1[0] = numbers[0];
    result_1[1] = numbers[2];
    j_1 += 1;
    assertFalse(3 < numbers.length, "Path condition is violated: assertFalse(3 < numbers.length) //[8]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void find_closest_elements(double[] numbers){
    double[] result_1 = new double[2];
    double distance_1 = Double.MAX_VALUE;
    int i_1 = 0;
    assertTrue(0 < numbers.length); //[1]
    int j_1 = 1;
    assertTrue(1 < numbers.length); //[2]
    double new_distance_1 = Math.abs(numbers[0] - numbers[1]);
    assertTrue(new_distance_1 < distance_1); //[3]
    distance_1 = new_distance_1;
    assertTrue(numbers[0] < numbers[1]); //[4]
    result_1[0] = numbers[0];
    result_1[1] = numbers[1];
    j_1 += 1;
    assertTrue(2 < numbers.length); //[5]
    double new_distance_2 = Math.abs(numbers[0] - numbers[2]);
    assertTrue(new_distance_2 < distance_1); //[6]
    distance_1 = new_distance_2;
    assertTrue(numbers[0] < numbers[2]); //[7]
    result_1[0] = numbers[0];
    result_1[1] = numbers[2];
    j_1 += 1;
    assertFalse(3 < numbers.length); //[8]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.length)
2#assertTrue(1 < numbers.length)
3#assertTrue(Math.abs(numbers[0] - numbers[1]) < Double.MAX_VALUE)
4#assertTrue(numbers[0] < numbers[1])
5#assertTrue(2 < numbers.length)
6#assertTrue(Math.abs(numbers[0] - numbers[2]) < new_distance_1)
7#assertTrue(numbers[0] < numbers[2])
8#assertFalse(3 < numbers.length)

*/
