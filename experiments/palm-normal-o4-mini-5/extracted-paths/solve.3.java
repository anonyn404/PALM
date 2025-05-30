import java.util.*;

class SOLVE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String solve(int N){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < (N + "").length(), "Path condition is violated: assertTrue(0 < (N + \"\").length()) //[1]");
    sum_1 += Integer.parseInt((N + "").substring(0, 1));
    i_1 += 1;
    assertFalse(1 < (N + "").length(), "Path condition is violated: assertFalse(1 < (N + \"\").length()) //[2]");
    return Integer.toBinaryString(sum_1);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String solve(int N){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < (N + "").length()); //[1]
    sum_1 += Integer.parseInt((N + "").substring(0, 1));
    i_1 += 1;
    assertFalse(1 < (N + "").length()); //[2]
    return Integer.toBinaryString(sum_1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < (N + "").length())
2#assertFalse(1 < (N + "").length())

*/
