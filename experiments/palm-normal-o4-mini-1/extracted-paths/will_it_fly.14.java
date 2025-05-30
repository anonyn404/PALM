import java.util.*;

class WILL_IT_FLY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < q.length, "Path condition is violated: assertTrue(0 < q.length) //[1]");
    sum_1 += q[0];
    i_1 += 1;
    assertFalse(1 < q.length, "Path condition is violated: assertFalse(1 < q.length) //[2]");
    assertFalse(sum_1 > w, "Path condition is violated: assertFalse(sum_1 > w) //[3]");
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1, "Path condition is violated: assertTrue(0 < j_1) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertTrue(0 < q.length); //[1]
    sum_1 += q[0];
    i_1 += 1;
    assertFalse(1 < q.length); //[2]
    assertFalse(sum_1 > w); //[3]
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < q.length)
2#assertFalse(1 < q.length)
3#assertFalse(0 + q[0] > w)
4#assertTrue(0 < q.length - 1)

*/
