import java.util.*;

class ENCRYPT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String encrypt(String s){
    StringBuilder sb_1 = new StringBuilder();
    String d_1 = "abcdefghijklmnopqrstuvwxyz";
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertFalse('a' <= c_1 && c_1 <= 'z', "Path condition is violated: assertFalse('a' <= c_1 && c_1 <= 'z') //[2]");
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[3]");
    c_1 = c_array_1[1];
    assertFalse('a' <= c_1 && c_1 <= 'z', "Path condition is violated: assertFalse('a' <= c_1 && c_1 <= 'z') //[4]");
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[5]");
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
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertFalse('a' <= c_1 && c_1 <= 'z'); //[2]
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length); //[3]
    c_1 = c_array_1[1];
    assertFalse('a' <= c_1 && c_1 <= 'z'); //[4]
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length); //[5]
    return sb_1.toString();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertFalse('a' <= c_array_1[0] && c_array_1[0] <= 'z')
3#assertTrue(1 < s.toCharArray().length)
4#assertFalse('a' <= c_array_1[1] && c_array_1[1] <= 'z')
5#assertFalse(2 < s.toCharArray().length)

*/
