import java.util.*;

class STARTS_ONE_ENDS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int starts_one_ends(int n){
    assertFalse(n == 1, "Path condition is violated: assertFalse(n == 1) //[1]");
    return (int) (18 * Math.pow(10, n - 2));
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int starts_one_ends(int n){
    assertFalse(n == 1); //[1]
    return (int) (18 * Math.pow(10, n - 2));
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 1)

*/
