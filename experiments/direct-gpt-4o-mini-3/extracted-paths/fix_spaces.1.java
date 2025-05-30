import java.util.*;

class FIX_SPACES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String fix_spaces(String text){
    String new_text_1 = "";
    int i_1 = 0;
    int start_1 = 0;
    int end_1 = 0;
    assertTrue(0 < text.length(), "Path condition is violated: assertTrue(0 < text.length()) //[1]");
    assertTrue(text.charAt(0) == ' ', "Path condition is violated: assertTrue(text.charAt(0) == ' ') //[2]");
    end_1 += 1;
    i_1 += 1;
    assertFalse(1 < text.length(), "Path condition is violated: assertFalse(1 < text.length()) //[3]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[4]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[5]");
    int j_1 = 0;
    assertTrue(true, "Path condition is violated: assertTrue(true) //[6]");
    new_text_1 += "_";
    j_1 += 1;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[7]");
    return new_text_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String fix_spaces(String text){
    String new_text_1 = "";
    int i_1 = 0;
    int start_1 = 0;
    int end_1 = 0;
    assertTrue(0 < text.length()); //[1]
    assertTrue(text.charAt(0) == ' '); //[2]
    end_1 += 1;
    i_1 += 1;
    assertFalse(1 < text.length()); //[3]
    assertFalse(false); //[4]
    assertTrue(true); //[5]
    int j_1 = 0;
    assertTrue(true); //[6]
    new_text_1 += "_";
    j_1 += 1;
    assertFalse(false); //[7]
    return new_text_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < text.length())
2#assertTrue(text.charAt(0) == ' ')
3#assertFalse(1 < text.length())
4#assertFalse(false)
5#assertTrue(true)
6#assertTrue(true)
7#assertFalse(false)

*/
