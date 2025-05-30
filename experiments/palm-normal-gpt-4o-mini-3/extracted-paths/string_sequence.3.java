import java.util.*;

class STRING_SEQUENCE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String string_sequence(int n){
    String result_1 = "";
    int i_1 = 0;
    assertTrue(0 <= n, "Path condition is violated: assertTrue(0 <= n) //[1]");
    result_1 += 0 + " ";
    i_1 += 1;
    assertFalse(1 <= n, "Path condition is violated: assertFalse(1 <= n) //[2]");
    return result_1.trim();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String string_sequence(int n){
    String result_1 = "";
    int i_1 = 0;
    assertTrue(0 <= n); //[1]
    result_1 += 0 + " ";
    i_1 += 1;
    assertFalse(1 <= n); //[2]
    return result_1.trim();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 <= n)
2#assertFalse(1 <= n)

*/
