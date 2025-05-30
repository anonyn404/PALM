import java.util.*;

class IS_HAPPY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_happy(String s){
    assertFalse(s.length() < 3, "Path condition is violated: assertFalse(s.length() < 3) //[1]");
    int i_1 = 0;
    assertFalse(0 < s.length() - 2, "Path condition is violated: assertFalse(0 < s.length() - 2) //[2]");
    return true;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean is_happy(String s){
    assertFalse(s.length() < 3); //[1]
    int i_1 = 0;
    assertFalse(0 < s.length() - 2); //[2]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(s.length() < 3)
2#assertFalse(0 < s.length() - 2)

*/
