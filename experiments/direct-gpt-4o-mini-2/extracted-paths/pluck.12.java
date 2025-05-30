import java.util.*;

class PLUCK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] pluck(int[] arr){
    int min_even_1 = Integer.MAX_VALUE;
    int index_1 = -1;
    int i_1 = 0;
    assertTrue(0 < arr.length, "Path condition is violated: assertTrue(0 < arr.length) //[1]");
    assertTrue(arr[0] % 2 == 0 && arr[0] < min_even_1, "Path condition is violated: assertTrue(arr[0] % 2 == 0 && arr[0] < min_even_1) //[2]");
    min_even_1 = arr[0];
    index_1 = 0;
    i_1 += 1;
    assertTrue(1 < arr.length, "Path condition is violated: assertTrue(1 < arr.length) //[3]");
    assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1, "Path condition is violated: assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1) //[4]");
    min_even_1 = arr[1];
    index_1 = 1;
    i_1 += 1;
    assertFalse(2 < arr.length, "Path condition is violated: assertFalse(2 < arr.length) //[5]");
    assertTrue(1 == -1, "Path condition is violated: assertTrue(1 == -1) //[6]");
    return new int[] {};
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] pluck(int[] arr){
    int min_even_1 = Integer.MAX_VALUE;
    int index_1 = -1;
    int i_1 = 0;
    assertTrue(0 < arr.length); //[1]
    assertTrue(arr[0] % 2 == 0 && arr[0] < min_even_1); //[2]
    min_even_1 = arr[0];
    index_1 = 0;
    i_1 += 1;
    assertTrue(1 < arr.length); //[3]
    assertTrue(arr[1] % 2 == 0 && arr[1] < min_even_1); //[4]
    min_even_1 = arr[1];
    index_1 = 1;
    i_1 += 1;
    assertFalse(2 < arr.length); //[5]
    assertTrue(1 == -1); //[6]
    return new int[] {};
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < arr.length)
2#assertTrue(arr[0] % 2 == 0 && arr[0] < Integer.MAX_VALUE)
3#assertTrue(1 < arr.length)
4#assertTrue(arr[1] % 2 == 0 && arr[1] < arr[0])
5#assertFalse(2 < arr.length)
6#assertTrue(1 == -1)

*/
