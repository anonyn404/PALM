import java.util.*;

class X_OR_Y {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int x_or_y(int n, int x, int y){
    assertFalse(n == 1, "Path condition is violated: assertFalse(n == 1) //[1]");
    int i_1 = 2;
    assertTrue(2 < n, "Path condition is violated: assertTrue(2 < n) //[2]");
    assertFalse(n % 2 == 0, "Path condition is violated: assertFalse(n % 2 == 0) //[3]");
    i_1 += 1;
    assertTrue(3 < n, "Path condition is violated: assertTrue(3 < n) //[4]");
    assertFalse(n % 3 == 0, "Path condition is violated: assertFalse(n % 3 == 0) //[5]");
    i_1 += 1;
    assertFalse(4 < n, "Path condition is violated: assertFalse(4 < n) //[6]");
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
    assertTrue(2 < n); //[2]
    assertFalse(n % 2 == 0); //[3]
    i_1 += 1;
    assertTrue(3 < n); //[4]
    assertFalse(n % 3 == 0); //[5]
    i_1 += 1;
    assertFalse(4 < n); //[6]
    return x;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 1)
2#assertTrue(2 < n)
3#assertFalse(n % 2 == 0)
4#assertTrue(3 < n)
5#assertFalse(n % 3 == 0)
6#assertFalse(4 < n)

*/
