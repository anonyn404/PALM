import java.util.*;
import java.util.*;

class SAME_CHARS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void same_chars(String s0, String s1){
    HashSet<Character> set0_1 = new HashSet<Character>();
    HashSet<Character> set1_1 = new HashSet<Character>();
    char[] c0_array_1 = s0.toCharArray();
    char c0_1;
    assertTrue(0 < c0_array_1.length, "Path condition is violated: assertTrue(0 < c0_array_1.length) //[1]");
    c0_1 = c0_array_1[0];
    set0_1.add(c0_1);
    assertTrue(1 < c0_array_1.length, "Path condition is violated: assertTrue(1 < c0_array_1.length) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static void same_chars(String s0, String s1){
    HashSet<Character> set0_1 = new HashSet<Character>();
    HashSet<Character> set1_1 = new HashSet<Character>();
    char[] c0_array_1 = s0.toCharArray();
    char c0_1;
    assertTrue(0 < c0_array_1.length); //[1]
    c0_1 = c0_array_1[0];
    set0_1.add(c0_1);
    assertTrue(1 < c0_array_1.length); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s0.toCharArray().length)
2#assertTrue(1 < s0.toCharArray().length)

*/
