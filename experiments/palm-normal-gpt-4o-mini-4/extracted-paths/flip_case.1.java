import java.util.*;

class FLIP_CASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String flip_case(String string){
    char[] char_list_1 = string.toCharArray();
    int i_1 = 0;
    assertFalse(0 < char_list_1.length, "Path condition is violated: assertFalse(0 < char_list_1.length) //[1]");
    return new String(char_list_1);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String flip_case(String string){
    char[] char_list_1 = string.toCharArray();
    int i_1 = 0;
    assertFalse(0 < char_list_1.length); //[1]
    return new String(char_list_1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < string.toCharArray().length)

*/
