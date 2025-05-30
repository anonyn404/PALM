import java.util.*;

class TRI {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void tri(int n){
    int[] sequence_1 = new int[n + 1];
    assertFalse(n == 0, "Path condition is violated: assertFalse(n == 0) //[1]");
    sequence_1[0] = 1;
    sequence_1[1] = 3;
    int i_1 = 2;
    assertTrue(2 < n + 1, "Path condition is violated: assertTrue(2 < n + 1) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    sequence_1[i_1] = 2;
    i_1++;
    assertTrue(3 < n + 1, "Path condition is violated: assertTrue(3 < n + 1) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void tri(int n){
    int[] sequence_1 = new int[n + 1];
    assertFalse(n == 0); //[1]
    sequence_1[0] = 1;
    sequence_1[1] = 3;
    int i_1 = 2;
    assertTrue(2 < n + 1); //[2]
    assertTrue(true); //[3]
    sequence_1[i_1] = 2;
    i_1++;
    assertTrue(3 < n + 1); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 0)
2#assertTrue(2 < n + 1)
3#assertTrue(true)
4#assertTrue(3 < n + 1)

*/
