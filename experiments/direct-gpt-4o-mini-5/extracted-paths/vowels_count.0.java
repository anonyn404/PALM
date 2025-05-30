import java.util.*;

class VOWELS_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int vowels_count(String str){
    int result_1 = 0;
    char[] str_chars_1 = str.toCharArray();
    char c_1;
    assertFalse(0 < str_chars_1.length, "Path condition is violated: assertFalse(0 < str_chars_1.length) //[1]");
    assertFalse(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y', "Path condition is violated: assertFalse(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y') //[2]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int vowels_count(String str){
    int result_1 = 0;
    char[] str_chars_1 = str.toCharArray();
    char c_1;
    assertFalse(0 < str_chars_1.length); //[1]
    assertFalse(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y'); //[2]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < str.toCharArray().length)
2#assertFalse(str.toCharArray()[str.toCharArray().length - 1] == 'y' || str.toCharArray()[str.toCharArray().length - 1] == 'Y')

*/
