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
public static void decode_shift(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
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
public static void decode_shift(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.toCharArray().length)

*/
