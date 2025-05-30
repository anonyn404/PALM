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
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[2]");
    int i_3 = 0;
    assertTrue(0 < frq_1.length, "Path condition is violated: assertTrue(0 < frq_1.length) //[3]");
    assertTrue(frq_1[0] >= 0 && frq_1[0] > 0, "Path condition is violated: assertTrue(frq_1[0] >= 0 && frq_1[0] > 0) //[4]");
    result_1 = 0;
    i_3 += 1;
    assertTrue(1 < frq_1.length, "Path condition is violated: assertTrue(1 < frq_1.length) //[5]");
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0, "Path condition is violated: assertTrue(frq_1[1] >= 1 && frq_1[1] > 0) //[6]");
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
    assertFalse(0 < lst.length); //[2]
    int i_3 = 0;
    assertTrue(0 < frq_1.length); //[3]
    assertTrue(frq_1[0] >= 0 && frq_1[0] > 0); //[4]
    result_1 = 0;
    i_3 += 1;
    assertTrue(1 < frq_1.length); //[5]
    assertTrue(frq_1[1] >= 1 && frq_1[1] > 0); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertFalse(0 < lst.length)
3#assertTrue(0 < new int[-1 + 1].length)
4#assertTrue(new int[-1 + 1][0] >= 0 && new int[-1 + 1][0] > 0)
5#assertTrue(1 < new int[-1 + 1].length)
6#assertTrue(new int[-1 + 1][1] >= 1 && new int[-1 + 1][1] > 0)

*/
