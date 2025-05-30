import java.util.*;

class EVEN_ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] even_odd_count(int num){
    int even_count_1 = 0;
    int odd_count_1 = 0;
    char[] c_array_1 = (Math.abs(num) + "").toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[1]");
    return new int[] { 0, 0 };
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] even_odd_count(int num){
    int even_count_1 = 0;
    int odd_count_1 = 0;
    char[] c_array_1 = (Math.abs(num) + "").toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[1]
    return new int[] { 0, 0 };
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < (Math.abs(num) + "").toCharArray().length)

*/
