import java.util.*;

class PRIME_LENGTH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean prime_length(String string){
    int l_1 = string.length();
    assertFalse(l_1 <= 1, "Path condition is violated: assertFalse(l_1 <= 1) //[1]");
    int i_1 = 2;
    assertFalse(2 < l_1, "Path condition is violated: assertFalse(2 < l_1) //[2]");
    return true;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean prime_length(String string){
    int l_1 = string.length();
    assertFalse(l_1 <= 1); //[1]
    int i_1 = 2;
    assertFalse(2 < l_1); //[2]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(string.length() <= 1)
2#assertFalse(2 < string.length())

*/
