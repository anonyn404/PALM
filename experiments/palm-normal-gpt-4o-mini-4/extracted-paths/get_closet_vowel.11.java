import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class GET_CLOSET_VOWEL {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void get_closet_vowel(String word){
    assertFalse(word.length() < 3, "Path condition is violated: assertFalse(word.length() < 3) //[1]");
    ArrayList<Character> vowels_1 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int i_1 = word.length() - 2;
    assertTrue(i_1 > 0, "Path condition is violated: assertTrue(i_1 > 0) //[2]");
    assertTrue(vowels_1.contains(word.charAt(i_1)), "Path condition is violated: assertTrue(vowels_1.contains(word.charAt(i_1))) //[3]");
    assertFalse(!vowels_1.contains(word.charAt(i_1 + 1)) && !vowels_1.contains(word.charAt(i_1 - 1)), "Path condition is violated: assertFalse(!vowels_1.contains(word.charAt(i_1 + 1)) && !vowels_1.contains(word.charAt(i_1 - 1))) //[4]");
    i_1--;
    assertTrue(i_1 > 0, "Path condition is violated: assertTrue(i_1 > 0) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public static void get_closet_vowel(String word){
    assertFalse(word.length() < 3); //[1]
    ArrayList<Character> vowels_1 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int i_1 = word.length() - 2;
    assertTrue(i_1 > 0); //[2]
    assertTrue(vowels_1.contains(word.charAt(i_1))); //[3]
    assertFalse(!vowels_1.contains(word.charAt(i_1 + 1)) && !vowels_1.contains(word.charAt(i_1 - 1))); //[4]
    i_1--;
    assertTrue(i_1 > 0); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(word.length() < 3)
2#assertTrue(word.length() - 2 > 0)
3#assertTrue((new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'))).contains(word.charAt(word.length() - 2)))
4#assertFalse(!(new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'))).contains(word.charAt(word.length() - 2 + 1)) && !(new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'))).contains(word.charAt(word.length() - 2 - 1)))
5#assertTrue(word.length() - 2 > 0)

*/
