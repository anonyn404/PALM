import java.util.*;

class BELOW_THRESHOLD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean below_threshold(int[] l, int t){
    int i_1 = 0;
    assertFalse(0 < l.length, "Path condition is violated: assertFalse(0 < l.length) //[1]");
    return true;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean below_threshold(int[] l, int t){
    int i_1 = 0;
    assertFalse(0 < l.length); //[1]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < l.length)

*/
