import java.util.*;

class SPECIAL_FACTORIAL {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void special_factorial(long n){
    long fact_i_1 = 1, special_fact_1 = 1;
    int i_1 = 1;
    assertTrue(1 <= n, "Path condition is violated: assertTrue(1 <= n) //[1]");
    fact_i_1 *= 1;
    special_fact_1 *= 1;
    i_1++;
    assertTrue(2 <= n, "Path condition is violated: assertTrue(2 <= n) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void special_factorial(long n){
    long fact_i_1 = 1, special_fact_1 = 1;
    int i_1 = 1;
    assertTrue(1 <= n); //[1]
    fact_i_1 *= 1;
    special_fact_1 *= 1;
    i_1++;
    assertTrue(2 <= n); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 <= n)
2#assertTrue(2 <= n)

*/
