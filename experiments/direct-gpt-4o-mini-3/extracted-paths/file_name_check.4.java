import java.util.*;

class FILE_NAME_CHECK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String file_name_check(String file_name){
    String[] lst_1 = file_name.split("\\.");
    assertFalse(lst_1.length != 2, "Path condition is violated: assertFalse(lst_1.length != 2) //[1]");
    assertFalse(!(lst_1[1].equals("txt") || lst_1[1].equals("exe") || lst_1[1].equals("dll")), "Path condition is violated: assertFalse(!(lst_1[1].equals(\"txt\") || lst_1[1].equals(\"exe\") || lst_1[1].equals(\"dll\"))) //[2]");
    assertFalse(lst_1[0].length() == 0, "Path condition is violated: assertFalse(lst_1[0].length() == 0) //[3]");
    assertFalse(!(('a' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'z') || ('A' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'Z')), "Path condition is violated: assertFalse(!(('a' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'z') || ('A' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'Z'))) //[4]");
    int digit_cnt_1 = 0;
    char[] c_array_1 = file_name.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length, "Path condition is violated: assertFalse(0 < c_array_1.length) //[5]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[6]");
    return "Yes";
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String file_name_check(String file_name){
    String[] lst_1 = file_name.split("\\.");
    assertFalse(lst_1.length != 2); //[1]
    assertFalse(!(lst_1[1].equals("txt") || lst_1[1].equals("exe") || lst_1[1].equals("dll"))); //[2]
    assertFalse(lst_1[0].length() == 0); //[3]
    assertFalse(!(('a' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'z') || ('A' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'Z'))); //[4]
    int digit_cnt_1 = 0;
    char[] c_array_1 = file_name.toCharArray();
    char c_1;
    assertFalse(0 < c_array_1.length); //[5]
    assertFalse(false); //[6]
    return "Yes";
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(file_name.split("\\.").length != 2)
2#assertFalse(!(lst_1[1].equals("txt") || lst_1[1].equals("exe") || lst_1[1].equals("dll")))
3#assertFalse(lst_1[0].length() == 0)
4#assertFalse(!(('a' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'z') || ('A' <= lst_1[0].charAt(0) && lst_1[0].charAt(0) <= 'Z')))
5#assertFalse(0 < file_name.toCharArray().length)
6#assertFalse(false)

*/
