import java.util.*;

class VOWELS_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int vowels_count(String str){
    int result_1 = 0;
    char[] str_chars_1 = str.toCharArray();
    char c_1;
    assertTrue(0 < str_chars_1.length, "Path condition is violated: assertTrue(0 < str_chars_1.length) //[1]");
    c_1 = str_chars_1[0];
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[2]");
    assertTrue(1 < str_chars_1.length, "Path condition is violated: assertTrue(1 < str_chars_1.length) //[3]");
    c_1 = str_chars_1[1];
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[4]");
    assertFalse(2 < str_chars_1.length, "Path condition is violated: assertFalse(2 < str_chars_1.length) //[5]");
    assertTrue(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y', "Path condition is violated: assertTrue(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y') //[6]");
    result_1 += 1;
    return 1;
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
    assertTrue(0 < str_chars_1.length); //[1]
    c_1 = str_chars_1[0];
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[2]
    assertTrue(1 < str_chars_1.length); //[3]
    c_1 = str_chars_1[1];
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[4]
    assertFalse(2 < str_chars_1.length); //[5]
    assertTrue(str_chars_1[str_chars_1.length - 1] == 'y' || str_chars_1[str_chars_1.length - 1] == 'Y'); //[6]
    result_1 += 1;
    return 1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < str.toCharArray().length)
2#assertFalse(str_chars_1[0] == 'a' || str_chars_1[0] == 'e' || str_chars_1[0] == 'i' || str_chars_1[0] == 'o' || str_chars_1[0] == 'u' || str_chars_1[0] == 'A' || str_chars_1[0] == 'E' || str_chars_1[0] == 'I' || str_chars_1[0] == 'O' || str_chars_1[0] == 'U')
3#assertTrue(1 < str.toCharArray().length)
4#assertFalse(str_chars_1[1] == 'a' || str_chars_1[1] == 'e' || str_chars_1[1] == 'i' || str_chars_1[1] == 'o' || str_chars_1[1] == 'u' || str_chars_1[1] == 'A' || str_chars_1[1] == 'E' || str_chars_1[1] == 'I' || str_chars_1[1] == 'O' || str_chars_1[1] == 'U')
5#assertFalse(2 < str.toCharArray().length)
6#assertTrue(str.toCharArray()[str.toCharArray().length - 1] == 'y' || str.toCharArray()[str.toCharArray().length - 1] == 'Y')

*/
