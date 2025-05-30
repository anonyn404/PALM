import java.util.*;

class COUNT_UPPER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void count_upper(String s){
    int count_1 = 0;
    int i_1 = 0;
    assertTrue(0 < s.length(), "Path condition is violated: assertTrue(0 < s.length()) //[1]");
    char c_1 = s.charAt(0);
    assertFalse(c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void count_upper(String s){
    int count_1 = 0;
    int i_1 = 0;
    assertTrue(0 < s.length()); //[1]
    char c_1 = s.charAt(0);
    assertFalse(c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.length())
2#assertFalse(s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U')

*/
