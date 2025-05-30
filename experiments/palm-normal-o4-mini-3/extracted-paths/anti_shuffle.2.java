import java.util.*;
import java.util.Arrays;

class ANTI_SHUFFLE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void anti_shuffle(String s){
    String result_1 = "";
    java.lang.String[] str_array_1 = s.split(" ");
    String str_1;
    assertTrue(0 < str_array_1.length, "Path condition is violated: assertTrue(0 < str_array_1.length) //[1]");
    str_1 = str_array_1[0];
    char[] chars_1 = str_1.toCharArray();
    Arrays.sort(chars_1);
    result_1 += new String(chars_1) + " ";
    assertTrue(1 < str_array_1.length, "Path condition is violated: assertTrue(1 < str_array_1.length) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static void anti_shuffle(String s){
    String result_1 = "";
    java.lang.String[] str_array_1 = s.split(" ");
    String str_1;
    assertTrue(0 < str_array_1.length); //[1]
    str_1 = str_array_1[0];
    char[] chars_1 = str_1.toCharArray();
    Arrays.sort(chars_1);
    result_1 += new String(chars_1) + " ";
    assertTrue(1 < str_array_1.length); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.split(" ").length)
2#assertTrue(1 < s.split(" ").length)

*/
