import java.util.*;

class HEX_KEY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void hex_key(String num){
    int result_1 = 0;
    char[] c_array_1 = num.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length, "Path condition is violated: assertTrue(0 < c_array_1.length) //[1]");
    c_1 = c_array_1[0];
    assertTrue(c_1 == '2' || c_1 == '3' || c_1 == '5' || c_1 == '7' || c_1 == 'B' || c_1 == 'D', "Path condition is violated: assertTrue(c_1 == '2' || c_1 == '3' || c_1 == '5' || c_1 == '7' || c_1 == 'B' || c_1 == 'D') //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void hex_key(String num){
    int result_1 = 0;
    char[] c_array_1 = num.toCharArray();
    char c_1;
    assertTrue(0 < c_array_1.length); //[1]
    c_1 = c_array_1[0];
    assertTrue(c_1 == '2' || c_1 == '3' || c_1 == '5' || c_1 == '7' || c_1 == 'B' || c_1 == 'D'); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < num.toCharArray().length)
2#assertTrue(c_array_1[0] == '2' || c_array_1[0] == '3' || c_array_1[0] == '5' || c_array_1[0] == '7' || c_array_1[0] == 'B' || c_array_1[0] == 'D')

*/
