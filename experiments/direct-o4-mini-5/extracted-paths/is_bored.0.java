import java.util.*;

class IS_BORED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int is_bored(String S){
    String[] sentences_1 = S.split("\\.|\\?|!");
    int result_1 = 0;
    String sentence_1;
    assertFalse(0 < sentences_1.length, "Path condition is violated: assertFalse(0 < sentences_1.length) //[1]");
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
    assertFalse(0 < sentences_1.length); //[1]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < S.split("\\.|\\?|!").length)

*/
