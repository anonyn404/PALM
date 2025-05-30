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
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[2]");
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[4]");
    int i_3 = 0;
    assertTrue(0 < frq_1.length, "Path condition is violated: assertTrue(0 < frq_1.length) //[5]");
    assertFalse(frq_1[0] >= 0 && frq_1[0] > 0, "Path condition is violated: assertFalse(frq_1[0] >= 0 && frq_1[0] > 0) //[6]");
    i_3 += 1;
    assertTrue(1 < frq_1.length, "Path condition is violated: assertTrue(1 < frq_1.length) //[7]");
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0, "Path condition is violated: assertTrue(frq_1[1] >= 1 && frq_1[1] > 0) //[8]");
    result_1 = 1;
    i_3 += 1;
    assertFalse(2 < frq_1.length, "Path condition is violated: assertFalse(2 < frq_1.length) //[9]");
    return 1;
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
    assertTrue(0 < lst.length); //[2]
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertTrue(1 < lst.length); //[3]
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(2 < lst.length); //[4]
    int i_3 = 0;
    assertTrue(0 < frq_1.length); //[5]
    assertFalse(frq_1[0] >= 0 && frq_1[0] > 0); //[6]
    i_3 += 1;
    assertTrue(1 < frq_1.length); //[7]
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0); //[8]
    result_1 = 1;
    i_3 += 1;
    assertFalse(2 < frq_1.length); //[9]
    return 1;
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
4#assertFalse(2 < lst.length)
5#assertTrue(0 < new int[-1 + 1].length)
6#assertFalse(new int[-1 + 1][0] >= 0 && new int[-1 + 1][0] > 0)
7#assertTrue(1 < new int[-1 + 1].length)
8#assertTrue(new int[-1 + 1][1] >= 1 && new int[-1 + 1][1] > 0)
9#assertFalse(2 < new int[-1 + 1].length)

*/
