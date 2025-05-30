import java.util.*;

class CAN_ARRANGE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int can_arrange(int[] arr){
    int ind_1 = -1;
    int i_1 = 1;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[1]");
    assertFalse(arr[1] < arr[0], "Path condition is violated: assertFalse(arr[1] < arr[0]) //[2]");
    i_1++;
    assertTrue(2 < arr.length, "Path condition is violated: assertTrue(2 < arr.length) //[3]");
    assertTrue(arr[2] < arr[1], "Path condition is violated: assertTrue(arr[2] < arr[1]) //[4]");
    ind_1 = 2;
    i_1++;
    assertFalse(3 < arr.length, "Path condition is violated: assertFalse(3 < arr.length) //[5]");
    return 2;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int can_arrange(int[] arr){
    int ind_1 = -1;
    int i_1 = 1;
    assertTrue(1 < arr.length); //[1]
    assertFalse(arr[1] < arr[0]); //[2]
    i_1++;
    assertTrue(2 < arr.length); //[3]
    assertTrue(arr[2] < arr[1]); //[4]
    ind_1 = 2;
    i_1++;
    assertFalse(3 < arr.length); //[5]
    return 2;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 < arr.length)
2#assertFalse(arr[1] < arr[0])
3#assertTrue(2 < arr.length)
4#assertTrue(arr[2] < arr[1])
5#assertFalse(3 < arr.length)

*/
