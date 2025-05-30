import java.util.*;

class IS_HAPPY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void is_happy(String s){
    assertFalse(s.length() < 3, "Path condition is violated: assertFalse(s.length() < 3) //[1]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void is_happy(String s){
    assertFalse(s.length() < 3); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(s.length() < 3)

*/
