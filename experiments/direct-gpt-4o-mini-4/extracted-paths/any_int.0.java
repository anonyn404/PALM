import java.util.*;

class ANY_INT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean any_int(double x, double y, double z){
    assertFalse((int) x == x && (int) y == y && (int) z == z, "Path condition is violated: assertFalse((int) x == x && (int) y == y && (int) z == z) //[1]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean any_int(double x, double y, double z){
    assertFalse((int) x == x && (int) y == y && (int) z == z); //[1]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((int) x == x && (int) y == y && (int) z == z)

*/
