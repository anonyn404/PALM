import java.util.*;

class SEARCH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int search(int[] lst){
    int max_1 = -1;
    Integer i_1;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[2]");
    int i_3 = 0;
    assertFalse(0 < frq_1.length, "Path condition is violated: assertFalse(0 < frq_1.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int search(int[] lst){
    int max_1 = -1;
    Integer i_1;
    assertFalse(0 < lst.length); //[1]
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertFalse(0 < lst.length); //[2]
    int i_3 = 0;
    assertFalse(0 < frq_1.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertFalse(0 < lst.length)
3#assertFalse(0 < new int[-1 + 1].length)

*/
