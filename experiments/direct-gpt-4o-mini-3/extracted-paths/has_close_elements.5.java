import java.util.*;
import java.util.List;

class HAS_CLOSE_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size(), "Path condition is violated: assertTrue(0 < numbers.size()) //[1]");
    int j_1 = 1;
    assertFalse(1 < numbers.size(), "Path condition is violated: assertFalse(1 < numbers.size()) //[2]");
    i_1 += 1;
    assertTrue(1 < numbers.size(), "Path condition is violated: assertTrue(1 < numbers.size()) //[3]");
    int j_2 = 2;
    assertTrue(2 < numbers.size(), "Path condition is violated: assertTrue(2 < numbers.size()) //[4]");
    double distance_1 = Math.abs(numbers.get(1) - numbers.get(2));
    assertTrue(distance_1 < threshold, "Path condition is violated: assertTrue(distance_1 < threshold) //[5]");
    return true;
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
    assertFalse(1 < numbers.size()); //[2]
    i_1 += 1;
    assertTrue(1 < numbers.size()); //[3]
    int j_2 = 2;
    assertTrue(2 < numbers.size()); //[4]
    double distance_1 = Math.abs(numbers.get(1) - numbers.get(2));
    assertTrue(distance_1 < threshold); //[5]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.size())
2#assertFalse(1 < numbers.size())
3#assertTrue(1 < numbers.size())
4#assertTrue(2 < numbers.size())
5#assertTrue(Math.abs(numbers.get(1) - numbers.get(2)) < threshold)

*/
