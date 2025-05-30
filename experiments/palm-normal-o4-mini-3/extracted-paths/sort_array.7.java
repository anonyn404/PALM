import java.util.*;
import java.util.Arrays;

class SORT_ARRAY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] sort_array(int[] array){
    assertFalse(array.length == 0, "Path condition is violated: assertFalse(array.length == 0) //[1]");
    Arrays.sort(array);
    assertFalse((array[0] + array[array.length - 1]) % 2 == 1, "Path condition is violated: assertFalse((array[0] + array[array.length - 1]) % 2 == 1) //[2]");
    int i_1 = 0;
    assertTrue(0 < array.length / 2, "Path condition is violated: assertTrue(0 < array.length / 2) //[3]");
    int tmp_1 = array[0];
    array[i_1] = array[array.length - 0 - 1];
    array[array.length - i_1 - 1] = tmp_1;
    i_1 += 1;
    assertFalse(1 < array.length / 2, "Path condition is violated: assertFalse(1 < array.length / 2) //[4]");
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
    assertFalse((array[0] + array[array.length - 1]) % 2 == 1); //[2]
    int i_1 = 0;
    assertTrue(0 < array.length / 2); //[3]
    int tmp_1 = array[0];
    array[i_1] = array[array.length - 0 - 1];
    array[array.length - i_1 - 1] = tmp_1;
    i_1 += 1;
    assertFalse(1 < array.length / 2); //[4]
    return array;
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
4#assertFalse(1 < array.length / 2)

*/
