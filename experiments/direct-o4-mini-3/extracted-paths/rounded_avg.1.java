import java.util.*;

class ROUNDED_AVG {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String rounded_avg(int n, int m){
    assertFalse(m < n, "Path condition is violated: assertFalse(m < n) //[1]");
    int summation_1 = 0;
    int i_1 = n;
    assertFalse(i_1 < m + 1, "Path condition is violated: assertFalse(i_1 < m + 1) //[2]");
    double avg_1 = ((double) 0) / ((double) (m - n + 1));
    double rem_1 = avg_1 - Math.floor(avg_1);
    int avg_rounded_1 = 0;
    assertTrue(rem_1 <= 0.5, "Path condition is violated: assertTrue(rem_1 <= 0.5) //[3]");
    avg_rounded_1 = (int) Math.floor(avg_1);
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
    assertFalse(i_1 < m + 1); //[2]
    double avg_1 = ((double) 0) / ((double) (m - n + 1));
    double rem_1 = avg_1 - Math.floor(avg_1);
    int avg_rounded_1 = 0;
    assertTrue(rem_1 <= 0.5); //[3]
    avg_rounded_1 = (int) Math.floor(avg_1);
    return Integer.toBinaryString(avg_rounded_1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(m < n)
2#assertFalse(n < m + 1)
3#assertTrue(((double) 0) / ((double) (m - n + 1)) - Math.floor(((double) 0) / ((double) (m - n + 1))) <= 0.5)

*/
