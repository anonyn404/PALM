import java.util.*;

class CIRCULAR_SHIFT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String circular_shift(int x, int shift){
    String s_1 = x + "";
    assertFalse(shift > s_1.length(), "Path condition is violated: assertFalse(shift > s_1.length()) //[1]");
    return s_1.substring(s_1.length() - shift) + s_1.substring(0, s_1.length() - shift);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String circular_shift(int x, int shift){
    String s_1 = x + "";
    assertFalse(shift > s_1.length()); //[1]
    return s_1.substring(s_1.length() - shift) + s_1.substring(0, s_1.length() - shift);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(shift > (x + "").length())

*/
