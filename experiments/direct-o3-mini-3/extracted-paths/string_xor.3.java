import java.util.*;

class STRING_XOR {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String string_xor(String a, String b){
    String result_1 = "";
    int i_1 = 0;
    assertTrue(0 < a.length(), "Path condition is violated: assertTrue(0 < a.length()) //[1]");
    assertTrue(a.charAt(0) == b.charAt(0), "Path condition is violated: assertTrue(a.charAt(0) == b.charAt(0)) //[2]");
    result_1 += "0";
    i_1 += 1;
    assertTrue(1 < a.length(), "Path condition is violated: assertTrue(1 < a.length()) //[3]");
    assertTrue(a.charAt(1) == b.charAt(1), "Path condition is violated: assertTrue(a.charAt(1) == b.charAt(1)) //[4]");
    result_1 += "0";
    i_1 += 1;
    assertFalse(2 < a.length(), "Path condition is violated: assertFalse(2 < a.length()) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String string_xor(String a, String b){
    String result_1 = "";
    int i_1 = 0;
    assertTrue(0 < a.length()); //[1]
    assertTrue(a.charAt(0) == b.charAt(0)); //[2]
    result_1 += "0";
    i_1 += 1;
    assertTrue(1 < a.length()); //[3]
    assertTrue(a.charAt(1) == b.charAt(1)); //[4]
    result_1 += "0";
    i_1 += 1;
    assertFalse(2 < a.length()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < a.length())
2#assertTrue(a.charAt(0) == b.charAt(0))
3#assertTrue(1 < a.length())
4#assertTrue(a.charAt(1) == b.charAt(1))
5#assertFalse(2 < a.length())

*/
