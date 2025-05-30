import java.util.*;

class MODP {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int modp(int n, int p){
    int result_1 = 1;
    int i_1 = 0;
    assertTrue(0 < n, "Path condition is violated: assertTrue(0 < n) //[1]");
    result_1 = 2 % p;
    i_1 += 1;
    assertTrue(1 < n, "Path condition is violated: assertTrue(1 < n) //[2]");
    result_1 = (2 * result_1) % p;
    i_1 += 1;
    assertFalse(2 < n, "Path condition is violated: assertFalse(2 < n) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int modp(int n, int p){
    int result_1 = 1;
    int i_1 = 0;
    assertTrue(0 < n); //[1]
    result_1 = 2 % p;
    i_1 += 1;
    assertTrue(1 < n); //[2]
    result_1 = (2 * result_1) % p;
    i_1 += 1;
    assertFalse(2 < n); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < n)
2#assertTrue(1 < n)
3#assertFalse(2 < n)

*/
