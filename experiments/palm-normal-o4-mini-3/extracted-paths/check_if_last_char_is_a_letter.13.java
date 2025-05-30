import java.util.*;

class CHECK_IF_LAST_CHAR_IS_A_LETTER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean check_if_last_char_is_a_letter(String txt){
    String[] parts_1 = txt.split(" ");
    String last_1 = " ";
    assertTrue(parts_1.length != 0, "Path condition is violated: assertTrue(parts_1.length != 0) //[1]");
    last_1 = parts_1[parts_1.length - 1];
    assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ', "Path condition is violated: assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ') //[2]");
    last_1 = " ";
    assertTrue(txt.length() == 0, "Path condition is violated: assertTrue(txt.length() == 0) //[3]");
    last_1 = " ";
    int last_char_pos_1 = Character.toLowerCase(last_1.charAt(0)) - 'a';
    return (last_1.length() == 1) && (0 <= last_char_pos_1 && last_char_pos_1 <= 25);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean check_if_last_char_is_a_letter(String txt){
    String[] parts_1 = txt.split(" ");
    String last_1 = " ";
    assertTrue(parts_1.length != 0); //[1]
    last_1 = parts_1[parts_1.length - 1];
    assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' '); //[2]
    last_1 = " ";
    assertTrue(txt.length() == 0); //[3]
    last_1 = " ";
    int last_char_pos_1 = Character.toLowerCase(last_1.charAt(0)) - 'a';
    return (last_1.length() == 1) && (0 <= last_char_pos_1 && last_char_pos_1 <= 25);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(txt.split(" ").length != 0)
2#assertTrue(txt.length() != 0 && txt.charAt(txt.length() - 1) == ' ')
3#assertTrue(txt.length() == 0)

*/
