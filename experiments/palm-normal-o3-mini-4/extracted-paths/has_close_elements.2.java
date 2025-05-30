import java.util.*;
import java.util.List;

class HAS_CLOSE_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void has_close_elements(List<Double> numbers, double threshold){
    int i_1 = 0;
    assertTrue(0 < numbers.size(), "Path condition is violated: assertTrue(0 < numbers.size()) //[1]");
    int j_1 = 1;
    assertTrue(1 < numbers.size(), "Path condition is violated: assertTrue(1 < numbers.size()) //[2]");
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
    assertTrue(1 < numbers.size()); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < numbers.size())
2#assertTrue(1 < numbers.size())

*/
