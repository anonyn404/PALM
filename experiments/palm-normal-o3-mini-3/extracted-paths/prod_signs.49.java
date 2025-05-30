import java.util.*;

class PROD_SIGNS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void prod_signs(int[] arr){
    assertFalse(arr.length == 0, "Path condition is violated: assertFalse(arr.length == 0) //[1]");
    int prod_1 = 1;
    int i_1 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[2]");
    assertFalse(arr[0] == 0, "Path condition is violated: assertFalse(arr[0] == 0) //[3]");
    assertFalse(arr[0] < 0, "Path condition is violated: assertFalse(arr[0] < 0) //[4]");
    i_1++;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[5]");
    assertTrue(arr[1] == 0, "Path condition is violated: assertTrue(arr[1] == 0) //[6]");
    prod_1 = 0;
    i_1++;
    assertFalse(2 < arr.length, "Path condition is violated: assertFalse(2 < arr.length) //[7]");
    int sum_1 = 0;
    int i_2 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[8]");
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
    assertFalse(arr[0] == 0); //[3]
    assertFalse(arr[0] < 0); //[4]
    i_1++;
    assertTrue(1 < arr.length); //[5]
    assertTrue(arr[1] == 0); //[6]
    prod_1 = 0;
    i_1++;
    assertFalse(2 < arr.length); //[7]
    int sum_1 = 0;
    int i_2 = 0;
    assertTrue(0 < arr.length); //[8]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(arr.length == 0)
2#assertTrue(0 < arr.length)
3#assertFalse(arr[0] == 0)
4#assertFalse(arr[0] < 0)
5#assertTrue(1 < arr.length)
6#assertTrue(arr[1] == 0)
7#assertFalse(2 < arr.length)
8#assertTrue(0 < arr.length)

*/
