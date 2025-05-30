import java.util.*;

class SOLVE_STRING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void solve_string(String s){
    int flg_1 = 0;
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertTrue(Character.isAlphabetic(c_1), "Path condition is violated: assertTrue(Character.isAlphabetic(c_1)) //[2]");
    assertFalse(Character.isLowerCase(c_1), "Path condition is violated: assertFalse(Character.isLowerCase(c_1)) //[3]");
    sb_1.append(Character.toLowerCase(c_1));
    flg_1 = 1;
    assertFalse(1 < c_array_1.length, "Path condition is violated: assertFalse(1 < c_array_1.length) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void solve_string(String s){
    int flg_1 = 0;
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertTrue(Character.isAlphabetic(c_1)); //[2]
    assertFalse(Character.isLowerCase(c_1)); //[3]
    sb_1.append(Character.toLowerCase(c_1));
    flg_1 = 1;
    assertFalse(1 < c_array_1.length); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.toCharArray().length)
2#assertTrue(Character.isAlphabetic(c_array_1[0]))
3#assertFalse(Character.isLowerCase(c_array_1[0]))
4#assertFalse(1 < s.toCharArray().length)

*/
