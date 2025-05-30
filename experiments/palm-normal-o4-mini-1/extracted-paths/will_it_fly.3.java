import java.util.*;

class WILL_IT_FLY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean will_it_fly(int[] q, int w){
    int sum_1 = 0;
    int i_1 = 0;
    assertFalse(0 < q.length, "Path condition is violated: assertFalse(0 < q.length) //[1]");
    assertTrue(0 > w, "Path condition is violated: assertTrue(0 > w) //[2]");
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
    assertTrue(0 > w); //[2]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < q.length)
2#assertTrue(0 > w)

*/
