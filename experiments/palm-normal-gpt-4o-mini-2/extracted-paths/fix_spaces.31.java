import java.util.*;

class FIX_SPACES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void fix_spaces(String text){
    String new_text_1 = "";
    int i_1 = 0;
    int start_1 = 0;
    int end_1 = 0;
    assertTrue(0 < text.length(), "Path condition is violated: assertTrue(0 < text.length()) //[1]");
    assertFalse(text.charAt(0) == ' ', "Path condition is violated: assertFalse(text.charAt(0) == ' ') //[2]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[3]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[4]");
    new_text_1 += text.substring(0, 1);
    start_1 = 1;
    end_1 = 1;
    i_1 += 1;
    assertTrue(1 < text.length(), "Path condition is violated: assertTrue(1 < text.length()) //[5]");
    assertFalse(text.charAt(1) == ' ', "Path condition is violated: assertFalse(text.charAt(1) == ' ') //[6]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[7]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[8]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void fix_spaces(String text){
    String new_text_1 = "";
    int i_1 = 0;
    int start_1 = 0;
    int end_1 = 0;
    assertTrue(0 < text.length()); //[1]
    assertFalse(text.charAt(0) == ' '); //[2]
    assertFalse(false); //[3]
    assertFalse(false); //[4]
    new_text_1 += text.substring(0, 1);
    start_1 = 1;
    end_1 = 1;
    i_1 += 1;
    assertTrue(1 < text.length()); //[5]
    assertFalse(text.charAt(1) == ' '); //[6]
    assertFalse(false); //[7]
    assertFalse(false); //[8]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < text.length())
2#assertFalse(text.charAt(0) == ' ')
3#assertFalse(false)
4#assertFalse(false)
5#assertTrue(1 < text.length())
6#assertFalse(text.charAt(1) == ' ')
7#assertFalse(false)
8#assertFalse(false)

*/
