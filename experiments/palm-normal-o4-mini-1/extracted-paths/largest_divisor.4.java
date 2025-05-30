import java.util.*;

class LARGEST_DIVISOR {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void largest_divisor(int n){
    int i_1 = n - 1;
    assertTrue(i_1 >= 1, "Path condition is violated: assertTrue(i_1 >= 1) //[1]");
    assertFalse(n % i_1 == 0, "Path condition is violated: assertFalse(n % i_1 == 0) //[2]");
    i_1 -= 1;
    assertTrue(i_1 >= 1, "Path condition is violated: assertTrue(i_1 >= 1) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void largest_divisor(int n){
    int i_1 = n - 1;
    assertTrue(i_1 >= 1); //[1]
    assertFalse(n % i_1 == 0); //[2]
    i_1 -= 1;
    assertTrue(i_1 >= 1); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(n - 1 >= 1)
2#assertFalse(n % n - 1 == 0)
3#assertTrue((n - 1) - 1 >= 1)

*/
