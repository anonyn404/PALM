import java.util.*;

class X_OR_Y {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int x_or_y(int n, int x, int y){
    assertTrue(n == 1, "Path condition is violated: assertTrue(n == 1) //[1]");
    return y;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int x_or_y(int n, int x, int y){
    assertTrue(n == 1); //[1]
    return y;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(n == 1)

*/
