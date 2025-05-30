import java.util.*;

class WILL_IT_FLY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < q.length, "Path condition is violated: assertTrue(0 < q.length) //[1]");
    sum_1 += q[0];
    i_1 += 1;
    assertTrue(1 < q.length, "Path condition is violated: assertTrue(1 < q.length) //[2]");
    sum_1 += q[1];
    i_1 += 1;
    assertFalse(2 < q.length, "Path condition is violated: assertFalse(2 < q.length) //[3]");
    assertFalse(sum_1 > w, "Path condition is violated: assertFalse(sum_1 > w) //[4]");
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1, "Path condition is violated: assertTrue(0 < j_1) //[5]");
    assertFalse(q[0] != q[j_1], "Path condition is violated: assertFalse(q[0] != q[j_1]) //[6]");
    i_2 += 1;
    j_1 -= 1;
    assertTrue(1 < j_1, "Path condition is violated: assertTrue(1 < j_1) //[7]");
    assertTrue(q[1] != q[j_1], "Path condition is violated: assertTrue(q[1] != q[j_1]) //[8]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < q.length); //[1]
    sum_1 += q[0];
    i_1 += 1;
    assertTrue(1 < q.length); //[2]
    sum_1 += q[1];
    i_1 += 1;
    assertFalse(2 < q.length); //[3]
    assertFalse(sum_1 > w); //[4]
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1); //[5]
    assertFalse(q[0] != q[j_1]); //[6]
    i_2 += 1;
    j_1 -= 1;
    assertTrue(1 < j_1); //[7]
    assertTrue(q[1] != q[j_1]); //[8]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < q.length)
2#assertTrue(1 < q.length)
3#assertFalse(2 < q.length)
4#assertFalse((0 + q[0]) + q[1] > w)
5#assertTrue(0 < q.length - 1)
6#assertFalse(q[0] != q[q.length - 1])
7#assertTrue(1 < (q.length - 1) - 1)
8#assertTrue(q[1] != q[(q.length - 1) - 1])

*/
