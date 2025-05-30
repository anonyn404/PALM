import java.util.*;

class PLUCK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void pluck(int[] arr){
    int min_even_1 = Integer.MAX_VALUE;
    int index_1 = -1;
    int i_1 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[1]");
    assertFalse(arr[0] % 2 == 0 && arr[0] < min_even_1, "Path condition is violated: assertFalse(arr[0] % 2 == 0 && arr[0] < min_even_1) //[2]");
    i_1 += 1;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[3]");
    assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1, "Path condition is violated: assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void pluck(int[] arr){
    int min_even_1 = Integer.MAX_VALUE;
    int index_1 = -1;
    int i_1 = 0;
    assertTrue(0 < arr.length); //[1]
    assertFalse(arr[0] % 2 == 0 && arr[0] < min_even_1); //[2]
    i_1 += 1;
    assertTrue(1 < arr.length); //[3]
    assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < arr.length)
2#assertFalse(arr[0] % 2 == 0 && arr[0] < Integer.MAX_VALUE)
3#assertTrue(1 < arr.length)
4#assertTrue(arr[1] % 2 == 0 && arr[1] < Integer.MAX_VALUE)

*/
