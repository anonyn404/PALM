import java.util.*;

class ENCRYPT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void encrypt(String s){
    StringBuilder sb_1 = new StringBuilder();
    String d_1 = "abcdefghijklmnopqrstuvwxyz";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertFalse('a' <= c_1 && c_1 <= 'z', "Path condition is violated: assertFalse('a' <= c_1 && c_1 <= 'z') //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void encrypt(String s){
    StringBuilder sb_1 = new StringBuilder();
    String d_1 = "abcdefghijklmnopqrstuvwxyz";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertFalse('a' <= c_1 && c_1 <= 'z'); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertFalse('a' <= c_array_1[0] && c_array_1[0] <= 'z')

*/
