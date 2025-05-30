import java.util.*;
import java.util.List;

class HAS_CLOSE_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size(), "Path condition is violated: assertTrue(0 < numbers.size()) //[1]");
    int j_1 = 1;
    assertTrue(1 < numbers.size(), "Path condition is violated: assertTrue(1 < numbers.size()) //[2]");
    double distance_1 = Math.abs(numbers.get(0) - numbers.get(1));
    assertFalse(distance_1 < threshold, "Path condition is violated: assertFalse(distance_1 < threshold) //[3]");
    j_1 += 1;
    assertTrue(2 < numbers.size(), "Path condition is violated: assertTrue(2 < numbers.size()) //[4]");
    double distance_2 = Math.abs(numbers.get(0) - numbers.get(2));
    assertFalse(distance_2 < threshold, "Path condition is violated: assertFalse(distance_2 < threshold) //[5]");
    j_1 += 1;
    assertFalse(3 < numbers.size(), "Path condition is violated: assertFalse(3 < numbers.size()) //[6]");
    i_1 += 1;
    assertTrue(1 < numbers.size(), "Path condition is violated: assertTrue(1 < numbers.size()) //[7]");
    int j_2 = 2;
    assertTrue(2 < numbers.size(), "Path condition is violated: assertTrue(2 < numbers.size()) //[8]");
    double distance_3 = Math.abs(numbers.get(1) - numbers.get(2));
    assertFalse(distance_3 < threshold, "Path condition is violated: assertFalse(distance_3 < threshold) //[9]");
    j_2 += 1;
    assertTrue(3 < numbers.size(), "Path condition is violated: assertTrue(3 < numbers.size()) //[10]");
    double distance_4 = Math.abs(numbers.get(1) - numbers.get(3));
    assertFalse(distance_4 < threshold, "Path condition is violated: assertFalse(distance_4 < threshold) //[11]");
    j_2 += 1;
    assertFalse(4 < numbers.size(), "Path condition is violated: assertFalse(4 < numbers.size()) //[12]");
    i_1 += 1;
    assertFalse(2 < numbers.size(), "Path condition is violated: assertFalse(2 < numbers.size()) //[13]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static boolean has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size()); //[1]
    int j_1 = 1;
    assertTrue(1 < numbers.size()); //[2]
    double distance_1 = Math.abs(numbers.get(0) - numbers.get(1));
    assertFalse(distance_1 < threshold); //[3]
    j_1 += 1;
    assertTrue(2 < numbers.size()); //[4]
    double distance_2 = Math.abs(numbers.get(0) - numbers.get(2));
    assertFalse(distance_2 < threshold); //[5]
    j_1 += 1;
    assertFalse(3 < numbers.size()); //[6]
    i_1 += 1;
    assertTrue(1 < numbers.size()); //[7]
    int j_2 = 2;
    assertTrue(2 < numbers.size()); //[8]
    double distance_3 = Math.abs(numbers.get(1) - numbers.get(2));
    assertFalse(distance_3 < threshold); //[9]
    j_2 += 1;
    assertTrue(3 < numbers.size()); //[10]
    double distance_4 = Math.abs(numbers.get(1) - numbers.get(3));
    assertFalse(distance_4 < threshold); //[11]
    j_2 += 1;
    assertFalse(4 < numbers.size()); //[12]
    i_1 += 1;
    assertFalse(2 < numbers.size()); //[13]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.size())
2#assertTrue(1 < numbers.size())
3#assertFalse(Math.abs(numbers.get(0) - numbers.get(1)) < threshold)
4#assertTrue(2 < numbers.size())
5#assertFalse(Math.abs(numbers.get(0) - numbers.get(2)) < threshold)
6#assertFalse(3 < numbers.size())
7#assertTrue(1 < numbers.size())
8#assertTrue(2 < numbers.size())
9#assertFalse(Math.abs(numbers.get(1) - numbers.get(2)) < threshold)
10#assertTrue(3 < numbers.size())
11#assertFalse(Math.abs(numbers.get(1) - numbers.get(3)) < threshold)
12#assertFalse(4 < numbers.size())
13#assertFalse(2 < numbers.size())

*/
