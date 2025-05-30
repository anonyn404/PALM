import java.util.*;
import java.util.HashSet;

class COUNT_DISTINCT_CHARACTERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int count_distinct_characters(String string){
    HashSet<Character> distinct_1 = new HashSet<Character>();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[1]");
    return distinct_1.size();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashSet;
public static int count_distinct_characters(String string){
    HashSet<Character> distinct_1 = new HashSet<Character>();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[1]
    return distinct_1.size();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < string.toCharArray().length)

*/
