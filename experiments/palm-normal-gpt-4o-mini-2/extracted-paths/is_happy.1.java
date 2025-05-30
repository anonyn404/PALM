import java.util.*;

class IS_HAPPY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_happy(String s){
    assertTrue(s.length() < 3, "Path condition is violated: assertTrue(s.length() < 3) //[1]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean is_happy(String s){
    assertTrue(s.length() < 3); //[1]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(s.length() < 3)

*/
