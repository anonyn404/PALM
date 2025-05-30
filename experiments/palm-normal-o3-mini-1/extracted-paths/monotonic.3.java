import java.util.*;
import java.util.Arrays;

class MONOTONIC {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void monotonic(int[] l){
    int[] sorted_1 = new int[l.length];
    int[] reverse_sorted_1 = new int[l.length];
    System.arraycopy(l, 0, sorted_1, 0, l.length);
    Arrays.sort(sorted_1);
    int i_1 = 0;
    assertTrue(0 < l.length, "Path condition is violated: assertTrue(0 < l.length) //[1]");
    reverse_sorted_1[i_1] = sorted_1[l.length - 0 - 1];
    i_1 += 1;
    assertFalse(1 < l.length, "Path condition is violated: assertFalse(1 < l.length) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static void monotonic(int[] l){
    int[] sorted_1 = new int[l.length];
    int[] reverse_sorted_1 = new int[l.length];
    System.arraycopy(l, 0, sorted_1, 0, l.length);
    Arrays.sort(sorted_1);
    int i_1 = 0;
    assertTrue(0 < l.length); //[1]
    reverse_sorted_1[i_1] = sorted_1[l.length - 0 - 1];
    i_1 += 1;
    assertFalse(1 < l.length); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.length)
2#assertFalse(1 < l.length)

*/
