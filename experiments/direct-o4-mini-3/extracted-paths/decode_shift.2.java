import java.util.*;

class DECODE_SHIFT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
        sb.append(c);
    }
    return sb.toString();
}
public static String decode_shift(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    c_1 = (char) ((((int) c_1 + 21 - (int) ('a')) % 26) + (int) ('a'));
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[2]");
    c_1 = c_array_1[1];
    c_1 = (char) ((((int) c_1 + 21 - (int) ('a')) % 26) + (int) ('a'));
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[3]");
    return sb_1.toString();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String encode_shift(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        c = (char) ((((int) c + 5 - (int) ('a')) % 26) + (int) ('a'));
        sb.append(c);
    }
    return sb.toString();
}
public static String decode_shift(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    c_1 = (char) ((((int) c_1 + 21 - (int) ('a')) % 26) + (int) ('a'));
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length); //[2]
    c_1 = c_array_1[1];
    c_1 = (char) ((((int) c_1 + 21 - (int) ('a')) % 26) + (int) ('a'));
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length); //[3]
    return sb_1.toString();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.toCharArray().length)
2#assertTrue(1 < string.toCharArray().length)
3#assertFalse(2 < string.toCharArray().length)

*/
