import java.util.*;

class ENCODE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String encode(String message){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = message.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertFalse(Character.isUpperCase(c_1), "Path condition is violated: assertFalse(Character.isUpperCase(c_1)) //[2]");
    assertFalse(Character.isLowerCase(c_1), "Path condition is violated: assertFalse(Character.isLowerCase(c_1)) //[3]");
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[4]");
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length, "Path condition is violated: assertTrue(1 < c_array_1.length) //[5]");
    c_1 = c_array_1[1];
    assertFalse(Character.isUpperCase(c_1), "Path condition is violated: assertFalse(Character.isUpperCase(c_1)) //[6]");
    assertFalse(Character.isLowerCase(c_1), "Path condition is violated: assertFalse(Character.isLowerCase(c_1)) //[7]");
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U', "Path condition is violated: assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U') //[8]");
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length, "Path condition is violated: assertFalse(2 < c_array_1.length) //[9]");
    return sb_1.toString();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String encode(String message){
    StringBuilder sb_1 = new StringBuilder();
    char[] c_array_1 = message.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertFalse(Character.isUpperCase(c_1)); //[2]
    assertFalse(Character.isLowerCase(c_1)); //[3]
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[4]
    sb_1.append(c_1);
    assertTrue(1 < c_array_1.length); //[5]
    c_1 = c_array_1[1];
    assertFalse(Character.isUpperCase(c_1)); //[6]
    assertFalse(Character.isLowerCase(c_1)); //[7]
    assertFalse(c_1 == 'a' || c_1 == 'e' || c_1 == 'i' || c_1 == 'o' || c_1 == 'u' || c_1 == 'A' || c_1 == 'E' || c_1 == 'I' || c_1 == 'O' || c_1 == 'U'); //[8]
    sb_1.append(c_1);
    assertFalse(2 < c_array_1.length); //[9]
    return sb_1.toString();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < message.toCharArray().length)
2#assertFalse(Character.isUpperCase(c_array_1[0]))
3#assertFalse(Character.isLowerCase(c_array_1[0]))
4#assertFalse(c_array_1[0] == 'a' || c_array_1[0] == 'e' || c_array_1[0] == 'i' || c_array_1[0] == 'o' || c_array_1[0] == 'u' || c_array_1[0] == 'A' || c_array_1[0] == 'E' || c_array_1[0] == 'I' || c_array_1[0] == 'O' || c_array_1[0] == 'U')
5#assertTrue(1 < message.toCharArray().length)
6#assertFalse(Character.isUpperCase(c_array_1[1]))
7#assertFalse(Character.isLowerCase(c_array_1[1]))
8#assertFalse(c_array_1[1] == 'a' || c_array_1[1] == 'e' || c_array_1[1] == 'i' || c_array_1[1] == 'o' || c_array_1[1] == 'u' || c_array_1[1] == 'A' || c_array_1[1] == 'E' || c_array_1[1] == 'I' || c_array_1[1] == 'O' || c_array_1[1] == 'U')
9#assertFalse(2 < message.toCharArray().length)

*/
