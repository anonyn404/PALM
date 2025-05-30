import java.util.*;
import java.util.Arrays;

class MONOTONIC {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean monotonic(int[] l){
    int[] sorted_1 = new int[l.length];
    int[] reverse_sorted_1 = new int[l.length];
    System.arraycopy(l, 0, sorted_1, 0, l.length);
    Arrays.sort(sorted_1);
    int i_1 = 0;
    assertFalse(0 < l.length, "Path condition is violated: assertFalse(0 < l.length) //[1]");
    assertFalse(Arrays.equals(l, sorted_1) || Arrays.equals(l, reverse_sorted_1), "Path condition is violated: assertFalse(Arrays.equals(l, sorted_1) || Arrays.equals(l, reverse_sorted_1)) //[2]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static boolean monotonic(int[] l){
    int[] sorted_1 = new int[l.length];
    int[] reverse_sorted_1 = new int[l.length];
    System.arraycopy(l, 0, sorted_1, 0, l.length);
    Arrays.sort(sorted_1);
    int i_1 = 0;
    assertFalse(0 < l.length); //[1]
    assertFalse(Arrays.equals(l, sorted_1) || Arrays.equals(l, reverse_sorted_1)); //[2]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < l.length)
2#assertFalse(Arrays.equals(l, new int[l.length]) || Arrays.equals(l, new int[l.length]))

*/
