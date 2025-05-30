import java.util.*;

class ENCRYPT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String encrypt(String s){
    StringBuilder sb_1 = new StringBuilder();
    String d_1 = "abcdefghijklmnopqrstuvwxyz";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[1]");
    return sb_1.toString();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String encrypt(String s){
    StringBuilder sb_1 = new StringBuilder();
    String d_1 = "abcdefghijklmnopqrstuvwxyz";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[1]
    return sb_1.toString();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < s.toCharArray().length)

*/
