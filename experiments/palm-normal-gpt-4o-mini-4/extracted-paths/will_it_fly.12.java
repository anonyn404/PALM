import java.util.*;

class WILL_IT_FLY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertFalse(0 < q.length, "Path condition is violated: assertFalse(0 < q.length) //[1]");
    assertFalse(0 > w, "Path condition is violated: assertFalse(0 > w) //[2]");
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1, "Path condition is violated: assertTrue(0 < j_1) //[3]");
    assertTrue(q[0] != q[j_1], "Path condition is violated: assertTrue(q[0] != q[j_1]) //[4]");
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
    assertFalse(0 < q.length); //[1]
    assertFalse(0 > w); //[2]
    int i_2 = 0;
    int j_1 = q.length - 1;
    assertTrue(0 < j_1); //[3]
    assertTrue(q[0] != q[j_1]); //[4]
    return false;
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
4#assertTrue(q[0] != q[q.length - 1])

*/
