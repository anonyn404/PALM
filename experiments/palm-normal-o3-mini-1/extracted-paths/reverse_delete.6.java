import java.util.*;
import java.util.ArrayList;

class REVERSE_DELETE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void reverse_delete(String s, String c){
    String new_s_1 = "";
    int i_1 = 0;
    assertFalse(0 < s.length(), "Path condition is violated: assertFalse(0 < s.length()) //[1]");
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertTrue(i_2 >= 0, "Path condition is violated: assertTrue(i_2 >= 0) //[2]");
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
    assertFalse(0 < s.length()); //[1]
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertTrue(i_2 >= 0); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < s.length())
2#assertTrue("".length() - 1 >= 0)

*/
