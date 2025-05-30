import java.util.*;

class CYCPATTERN_CHECK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean cycpattern_check(String a, String b){
    int l_1 = b.length();
    String pat_1 = b + b;
    int i_1 = 0;
    assertTrue(0 < a.length() - l_1 + 1, "Path condition is violated: assertTrue(0 < a.length() - l_1 + 1) //[1]");
    int j_1 = 0;
    assertFalse(0 < l_1 + 1, "Path condition is violated: assertFalse(0 < l_1 + 1) //[2]");
    i_1 += 1;
    assertTrue(1 < a.length() - l_1 + 1, "Path condition is violated: assertTrue(1 < a.length() - l_1 + 1) //[3]");
    int j_2 = 0;
    assertTrue(0 < l_1 + 1, "Path condition is violated: assertTrue(0 < l_1 + 1) //[4]");
    assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(0, 0 + l_1)), "Path condition is violated: assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(0, 0 + l_1))) //[5]");
    j_2 += 1;
    assertTrue(1 < l_1 + 1, "Path condition is violated: assertTrue(1 < l_1 + 1) //[6]");
    assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(1, 1 + l_1)), "Path condition is violated: assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(1, 1 + l_1))) //[7]");
    j_2 += 1;
    assertFalse(2 < l_1 + 1, "Path condition is violated: assertFalse(2 < l_1 + 1) //[8]");
    i_1 += 1;
    assertFalse(2 < a.length() - l_1 + 1, "Path condition is violated: assertFalse(2 < a.length() - l_1 + 1) //[9]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean cycpattern_check(String a, String b){
    int l_1 = b.length();
    String pat_1 = b + b;
    int i_1 = 0;
    assertTrue(0 < a.length() - l_1 + 1); //[1]
    int j_1 = 0;
    assertFalse(0 < l_1 + 1); //[2]
    i_1 += 1;
    assertTrue(1 < a.length() - l_1 + 1); //[3]
    int j_2 = 0;
    assertTrue(0 < l_1 + 1); //[4]
    assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(0, 0 + l_1))); //[5]
    j_2 += 1;
    assertTrue(1 < l_1 + 1); //[6]
    assertFalse(a.substring(1, 1 + l_1).equals(pat_1.substring(1, 1 + l_1))); //[7]
    j_2 += 1;
    assertFalse(2 < l_1 + 1); //[8]
    i_1 += 1;
    assertFalse(2 < a.length() - l_1 + 1); //[9]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < a.length() - b.length() + 1)
2#assertFalse(0 < b.length() + 1)
3#assertTrue(1 < a.length() - b.length() + 1)
4#assertTrue(0 < b.length() + 1)
5#assertFalse(a.substring(1, 1 + l_1).equals((b + b).substring(0, 0 + b.length())))
6#assertTrue(1 < b.length() + 1)
7#assertFalse(a.substring(1, 1 + l_1).equals((b + b).substring(1, 1 + b.length())))
8#assertFalse(2 < b.length() + 1)
9#assertFalse(2 < a.length() - b.length() + 1)

*/
