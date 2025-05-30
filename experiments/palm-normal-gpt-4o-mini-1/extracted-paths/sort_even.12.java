import java.util.*;
import java.util.Arrays;

class SORT_EVEN {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void sort_even(int[] l){
    int[] result_1 = new int[l.length];
    int[] evens_1 = new int[(int) Math.ceil(l.length / 2.)];
    int i_1 = 0;
    assertFalse(0 < l.length, "Path condition is violated: assertFalse(0 < l.length) //[1]");
    Arrays.sort(evens_1);
    int i_2 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    result_1[i_2] = evens_1[(int) 0 / 2];
    i_2 += 1;
    assertTrue(1 < l.length, "Path condition is violated: assertTrue(1 < l.length) //[4]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static void sort_even(int[] l){
    int[] result_1 = new int[l.length];
    int[] evens_1 = new int[(int) Math.ceil(l.length / 2.)];
    int i_1 = 0;
    assertFalse(0 < l.length); //[1]
    Arrays.sort(evens_1);
    int i_2 = 0;
    assertTrue(0 < l.length); //[2]
    assertTrue(true); //[3]
    result_1[i_2] = evens_1[(int) 0 / 2];
    i_2 += 1;
    assertTrue(1 < l.length); //[4]
    assertFalse(false); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < l.length)
2#assertTrue(0 < l.length)
3#assertTrue(true)
4#assertTrue(1 < l.length)
5#assertFalse(false)

*/
