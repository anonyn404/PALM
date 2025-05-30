import java.util.*;

class ENCODE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void encode(String message){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = message.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertTrue(Character.isUpperCase(c_1), "Path condition is violated: assertTrue(Character.isUpperCase(c_1)) //[2]");
    c_1 = Character.toLowerCase(c_1);
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void encode(String message){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = message.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertTrue(Character.isUpperCase(c_1)); //[2]
    c_1 = Character.toLowerCase(c_1);
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < message.toCharArray().length)
2#assertTrue(Character.isUpperCase(c_array_1[0]))
3#assertFalse(Character.toLowerCase(c_1) == 'a' || Character.toLowerCase(c_1) == 'e' || Character.toLowerCase(c_1) == 'i' || Character.toLowerCase(c_1) == 'o' || Character.toLowerCase(c_1) == 'u' || Character.toLowerCase(c_1) == 'A' || Character.toLowerCase(c_1) == 'E' || Character.toLowerCase(c_1) == 'I' || Character.toLowerCase(c_1) == 'O' || Character.toLowerCase(c_1) == 'U')

*/
