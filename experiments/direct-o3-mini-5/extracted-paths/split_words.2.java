import java.util.*;

class SPLIT_WORDS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String[] split_words(String txt){
    assertFalse(txt.contains(" "), "Path condition is violated: assertFalse(txt.contains(\" \")) //[1]");
    assertFalse(txt.contains(","), "Path condition is violated: assertFalse(txt.contains(\",\")) //[2]");
    int count_1 = 0;
    int i_1 = 0;
    assertFalse(0 < txt.length(), "Path condition is violated: assertFalse(0 < txt.length()) //[3]");
    String[] result_1 = { Integer.toString(0) };
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String[] split_words(String txt){
    assertFalse(txt.contains(" ")); //[1]
    assertFalse(txt.contains(",")); //[2]
    int count_1 = 0;
    int i_1 = 0;
    assertFalse(0 < txt.length()); //[3]
    String[] result_1 = { Integer.toString(0) };
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(txt.contains(" "))
2#assertFalse(txt.contains(","))
3#assertFalse(0 < txt.length())

*/
