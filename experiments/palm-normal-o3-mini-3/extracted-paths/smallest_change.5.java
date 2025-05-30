import java.util.*;

class SMALLEST_CHANGE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void smallest_change(int[] arr){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < arr.length / 2, "Path condition is violated: assertTrue(0 < arr.length / 2) //[1]");
    assertTrue(arr[0] != arr[arr.length - 0 - 1], "Path condition is violated: assertTrue(arr[0] != arr[arr.length - 0 - 1]) //[2]");
    result_1 += 1;
    i_1 += 1;
    assertTrue(1 < arr.length / 2, "Path condition is violated: assertTrue(1 < arr.length / 2) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void smallest_change(int[] arr){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < arr.length / 2); //[1]
    assertTrue(arr[0] != arr[arr.length - 0 - 1]); //[2]
    result_1 += 1;
    i_1 += 1;
    assertTrue(1 < arr.length / 2); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < arr.length / 2)
2#assertTrue(arr[0] != arr[arr.length - 0 - 1])
3#assertTrue(1 < arr.length / 2)

*/
