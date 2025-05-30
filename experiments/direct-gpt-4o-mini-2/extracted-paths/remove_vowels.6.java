import java.util.*;

class REMOVE_VOWELS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String remove_vowels(String string){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    char c_lower_1 = Character.toLowerCase(c_1);
    assertFalse(c_lower_1 == 'a' || c_lower_1 == 'e' || c_lower_1 == 'i' || c_lower_1 == 'o' || c_lower_1 == 'u', "Path condition is violated: assertFalse(c_lower_1 == 'a' || c_lower_1 == 'e' || c_lower_1 == 'i' || c_lower_1 == 'o' || c_lower_1 == 'u') //[2]");
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[3]");
    c_1 = c_array_1[1];
    char c_lower_2 = Character.toLowerCase(c_1);
    assertFalse(c_lower_2 == 'a' || c_lower_2 == 'e' || c_lower_2 == 'i' || c_lower_2 == 'o' || c_lower_2 == 'u', "Path condition is violated: assertFalse(c_lower_2 == 'a' || c_lower_2 == 'e' || c_lower_2 == 'i' || c_lower_2 == 'o' || c_lower_2 == 'u') //[4]");
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[5]");
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
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    char c_lower_1 = Character.toLowerCase(c_1);
    assertFalse(c_lower_1 == 'a' || c_lower_1 == 'e' || c_lower_1 == 'i' || c_lower_1 == 'o' || c_lower_1 == 'u'); //[2]
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length); //[3]
    c_1 = c_array_1[1];
    char c_lower_2 = Character.toLowerCase(c_1);
    assertFalse(c_lower_2 == 'a' || c_lower_2 == 'e' || c_lower_2 == 'i' || c_lower_2 == 'o' || c_lower_2 == 'u'); //[4]
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
1#assertTrue(0 < string.toCharArray().length)
2#assertFalse(Character.toLowerCase(c_array_1[0]) == 'a' || Character.toLowerCase(c_array_1[0]) == 'e' || Character.toLowerCase(c_array_1[0]) == 'i' || Character.toLowerCase(c_array_1[0]) == 'o' || Character.toLowerCase(c_array_1[0]) == 'u')
3#assertTrue(1 < string.toCharArray().length)
4#assertFalse(Character.toLowerCase(c_array_1[1]) == 'a' || Character.toLowerCase(c_array_1[1]) == 'e' || Character.toLowerCase(c_array_1[1]) == 'i' || Character.toLowerCase(c_array_1[1]) == 'o' || Character.toLowerCase(c_array_1[1]) == 'u')
5#assertFalse(2 < string.toCharArray().length)

*/
