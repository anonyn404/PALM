import java.util.*;
import java.util.List;

class HAS_CLOSE_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size(), "Path condition is violated: assertTrue(0 < numbers.size()) //[1]");
    int j_1 = 1;
    assertFalse(1 < numbers.size(), "Path condition is violated: assertFalse(1 < numbers.size()) //[2]");
    i_1 += 1;
    assertTrue(1 < numbers.size(), "Path condition is violated: assertTrue(1 < numbers.size()) //[3]");
    int j_2 = 2;
    assertFalse(2 < numbers.size(), "Path condition is violated: assertFalse(2 < numbers.size()) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size()); //[1]
    int j_1 = 1;
    assertFalse(1 < numbers.size()); //[2]
    i_1 += 1;
    assertTrue(1 < numbers.size()); //[3]
    int j_2 = 2;
    assertFalse(2 < numbers.size()); //[4]
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
4#assertFalse(2 < numbers.size())

*/
