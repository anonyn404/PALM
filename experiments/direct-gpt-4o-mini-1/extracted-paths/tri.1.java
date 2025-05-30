import java.util.*;

class TRI {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] tri(int n){
    int[] sequence_1 = new int[n + 1];
    assertFalse(n == 0, "Path condition is violated: assertFalse(n == 0) //[1]");
    sequence_1[0] = 1;
    sequence_1[1] = 3;
    int i_1 = 2;
    assertFalse(2 < n + 1, "Path condition is violated: assertFalse(2 < n + 1) //[2]");
    return sequence_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] tri(int n){
    int[] sequence_1 = new int[n + 1];
    assertFalse(n == 0); //[1]
    sequence_1[0] = 1;
    sequence_1[1] = 3;
    int i_1 = 2;
    assertFalse(2 < n + 1); //[2]
    return sequence_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n == 0)
2#assertFalse(2 < n + 1)

*/
