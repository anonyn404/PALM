import java.util.*;

class ROUNDED_AVG {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String rounded_avg(int n, int m){
    assertFalse(m < n, "Path condition is violated: assertFalse(m < n) //[1]");
    int summation_1 = 0;
    int i_1 = n;
    assertTrue(i_1 < m + 1, "Path condition is violated: assertTrue(i_1 < m + 1) //[2]");
    summation_1 += i_1;
    i_1++;
    assertTrue(i_1 < m + 1, "Path condition is violated: assertTrue(i_1 < m + 1) //[3]");
    summation_1 += i_1;
    i_1++;
    assertFalse(i_1 < m + 1, "Path condition is violated: assertFalse(i_1 < m + 1) //[4]");
    double avg_1 = ((double) summation_1) / ((double) (m - n + 1));
    double rem_1 = avg_1 - Math.floor(avg_1);
    int avg_rounded_1 = 0;
    assertFalse(rem_1 <= 0.5, "Path condition is violated: assertFalse(rem_1 <= 0.5) //[5]");
    avg_rounded_1 = (int) Math.ceil(avg_1);
    return Integer.toBinaryString(avg_rounded_1);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String rounded_avg(int n, int m){
    assertFalse(m < n); //[1]
    int summation_1 = 0;
    int i_1 = n;
    assertTrue(i_1 < m + 1); //[2]
    summation_1 += i_1;
    i_1++;
    assertTrue(i_1 < m + 1); //[3]
    summation_1 += i_1;
    i_1++;
    assertFalse(i_1 < m + 1); //[4]
    double avg_1 = ((double) summation_1) / ((double) (m - n + 1));
    double rem_1 = avg_1 - Math.floor(avg_1);
    int avg_rounded_1 = 0;
    assertFalse(rem_1 <= 0.5); //[5]
    avg_rounded_1 = (int) Math.ceil(avg_1);
    return Integer.toBinaryString(avg_rounded_1);
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
4#assertFalse(n < m + 1)
5#assertFalse(((double) (0 + i_1) + i_1) / ((double) (m - n + 1)) - Math.floor(((double) (0 + i_1) + i_1) / ((double) (m - n + 1))) <= 0.5)

*/
