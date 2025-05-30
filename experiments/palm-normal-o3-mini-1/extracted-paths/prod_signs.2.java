import java.util.*;

class PROD_SIGNS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void prod_signs(int[] arr){
    assertFalse(arr.length == 0, "Path condition is violated: assertFalse(arr.length == 0) //[1]");
    int prod_1 = 1;
    int i_1 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void prod_signs(int[] arr){
    assertFalse(arr.length == 0); //[1]
    int prod_1 = 1;
    int i_1 = 0;
    assertTrue(0 < arr.length); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(arr.length == 0)
2#assertTrue(0 < arr.length)

*/
