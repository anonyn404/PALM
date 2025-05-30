import java.util.*;

class ROUNDED_AVG {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void rounded_avg(int n, int m){
    assertFalse(m < n, "Path condition is violated: assertFalse(m < n) //[1]");
    int summation_1 = 0;
    int i_1 = n;
    assertTrue(i_1 < m + 1, "Path condition is violated: assertTrue(i_1 < m + 1) //[2]");
    summation_1 += i_1;
    i_1++;
    assertTrue(i_1 < m + 1, "Path condition is violated: assertTrue(i_1 < m + 1) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void rounded_avg(int n, int m){
    assertFalse(m < n); //[1]
    int summation_1 = 0;
    int i_1 = n;
    assertTrue(i_1 < m + 1); //[2]
    summation_1 += i_1;
    i_1++;
    assertTrue(i_1 < m + 1); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(m < n)
2#assertTrue(n < m + 1)
3#assertTrue(n < m + 1)

*/
