import java.util.*;

class HOW_MANY_TIMES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void how_many_times(String string, String substring){
    int times_1 = 0;
    int i_1 = 0;
    assertTrue(0 < string.length() - substring.length() + 1, "Path condition is violated: assertTrue(0 < string.length() - substring.length() + 1) //[1]");
    assertFalse(string.substring(0, 0 + substring.length()).equals(substring), "Path condition is violated: assertFalse(string.substring(0, 0 + substring.length()).equals(substring)) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void how_many_times(String string, String substring){
    int times_1 = 0;
    int i_1 = 0;
    assertTrue(0 < string.length() - substring.length() + 1); //[1]
    assertFalse(string.substring(0, 0 + substring.length()).equals(substring)); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.length() - substring.length() + 1)
2#assertFalse(string.substring(0, 0 + substring.length()).equals(substring))

*/
