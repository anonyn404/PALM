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
    assertTrue('A' <= c_1 && c_1 <= 'Z', "Path condition is violated: assertTrue('A' <= c_1 && c_1 <= 'Z') //[2]");
    result_1 += (int) c_1;
    assertFalse(1 < c_array_1.length, "Path condition is violated: assertFalse(1 < c_array_1.length) //[3]");
    return result_1;
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
    assertTrue('A' <= c_1 && c_1 <= 'Z'); //[2]
    result_1 += (int) c_1;
    assertFalse(1 < c_array_1.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertTrue('A' <= c_array_1[0] && c_array_1[0] <= 'Z')
3#assertFalse(1 < s.toCharArray().length)

*/
