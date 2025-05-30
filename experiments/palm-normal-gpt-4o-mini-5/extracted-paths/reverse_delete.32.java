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
    assertTrue(c.indexOf(s.charAt(1)) == -1, "Path condition is violated: assertTrue(c.indexOf(s.charAt(1)) == -1) //[4]");
    new_s_1 += s.charAt(1);
    i_1++;
    assertFalse(2 < s.length(), "Path condition is violated: assertFalse(2 < s.length()) //[5]");
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertTrue(i_2 >= 0, "Path condition is violated: assertTrue(i_2 >= 0) //[6]");
    reverse_s_1 += new_s_1.charAt(i_2);
    i_2--;
    assertTrue(i_2 >= 0, "Path condition is violated: assertTrue(i_2 >= 0) //[7]");
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
    assertTrue(c.indexOf(s.charAt(1)) == -1); //[4]
    new_s_1 += s.charAt(1);
    i_1++;
    assertFalse(2 < s.length()); //[5]
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertTrue(i_2 >= 0); //[6]
    reverse_s_1 += new_s_1.charAt(i_2);
    i_2--;
    assertTrue(i_2 >= 0); //[7]
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
4#assertTrue(c.indexOf(s.charAt(1)) == -1)
5#assertFalse(2 < s.length())
6#assertTrue("" + s.charAt(1).length() - 1 >= 0)
7#assertTrue("" + s.charAt(1).length() - 1 >= 0)

*/
