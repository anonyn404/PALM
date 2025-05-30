import java.util.*;

class SPLIT_WORDS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String[] split_words(String txt){
    assertTrue(txt.contains(" "), "Path condition is violated: assertTrue(txt.contains(\" \")) //[1]");
    return txt.split(" ");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String[] split_words(String txt){
    assertTrue(txt.contains(" ")); //[1]
    return txt.split(" ");
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(txt.contains(" "))

*/
