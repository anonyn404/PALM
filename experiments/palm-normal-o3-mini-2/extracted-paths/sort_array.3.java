import java.util.*;
import java.util.Arrays;

class SORT_ARRAY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] sort_array(int[] array){
    assertFalse(array.length == 0, "Path condition is violated: assertFalse(array.length == 0) //[1]");
    Arrays.sort(array);
    assertTrue((array[0] + array[array.length - 1]) % 2 == 1, "Path condition is violated: assertTrue((array[0] + array[array.length - 1]) % 2 == 1) //[2]");
    return array;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static int[] sort_array(int[] array){
    assertFalse(array.length == 0); //[1]
    Arrays.sort(array);
    assertTrue((array[0] + array[array.length - 1]) % 2 == 1); //[2]
    return array;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(array.length == 0)
2#assertTrue((array[0] + array[array.length - 1]) % 2 == 1)

*/
