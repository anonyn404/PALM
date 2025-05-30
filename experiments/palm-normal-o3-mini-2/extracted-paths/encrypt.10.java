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
    assertTrue('a' <= c_1 && c_1 <= 'z', "Path condition is violated: assertTrue('a' <= c_1 && c_1 <= 'z') //[2]");
    sb_1.append(d_1.charAt((d_1.indexOf((int) c_1) + 4) % 26));
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[3]");
    c_1 = c_array_1[1];
    assertTrue('a' <= c_1 && c_1 <= 'z', "Path condition is violated: assertTrue('a' <= c_1 && c_1 <= 'z') //[4]");
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
    assertTrue('a' <= c_1 && c_1 <= 'z'); //[2]
    sb_1.append(d_1.charAt((d_1.indexOf((int) c_1) + 4) % 26));
    assertTrue(1 < c_array_1.length); //[3]
    c_1 = c_array_1[1];
    assertTrue('a' <= c_1 && c_1 <= 'z'); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertTrue('a' <= c_array_1[0] && c_array_1[0] <= 'z')
3#assertTrue(1 < s.toCharArray().length)
4#assertTrue('a' <= c_array_1[1] && c_array_1[1] <= 'z')

*/
