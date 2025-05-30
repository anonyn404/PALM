import java.util.*;

class SEARCH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int search(int[] lst){
    int max_1 = -1;
    Integer i_1;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    i_1 = lst[0];
    assertTrue(i_1 > max_1, "Path condition is violated: assertTrue(i_1 > max_1) //[2]");
    max_1 = i_1;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[3]");
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[4]");
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[5]");
    int i_3 = 0;
    assertFalse(0 < frq_1.length, "Path condition is violated: assertFalse(0 < frq_1.length) //[6]");
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
    assertTrue(0 < lst.length); //[1]
    i_1 = lst[0];
    assertTrue(i_1 > max_1); //[2]
    max_1 = i_1;
    assertFalse(1 < lst.length); //[3]
    int result_1 = -1;
    int[] frq_1 = new int[max_1 + 1];
    int i_2 = 0;
    assertTrue(0 < lst.length); //[4]
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(1 < lst.length); //[5]
    int i_3 = 0;
    assertFalse(0 < frq_1.length); //[6]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertTrue(lst[0] > -1)
3#assertFalse(1 < lst.length)
4#assertTrue(0 < lst.length)
5#assertFalse(1 < lst.length)
6#assertFalse(0 < new int[i_1 + 1].length)

*/
