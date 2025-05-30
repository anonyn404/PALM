import java.util.*;

class SEARCH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void search(int[] lst){
    int max_1 = -1;
    Integer i_1;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[2]");
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void search(int[] lst){
    int max_1 = -1;
    Integer i_1;
    assertFalse(0 < lst.length); //[1]
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertTrue(0 < lst.length); //[2]
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertTrue(1 < lst.length); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertTrue(0 < lst.length)
3#assertTrue(1 < lst.length)

*/
