import java.util.*;

class SPLIT_WORDS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void split_words(String txt){
    assertFalse(txt.contains(" "), "Path condition is violated: assertFalse(txt.contains(\" \")) //[1]");
    assertFalse(txt.contains(","), "Path condition is violated: assertFalse(txt.contains(\",\")) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void split_words(String txt){
    assertFalse(txt.contains(" ")); //[1]
    assertFalse(txt.contains(",")); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(txt.contains(" "))
2#assertFalse(txt.contains(","))

*/
