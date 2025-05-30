import java.util.*;
import java.util.Arrays;

class SORT_ARRAY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void sort_array(int[] array){
    assertFalse(array.length == 0, "Path condition is violated: assertFalse(array.length == 0) //[1]");
    Arrays.sort(array);
    assertFalse((array[0] + array[array.length - 1]) % 2 == 1, "Path condition is violated: assertFalse((array[0] + array[array.length - 1]) % 2 == 1) //[2]");
    int i_1 = 0;
    assertTrue(0 < array.length / 2, "Path condition is violated: assertTrue(0 < array.length / 2) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static void sort_array(int[] array){
    assertFalse(array.length == 0); //[1]
    Arrays.sort(array);
    assertFalse((array[0] + array[array.length - 1]) % 2 == 1); //[2]
    int i_1 = 0;
    assertTrue(0 < array.length / 2); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(array.length == 0)
2#assertFalse((array[0] + array[array.length - 1]) % 2 == 1)
3#assertTrue(0 < array.length / 2)

*/
