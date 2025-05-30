import java.util.*;

class IS_BORED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int is_bored(String S){
    String[] sentences_1 = S.split("\\.|\\?|!");
    int result_1 = 0;
    String sentence_1;
    assertTrue(0 < sentences_1.length, "Path condition is violated: assertTrue(0 < sentences_1.length) //[1]");
    sentence_1 = sentences_1[0];
    sentence_1 = sentence_1.trim();
    assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals("I "), "Path condition is violated: assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals(\"I \")) //[2]");
    assertTrue(1 < sentences_1.length, "Path condition is violated: assertTrue(1 < sentences_1.length) //[3]");
    sentence_1 = sentences_1[1];
    sentence_1 = sentence_1.trim();
    assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals("I "), "Path condition is violated: assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals(\"I \")) //[4]");
    assertFalse(2 < sentences_1.length, "Path condition is violated: assertFalse(2 < sentences_1.length) //[5]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int is_bored(String S){
    String[] sentences_1 = S.split("\\.|\\?|!");
    int result_1 = 0;
    String sentence_1;
    assertTrue(0 < sentences_1.length); //[1]
    sentence_1 = sentences_1[0];
    sentence_1 = sentence_1.trim();
    assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals("I ")); //[2]
    assertTrue(1 < sentences_1.length); //[3]
    sentence_1 = sentences_1[1];
    sentence_1 = sentence_1.trim();
    assertFalse(sentence_1.length() >= 2 && sentence_1.subSequence(0, 2).equals("I ")); //[4]
    assertFalse(2 < sentences_1.length); //[5]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < S.split("\\.|\\?|!").length)
2#assertFalse((sentence_1.trim()).length() >= 2 && sentence_1.subSequence(0, 2).equals("I "))
3#assertTrue(1 < S.split("\\.|\\?|!").length)
4#assertFalse((sentence_1.trim()).length() >= 2 && sentence_1.subSequence(0, 2).equals("I "))
5#assertFalse(2 < S.split("\\.|\\?|!").length)

*/
