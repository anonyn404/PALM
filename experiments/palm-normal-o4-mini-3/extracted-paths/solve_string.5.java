import java.util.*;

class SOLVE_STRING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void solve_string(String s){
    int flg_1 = 0;
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = s.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
    sb_1 = new StringBuilder();
    int i_1 = s.length() - 1;
    assertTrue(i_1 >= 0, "Path condition is violated: assertTrue(i_1 >= 0) //[3]");
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
    assertFalse(0 < c_array_1.length); //[1]
    assertTrue(true); //[2]
    sb_1 = new StringBuilder();
    int i_1 = s.length() - 1;
    assertTrue(i_1 >= 0); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < s.toCharArray().length)
2#assertTrue(true)
3#assertTrue(s.length() - 1 >= 0)

*/
