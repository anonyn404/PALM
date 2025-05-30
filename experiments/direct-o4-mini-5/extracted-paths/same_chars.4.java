import java.util.*;
import java.util.*;

class SAME_CHARS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean same_chars(String s0, String s1){
    HashSet<Character> set0_1 = new HashSet<Character>();
    HashSet<Character> set1_1 = new HashSet<Character>();
    char[] c0_array_1 = s0.toCharArray();
    char c0_1;
    assertTrue(0 < c0_array_1.length, "Path condition is violated: assertTrue(0 < c0_array_1.length) //[1]");
    c0_1 = c0_array_1[0];
    set0_1.add(c0_1);
    assertFalse(1 < c0_array_1.length, "Path condition is violated: assertFalse(1 < c0_array_1.length) //[2]");
    char[] c1_array_1 = s1.toCharArray();
    char c1_1;
    assertTrue(0 < c1_array_1.length, "Path condition is violated: assertTrue(0 < c1_array_1.length) //[3]");
    c1_1 = c1_array_1[0];
    set1_1.add(c1_1);
    assertFalse(1 < c1_array_1.length, "Path condition is violated: assertFalse(1 < c1_array_1.length) //[4]");
    return set0_1.equals(set1_1);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static boolean same_chars(String s0, String s1){
    HashSet<Character> set0_1 = new HashSet<Character>();
    HashSet<Character> set1_1 = new HashSet<Character>();
    char[] c0_array_1 = s0.toCharArray();
    char c0_1;
    assertTrue(0 < c0_array_1.length); //[1]
    c0_1 = c0_array_1[0];
    set0_1.add(c0_1);
    assertFalse(1 < c0_array_1.length); //[2]
    char[] c1_array_1 = s1.toCharArray();
    char c1_1;
    assertTrue(0 < c1_array_1.length); //[3]
    c1_1 = c1_array_1[0];
    set1_1.add(c1_1);
    assertFalse(1 < c1_array_1.length); //[4]
    return set0_1.equals(set1_1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s0.toCharArray().length)
2#assertFalse(1 < s0.toCharArray().length)
3#assertTrue(0 < s1.toCharArray().length)
4#assertFalse(1 < s1.toCharArray().length)

*/
