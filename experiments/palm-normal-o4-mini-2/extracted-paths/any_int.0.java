import java.util.*;

class ANY_INT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void any_int(double x, double y, double z){
    assertTrue((int) x == x && (int) y == y && (int) z == z, "Path condition is violated: assertTrue((int) x == x && (int) y == y && (int) z == z) //[1]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void any_int(double x, double y, double z){
    assertTrue((int) x == x && (int) y == y && (int) z == z); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((int) x == x && (int) y == y && (int) z == z)

*/
