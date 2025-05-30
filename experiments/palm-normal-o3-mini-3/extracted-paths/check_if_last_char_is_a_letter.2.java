import java.util.*;

class CHECK_IF_LAST_CHAR_IS_A_LETTER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void check_if_last_char_is_a_letter(String txt){
    String[] parts_1 = txt.split(" ");
    String last_1 = " ";
    assertFalse(parts_1.length != 0, "Path condition is violated: assertFalse(parts_1.length != 0) //[1]");
    assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ', "Path condition is violated: assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ') //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void check_if_last_char_is_a_letter(String txt){
    String[] parts_1 = txt.split(" ");
    String last_1 = " ";
    assertFalse(parts_1.length != 0); //[1]
    assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' '); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(txt.split(" ").length != 0)
2#assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ')

*/
