import java.util.*;
import java.util.ArrayList;
import java.util.List;

class INTERSPERSE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> intersperse(List<Integer> numbers, int delimeter){
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(numbers.size() == 0, "Path condition is violated: assertFalse(numbers.size() == 0) //[1]");
    int i_1 = 0;
    assertFalse(0 < numbers.size() - 1, "Path condition is violated: assertFalse(0 < numbers.size() - 1) //[2]");
    result_1.add(numbers.get(numbers.size() - 1));
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> intersperse(List<Integer> numbers, int delimeter){
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(numbers.size() == 0); //[1]
    int i_1 = 0;
    assertFalse(0 < numbers.size() - 1); //[2]
    result_1.add(numbers.get(numbers.size() - 1));
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(numbers.size() == 0)
2#assertFalse(0 < numbers.size() - 1)

*/
