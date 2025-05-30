import java.util.*;

class BELOW_THRESHOLD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean below_threshold(int[] l, int t){
    int i_1 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[1]");
    assertTrue(l[0] >= t, "Path condition is violated: assertTrue(l[0] >= t) //[2]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean below_threshold(int[] l, int t){
    int i_1 = 0;
    assertTrue(0 < l.length); //[1]
    assertTrue(l[0] >= t); //[2]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.length)
2#assertTrue(l[0] >= t)

*/
