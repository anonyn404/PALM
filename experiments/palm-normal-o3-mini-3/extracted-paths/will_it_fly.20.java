import java.util.*;

class WILL_IT_FLY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertFalse(0 < q.length, "Path condition is violated: assertFalse(0 < q.length) //[1]");
    assertFalse(0 > w, "Path condition is violated: assertFalse(0 > w) //[2]");
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1, "Path condition is violated: assertTrue(0 < j_1) //[3]");
    assertFalse(q[0] != q[j_1], "Path condition is violated: assertFalse(q[0] != q[j_1]) //[4]");
    i_2 += 1;
    j_1 -= 1;
    assertTrue(1 < j_1, "Path condition is violated: assertTrue(1 < j_1) //[5]");
    assertFalse(q[1] != q[j_1], "Path condition is violated: assertFalse(q[1] != q[j_1]) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertFalse(0 < q.length); //[1]
    assertFalse(0 > w); //[2]
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1); //[3]
    assertFalse(q[0] != q[j_1]); //[4]
    i_2 += 1;
    j_1 -= 1;
    assertTrue(1 < j_1); //[5]
    assertFalse(q[1] != q[j_1]); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < q.length)
2#assertFalse(0 > w)
3#assertTrue(0 < q.length - 1)
4#assertFalse(q[0] != q[q.length - 1])
5#assertTrue(1 < (q.length - 1) - 1)
6#assertFalse(q[1] != q[(q.length - 1) - 1])

*/
