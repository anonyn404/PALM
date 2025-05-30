import java.util.*;

class SPLIT_WORDS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void split_words(String txt){
    assertFalse(txt.contains(" "), "Path condition is violated: assertFalse(txt.contains(\" \")) //[1]");
    assertFalse(txt.contains(","), "Path condition is violated: assertFalse(txt.contains(\",\")) //[2]");
    int count_1 = 0;
    int i_1 = 0;
    assertTrue(0 < txt.length(), "Path condition is violated: assertTrue(0 < txt.length()) //[3]");
    char curr_1 = txt.charAt(0);
    assertFalse(Character.isLowerCase(curr_1) && ((curr_1 - 'a') % 2) == 1, "Path condition is violated: assertFalse(Character.isLowerCase(curr_1) && ((curr_1 - 'a') % 2) == 1) //[4]");
    i_1++;
    assertTrue(1 < txt.length(), "Path condition is violated: assertTrue(1 < txt.length()) //[5]");
    char curr_2 = txt.charAt(1);
    assertFalse(Character.isLowerCase(curr_2) && ((curr_2 - 'a') % 2) == 1, "Path condition is violated: assertFalse(Character.isLowerCase(curr_2) && ((curr_2 - 'a') % 2) == 1) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void split_words(String txt){
    assertFalse(txt.contains(" ")); //[1]
    assertFalse(txt.contains(",")); //[2]
    int count_1 = 0;
    int i_1 = 0;
    assertTrue(0 < txt.length()); //[3]
    char curr_1 = txt.charAt(0);
    assertFalse(Character.isLowerCase(curr_1) && ((curr_1 - 'a') % 2) == 1); //[4]
    i_1++;
    assertTrue(1 < txt.length()); //[5]
    char curr_2 = txt.charAt(1);
    assertFalse(Character.isLowerCase(curr_2) && ((curr_2 - 'a') % 2) == 1); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(txt.contains(" "))
2#assertFalse(txt.contains(","))
3#assertTrue(0 < txt.length())
4#assertFalse(Character.isLowerCase(txt.charAt(0)) && ((txt.charAt(0) - 'a') % 2) == 1)
5#assertTrue(1 < txt.length())
6#assertFalse(Character.isLowerCase(txt.charAt(1)) && ((txt.charAt(1) - 'a') % 2) == 1)

*/
