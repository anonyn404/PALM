import java.util.*;

class MODP {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void modp(int n, int p){
    int result_1 = 1;
    int i_1 = 0;
    assertTrue(0 < n, "Path condition is violated: assertTrue(0 < n) //[1]");
    result_1 = 2 % p;
    i_1 += 1;
    assertTrue(1 < n, "Path condition is violated: assertTrue(1 < n) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void modp(int n, int p){
    int result_1 = 1;
    int i_1 = 0;
    assertTrue(0 < n); //[1]
    result_1 = 2 % p;
    i_1 += 1;
    assertTrue(1 < n); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < n)
2#assertTrue(1 < n)

*/
