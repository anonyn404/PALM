import java.util.*;

class PROD_SIGNS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void prod_signs(int[] arr){
    assertFalse(arr.length == 0, "Path condition is violated: assertFalse(arr.length == 0) //[1]");
    int prod_1 = 1;
    int i_1 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[2]");
    assertTrue(arr[0] == 0, "Path condition is violated: assertTrue(arr[0] == 0) //[3]");
    prod_1 = 0;
    i_1++;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[4]");
    assertFalse(arr[1] == 0, "Path condition is violated: assertFalse(arr[1] == 0) //[5]");
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
    assertTrue(arr[0] == 0); //[3]
    prod_1 = 0;
    i_1++;
    assertTrue(1 < arr.length); //[4]
    assertFalse(arr[1] == 0); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(arr.length == 0)
2#assertTrue(0 < arr.length)
3#assertTrue(arr[0] == 0)
4#assertTrue(1 < arr.length)
5#assertFalse(arr[1] == 0)

*/
