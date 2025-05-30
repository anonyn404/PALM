import java.util.*;

class REMOVE_VOWELS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String remove_vowels(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[1]");
    return sb_1.toString();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String remove_vowels(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
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
1#assertFalse(0 < string.toCharArray().length)

*/
