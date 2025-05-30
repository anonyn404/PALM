import java.util.*;
import java.util.HashSet;

class COUNT_DISTINCT_CHARACTERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int count_distinct_characters(String string){
    HashSet<Character> distinct_1 = new HashSet<Character>();
    char[] c_array_1 = string.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertFalse(!distinct_1.contains(Character.toLowerCase(c_1)), "Path condition is violated: assertFalse(!distinct_1.contains(Character.toLowerCase(c_1))) //[2]");
    assertFalse(1 < c_array_1.length, "Path condition is violated: assertFalse(1 < c_array_1.length) //[3]");
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
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertFalse(!distinct_1.contains(Character.toLowerCase(c_1))); //[2]
    assertFalse(1 < c_array_1.length); //[3]
    return distinct_1.size();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.toCharArray().length)
2#assertFalse(!(new HashSet<Character>()).contains(Character.toLowerCase(c_array_1[0])))
3#assertFalse(1 < string.toCharArray().length)

*/
