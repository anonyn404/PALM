import java.util.*;

class BELOW_THRESHOLD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void below_threshold(int[] l, int t){
    int i_1 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[1]");
    assertFalse(l[0] >= t, "Path condition is violated: assertFalse(l[0] >= t) //[2]");
    i_1 += 1;
    assertTrue(1 < l.length, "Path condition is violated: assertTrue(1 < l.length) //[3]");
    assertFalse(l[1] >= t, "Path condition is violated: assertFalse(l[1] >= t) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void below_threshold(int[] l, int t){
    int i_1 = 0;
    assertTrue(0 < l.length); //[1]
    assertFalse(l[0] >= t); //[2]
    i_1 += 1;
    assertTrue(1 < l.length); //[3]
    assertFalse(l[1] >= t); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.length)
2#assertFalse(l[0] >= t)
3#assertTrue(1 < l.length)
4#assertFalse(l[1] >= t)

*/
