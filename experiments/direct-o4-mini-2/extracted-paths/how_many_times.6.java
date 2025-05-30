import java.util.*;

class HOW_MANY_TIMES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int how_many_times(String string, String substring){
    int times_1 = 0;
    int i_1 = 0;
    assertTrue(0 < string.length() - substring.length() + 1, "Path condition is violated: assertTrue(0 < string.length() - substring.length() + 1) //[1]");
    assertTrue(string.substring(0, 0 + substring.length()).equals(substring), "Path condition is violated: assertTrue(string.substring(0, 0 + substring.length()).equals(substring)) //[2]");
    times_1 += 1;
    i_1 += 1;
    assertTrue(1 < string.length() - substring.length() + 1, "Path condition is violated: assertTrue(1 < string.length() - substring.length() + 1) //[3]");
    assertTrue(string.substring(1, 1 + substring.length()).equals(substring), "Path condition is violated: assertTrue(string.substring(1, 1 + substring.length()).equals(substring)) //[4]");
    times_1 += 1;
    i_1 += 1;
    assertFalse(2 < string.length() - substring.length() + 1, "Path condition is violated: assertFalse(2 < string.length() - substring.length() + 1) //[5]");
    return 2;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int how_many_times(String string, String substring){
    int times_1 = 0;
    int i_1 = 0;
    assertTrue(0 < string.length() - substring.length() + 1); //[1]
    assertTrue(string.substring(0, 0 + substring.length()).equals(substring)); //[2]
    times_1 += 1;
    i_1 += 1;
    assertTrue(1 < string.length() - substring.length() + 1); //[3]
    assertTrue(string.substring(1, 1 + substring.length()).equals(substring)); //[4]
    times_1 += 1;
    i_1 += 1;
    assertFalse(2 < string.length() - substring.length() + 1); //[5]
    return 2;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.length() - substring.length() + 1)
2#assertTrue(string.substring(0, 0 + substring.length()).equals(substring))
3#assertTrue(1 < string.length() - substring.length() + 1)
4#assertTrue(string.substring(1, 1 + substring.length()).equals(substring))
5#assertFalse(2 < string.length() - substring.length() + 1)

*/
