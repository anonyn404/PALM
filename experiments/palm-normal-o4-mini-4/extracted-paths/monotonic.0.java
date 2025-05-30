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
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.length)

*/
