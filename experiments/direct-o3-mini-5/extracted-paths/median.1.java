import java.util.*;
import java.util.Arrays;

class MEDIAN {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double median(int[] list){
    Arrays.sort(list);
    assertFalse(list.length % 2 == 1, "Path condition is violated: assertFalse(list.length % 2 == 1) //[1]");
    return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.Arrays;
public static double median(int[] list){
    Arrays.sort(list);
    assertFalse(list.length % 2 == 1); //[1]
    return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(list.length % 2 == 1)

*/
