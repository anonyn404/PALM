import java.util.*;

class X_OR_Y {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int x_or_y(int n, int x, int y){
    assertFalse(n == 1, "Path condition is violated: assertFalse(n == 1) //[1]");
    int i_1 = 2;
    assertFalse(2 < n, "Path condition is violated: assertFalse(2 < n) //[2]");
    return x;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int x_or_y(int n, int x, int y){
    assertFalse(n == 1); //[1]
    int i_1 = 2;
    assertFalse(2 < n); //[2]
    return x;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 1)
2#assertFalse(2 < n)

*/
