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
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[5]");
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[6]");
    int i_3 = 0;
    assertTrue(0 < frq_1.length, "Path condition is violated: assertTrue(0 < frq_1.length) //[7]");
    assertFalse(frq_1[0] >= 0 && frq_1[0] > 0, "Path condition is violated: assertFalse(frq_1[0] >= 0 && frq_1[0] > 0) //[8]");
    i_3 += 1;
    assertTrue(1 < frq_1.length, "Path condition is violated: assertTrue(1 < frq_1.length) //[9]");
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0, "Path condition is violated: assertTrue(frq_1[1] >= 1 && frq_1[1] > 0) //[10]");
    result_1 = 1;
    i_3 += 1;
    assertFalse(2 < frq_1.length, "Path condition is violated: assertFalse(2 < frq_1.length) //[11]");
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
    assertTrue(1 < lst.length); //[5]
    frq_1[lst[i_2]] += 1;
    i_2 += 1;
    assertFalse(2 < lst.length); //[6]
    int i_3 = 0;
    assertTrue(0 < frq_1.length); //[7]
    assertFalse(frq_1[0] >= 0 && frq_1[0] > 0); //[8]
    i_3 += 1;
    assertTrue(1 < frq_1.length); //[9]
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0); //[10]
    result_1 = 1;
    i_3 += 1;
    assertFalse(2 < frq_1.length); //[11]
    return 1;
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
5#assertTrue(1 < lst.length)
6#assertFalse(2 < lst.length)
7#assertTrue(0 < new int[i_1 + 1].length)
8#assertFalse(new int[i_1 + 1][0] >= 0 && new int[i_1 + 1][0] > 0)
9#assertTrue(1 < new int[i_1 + 1].length)
10#assertTrue(new int[i_1 + 1][1] >= 1 && new int[i_1 + 1][1] > 0)
11#assertFalse(2 < new int[i_1 + 1].length)

*/
