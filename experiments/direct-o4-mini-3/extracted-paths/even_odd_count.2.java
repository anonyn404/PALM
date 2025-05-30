import java.util.*;

class EVEN_ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] even_odd_count(int num){
    int even_count_1 = 0;
    int odd_count_1 = 0;
    char[] c_array_1 = (Math.abs(num) + "").toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    int n_1 = c_1 - '0';
    assertFalse(n_1 % 2 == 0, "Path condition is violated: assertFalse(n_1 % 2 == 0) //[2]");
    assertTrue(n_1 % 2 == 1, "Path condition is violated: assertTrue(n_1 % 2 == 1) //[3]");
    odd_count_1 += 1;
    assertFalse(1 < c_array_1.length, "Path condition is violated: assertFalse(1 < c_array_1.length) //[4]");
    return new int[] { 0, 1 };
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
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    int n_1 = c_1 - '0';
    assertFalse(n_1 % 2 == 0); //[2]
    assertTrue(n_1 % 2 == 1); //[3]
    odd_count_1 += 1;
    assertFalse(1 < c_array_1.length); //[4]
    return new int[] { 0, 1 };
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < (Math.abs(num) + "").toCharArray().length)
2#assertFalse(c_array_1[0] - '0' % 2 == 0)
3#assertTrue(c_array_1[0] - '0' % 2 == 1)
4#assertFalse(1 < (Math.abs(num) + "").toCharArray().length)

*/
