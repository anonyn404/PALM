import java.util.*;

class FLIP_CASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String flip_case(String string){
    char[] char_list_1 = string.toCharArray();
    int i_1 = 0;
    assertTrue(0 < char_list_1.length, "Path condition is violated: assertTrue(0 < char_list_1.length) //[1]");
    char c_1 = char_list_1[0];
    assertFalse(Character.isLowerCase(c_1), "Path condition is violated: assertFalse(Character.isLowerCase(c_1)) //[2]");
    char_list_1[i_1] = Character.toLowerCase(c_1);
    i_1 += 1;
    assertFalse(1 < char_list_1.length, "Path condition is violated: assertFalse(1 < char_list_1.length) //[3]");
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
    assertTrue(0 < char_list_1.length); //[1]
    char c_1 = char_list_1[0];
    assertFalse(Character.isLowerCase(c_1)); //[2]
    char_list_1[i_1] = Character.toLowerCase(c_1);
    i_1 += 1;
    assertFalse(1 < char_list_1.length); //[3]
    return new String(char_list_1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.toCharArray().length)
2#assertFalse(Character.isLowerCase(string.toCharArray()[0]))
3#assertFalse(1 < string.toCharArray().length)

*/
