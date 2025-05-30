import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class GET_CLOSET_VOWEL {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String get_closet_vowel(String word){
    assertFalse(word.length() < 3, "Path condition is violated: assertFalse(word.length() < 3) //[1]");
    ArrayList<Character> vowels_1 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int i_1 = word.length() - 2;
    assertFalse(i_1 > 0, "Path condition is violated: assertFalse(i_1 > 0) //[2]");
    return "";
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public static String get_closet_vowel(String word){
    assertFalse(word.length() < 3); //[1]
    ArrayList<Character> vowels_1 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int i_1 = word.length() - 2;
    assertFalse(i_1 > 0); //[2]
    return "";
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(word.length() < 3)
2#assertFalse(word.length() - 2 > 0)

*/
