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
    assertFalse(1 < numbers.length, "Path condition is violated: assertFalse(1 < numbers.length) //[2]");
    i_1 += 1;
    assertTrue(1 < numbers.length, "Path condition is violated: assertTrue(1 < numbers.length) //[3]");
    int j_2 = 2;
    assertTrue(2 < numbers.length, "Path condition is violated: assertTrue(2 < numbers.length) //[4]");
    double new_distance_1 = Math.abs(numbers[1] - numbers[2]);
    assertTrue(new_distance_1 < distance_1, "Path condition is violated: assertTrue(new_distance_1 < distance_1) //[5]");
    distance_1 = new_distance_1;
    assertFalse(numbers[1] < numbers[2], "Path condition is violated: assertFalse(numbers[1] < numbers[2]) //[6]");
    result_1[0] = numbers[2];
    result_1[1] = numbers[1];
    j_2 += 1;
    assertTrue(3 < numbers.length, "Path condition is violated: assertTrue(3 < numbers.length) //[7]");
    double new_distance_2 = Math.abs(numbers[1] - numbers[3]);
    assertTrue(new_distance_2 < distance_1, "Path condition is violated: assertTrue(new_distance_2 < distance_1) //[8]");
    distance_1 = new_distance_2;
    assertTrue(numbers[1] < numbers[3], "Path condition is violated: assertTrue(numbers[1] < numbers[3]) //[9]");
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
    assertFalse(1 < numbers.length); //[2]
    i_1 += 1;
    assertTrue(1 < numbers.length); //[3]
    int j_2 = 2;
    assertTrue(2 < numbers.length); //[4]
    double new_distance_1 = Math.abs(numbers[1] - numbers[2]);
    assertTrue(new_distance_1 < distance_1); //[5]
    distance_1 = new_distance_1;
    assertFalse(numbers[1] < numbers[2]); //[6]
    result_1[0] = numbers[2];
    result_1[1] = numbers[1];
    j_2 += 1;
    assertTrue(3 < numbers.length); //[7]
    double new_distance_2 = Math.abs(numbers[1] - numbers[3]);
    assertTrue(new_distance_2 < distance_1); //[8]
    distance_1 = new_distance_2;
    assertTrue(numbers[1] < numbers[3]); //[9]
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
4#assertTrue(2 < numbers.length)
5#assertTrue(Math.abs(numbers[1] - numbers[2]) < Double.MAX_VALUE)
6#assertFalse(numbers[1] < numbers[2])
7#assertTrue(3 < numbers.length)
8#assertTrue(Math.abs(numbers[1] - numbers[3]) < new_distance_1)
9#assertTrue(numbers[1] < numbers[3])

*/
