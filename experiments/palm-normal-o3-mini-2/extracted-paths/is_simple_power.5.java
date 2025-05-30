import java.util.*;

class IS_SIMPLE_POWER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_simple_power(int x, int n){
    assertFalse(n == 1, "Path condition is violated: assertFalse(n == 1) //[1]");
    int power_1 = 1;
    assertTrue(1 < x, "Path condition is violated: assertTrue(1 < x) //[2]");
    power_1 *= n;
    assertFalse(power_1 < x, "Path condition is violated: assertFalse(power_1 < x) //[3]");
    return power_1 == x;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean is_simple_power(int x, int n){
    assertFalse(n == 1); //[1]
    int power_1 = 1;
    assertTrue(1 < x); //[2]
    power_1 *= n;
    assertFalse(power_1 < x); //[3]
    return power_1 == x;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 1)
2#assertTrue(1 < x)
3#assertFalse(1 * n < x)

*/
