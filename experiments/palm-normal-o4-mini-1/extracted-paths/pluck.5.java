import java.util.*;

class PLUCK {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] pluck(int[] arr){
    int min_even_1 = Integer.MAX_VALUE;
    int index_1 = -1;
    int i_1 = 0;
    assertFalse(0 < arr.length, "Path condition is violated: assertFalse(0 < arr.length) //[1]");
    assertFalse(index_1 == -1, "Path condition is violated: assertFalse(index_1 == -1) //[2]");
    return new int[] { min_even_1, index_1 };
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
    assertFalse(0 < arr.length); //[1]
    assertFalse(index_1 == -1); //[2]
    return new int[] { min_even_1, index_1 };
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < arr.length)
2#assertFalse(-1 == -1)

*/
