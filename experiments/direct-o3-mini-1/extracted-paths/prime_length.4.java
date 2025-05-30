import java.util.*;

class PRIME_LENGTH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean prime_length(String string){
    int l_1 = string.length();
    assertFalse(l_1 <= 1, "Path condition is violated: assertFalse(l_1 <= 1) //[1]");
    int i_1 = 2;
    assertTrue(2 < l_1, "Path condition is violated: assertTrue(2 < l_1) //[2]");
    assertFalse(l_1 % 2 == 0, "Path condition is violated: assertFalse(l_1 % 2 == 0) //[3]");
    i_1 += 1;
    assertTrue(3 < l_1, "Path condition is violated: assertTrue(3 < l_1) //[4]");
    assertTrue(l_1 % 3 == 0, "Path condition is violated: assertTrue(l_1 % 3 == 0) //[5]");
    return false;
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
    assertTrue(2 < l_1); //[2]
    assertFalse(l_1 % 2 == 0); //[3]
    i_1 += 1;
    assertTrue(3 < l_1); //[4]
    assertTrue(l_1 % 3 == 0); //[5]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(string.length() <= 1)
2#assertTrue(2 < string.length())
3#assertFalse(string.length() % 2 == 0)
4#assertTrue(3 < string.length())
5#assertTrue(string.length() % 3 == 0)

*/
