import java.util.*;
import java.util.Arrays;

class SORT_EVEN {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void sort_even(int[] l){
    int[] result_1 = new int[l.length];
    int[] evens_1 = new int[(int) Math.ceil(l.length / 2.)];
    int i_1 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[1]");
    evens_1[(int) i_1 / 2] = l[0];
    i_1 += 2;
    assertFalse(2 < l.length, "Path condition is violated: assertFalse(2 < l.length) //[2]");
    Arrays.sort(evens_1);
    int i_2 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[3]");
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
    assertTrue(0 < l.length); //[1]
    evens_1[(int) i_1 / 2] = l[0];
    i_1 += 2;
    assertFalse(2 < l.length); //[2]
    Arrays.sort(evens_1);
    int i_2 = 0;
    assertTrue(0 < l.length); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.length)
2#assertFalse(2 < l.length)
3#assertTrue(0 < l.length)

*/
