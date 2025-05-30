import java.util.*;

class CIRCULAR_SHIFT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String circular_shift(int x, int shift){
    String s_1 = x + "";
    assertTrue(shift > s_1.length(), "Path condition is violated: assertTrue(shift > s_1.length()) //[1]");
    StringBuilder sb_1 = new StringBuilder();
    int i_1 = s_1.length() - 1;
    assertTrue(i_1 >= 0, "Path condition is violated: assertTrue(i_1 >= 0) //[2]");
    sb_1.append(s_1.charAt(i_1));
    i_1 -= 1;
    assertFalse(i_1 >= 0, "Path condition is violated: assertFalse(i_1 >= 0) //[3]");
    return sb_1.toString();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String circular_shift(int x, int shift){
    String s_1 = x + "";
    assertTrue(shift > s_1.length()); //[1]
    StringBuilder sb_1 = new StringBuilder();
    int i_1 = s_1.length() - 1;
    assertTrue(i_1 >= 0); //[2]
    sb_1.append(s_1.charAt(i_1));
    i_1 -= 1;
    assertFalse(i_1 >= 0); //[3]
    return sb_1.toString();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(shift > (x + "").length())
2#assertTrue(x + "".length() - 1 >= 0)
3#assertFalse((x + "".length() - 1) - 1 >= 0)

*/
