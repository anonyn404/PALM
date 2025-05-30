import java.util.*;

class CYCPATTERN_CHECK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean cycpattern_check(String a, String b){
    int l_1 = b.length();
    String pat_1 = b + b;
    int i_1 = 0;
    assertFalse(0 < a.length() - l_1 + 1, "Path condition is violated: assertFalse(0 < a.length() - l_1 + 1) //[1]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean cycpattern_check(String a, String b){
    int l_1 = b.length();
    String pat_1 = b + b;
    int i_1 = 0;
    assertFalse(0 < a.length() - l_1 + 1); //[1]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < a.length() - b.length() + 1)

*/
