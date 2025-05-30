import java.util.*;

class CAN_ARRANGE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void can_arrange(int[] arr){
    int ind_1 = -1;
    int i_1 = 1;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[1]");
    assertTrue(arr[1] < arr[0], "Path condition is violated: assertTrue(arr[1] < arr[0]) //[2]");
    ind_1 = 1;
    i_1++;
    assertTrue(2 < arr.length, "Path condition is violated: assertTrue(2 < arr.length) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void can_arrange(int[] arr){
    int ind_1 = -1;
    int i_1 = 1;
    assertTrue(1 < arr.length); //[1]
    assertTrue(arr[1] < arr[0]); //[2]
    ind_1 = 1;
    i_1++;
    assertTrue(2 < arr.length); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 < arr.length)
2#assertTrue(arr[1] < arr[0])
3#assertTrue(2 < arr.length)

*/
