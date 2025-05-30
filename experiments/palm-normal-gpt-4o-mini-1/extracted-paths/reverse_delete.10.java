import java.util.*;
import java.util.ArrayList;

class REVERSE_DELETE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void reverse_delete(String s, String c){
    String new_s_1 = "";
    int i_1 = 0;
    assertTrue(0 < s.length(), "Path condition is violated: assertTrue(0 < s.length()) //[1]");
    assertFalse(c.indexOf(s.charAt(0)) == -1, "Path condition is violated: assertFalse(c.indexOf(s.charAt(0)) == -1) //[2]");
    i_1++;
    assertTrue(1 < s.length(), "Path condition is violated: assertTrue(1 < s.length()) //[3]");
    assertFalse(c.indexOf(s.charAt(1)) == -1, "Path condition is violated: assertFalse(c.indexOf(s.charAt(1)) == -1) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void reverse_delete(String s, String c){
    String new_s_1 = "";
    int i_1 = 0;
    assertTrue(0 < s.length()); //[1]
    assertFalse(c.indexOf(s.charAt(0)) == -1); //[2]
    i_1++;
    assertTrue(1 < s.length()); //[3]
    assertFalse(c.indexOf(s.charAt(1)) == -1); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.length())
2#assertFalse(c.indexOf(s.charAt(0)) == -1)
3#assertTrue(1 < s.length())
4#assertFalse(c.indexOf(s.charAt(1)) == -1)

*/
