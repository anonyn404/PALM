import java.util.*;

class X_OR_Y {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void x_or_y(int n, int x, int y){
    assertFalse(n == 1, "Path condition is violated: assertFalse(n == 1) //[1]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void x_or_y(int n, int x, int y){
    assertFalse(n == 1); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 1)

*/
