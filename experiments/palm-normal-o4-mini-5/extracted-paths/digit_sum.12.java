import java.util.*;

class DIGIT_SUM {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int digit_sum(String s){
    int result_1 = 0;
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertFalse('A' <= c_1 && c_1 <= 'Z', "Path condition is violated: assertFalse('A' <= c_1 && c_1 <= 'Z') //[2]");
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[3]");
    c_1 = c_array_1[1];
    assertFalse('A' <= c_1 && c_1 <= 'Z', "Path condition is violated: assertFalse('A' <= c_1 && c_1 <= 'Z') //[4]");
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[5]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int digit_sum(String s){
    int result_1 = 0;
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertFalse('A' <= c_1 && c_1 <= 'Z'); //[2]
    assertTrue(1 < c_array_1.length); //[3]
    c_1 = c_array_1[1];
    assertFalse('A' <= c_1 && c_1 <= 'Z'); //[4]
    assertFalse(2 < c_array_1.length); //[5]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertFalse('A' <= c_array_1[0] && c_array_1[0] <= 'Z')
3#assertTrue(1 < s.toCharArray().length)
4#assertFalse('A' <= c_array_1[1] && c_array_1[1] <= 'Z')
5#assertFalse(2 < s.toCharArray().length)

*/
