import java.util.*;

class EVEN_ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void even_odd_count(int num){
    int even_count_1 = 0;
    int odd_count_1 = 0;
    char[] c_array_1 = (Math.abs(num) + "").toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    int n_1 = c_1 - '0';
    assertTrue(n_1 % 2 == 0, "Path condition is violated: assertTrue(n_1 % 2 == 0) //[2]");
    even_count_1 += 1;
    assertFalse(n_1 % 2 == 1, "Path condition is violated: assertFalse(n_1 % 2 == 1) //[3]");
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[4]");
    c_1 = c_array_1[1];
    int n_2 = c_1 - '0';
    assertTrue(n_2 % 2 == 0, "Path condition is violated: assertTrue(n_2 % 2 == 0) //[5]");
    even_count_1 += 1;
    assertFalse(n_2 % 2 == 1, "Path condition is violated: assertFalse(n_2 % 2 == 1) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void even_odd_count(int num){
    int even_count_1 = 0;
    int odd_count_1 = 0;
    char[] c_array_1 = (Math.abs(num) + "").toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    int n_1 = c_1 - '0';
    assertTrue(n_1 % 2 == 0); //[2]
    even_count_1 += 1;
    assertFalse(n_1 % 2 == 1); //[3]
    assertTrue(1 < c_array_1.length); //[4]
    c_1 = c_array_1[1];
    int n_2 = c_1 - '0';
    assertTrue(n_2 % 2 == 0); //[5]
    even_count_1 += 1;
    assertFalse(n_2 % 2 == 1); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < (Math.abs(num) + "").toCharArray().length)
2#assertTrue(c_array_1[0] - '0' % 2 == 0)
3#assertFalse(c_array_1[0] - '0' % 2 == 1)
4#assertTrue(1 < (Math.abs(num) + "").toCharArray().length)
5#assertTrue(c_array_1[1] - '0' % 2 == 0)
6#assertFalse(c_array_1[1] - '0' % 2 == 1)

*/
