import java.util.*;
import java.util.ArrayList;
import java.util.List;

class INTERSPERSE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void intersperse(List<Integer> numbers, int delimeter){
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(numbers.size() == 0, "Path condition is violated: assertFalse(numbers.size() == 0) //[1]");
    int i_1 = 0;
    assertTrue(0 < numbers.size() - 1, "Path condition is violated: assertTrue(0 < numbers.size() - 1) //[2]");
    result_1.add(numbers.get(0));
    result_1.add(delimeter);
    i_1 += 1;
    assertTrue(1 < numbers.size() - 1, "Path condition is violated: assertTrue(1 < numbers.size() - 1) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void intersperse(List<Integer> numbers, int delimeter){
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(numbers.size() == 0); //[1]
    int i_1 = 0;
    assertTrue(0 < numbers.size() - 1); //[2]
    result_1.add(numbers.get(0));
    result_1.add(delimeter);
    i_1 += 1;
    assertTrue(1 < numbers.size() - 1); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(numbers.size() == 0)
2#assertTrue(0 < numbers.size() - 1)
3#assertTrue(1 < numbers.size() - 1)

*/
