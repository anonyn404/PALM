import java.util.*;
import java.util.ArrayList;

class MIN_SUBARRAY_SUM {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static long min_subarray_sum(ArrayList<Long> nums){
    long max_sum_1 = 0;
    long s_1 = 0;
    Iterator<Long> num_iter_1 = nums.iterator();
    long num_1;
    assertTrue(num_iter_1.hasNext(), "Path condition is violated: assertTrue(num_iter_1.hasNext()) //[1]");
    num_1 = num_iter_1.next();
    s_1 += -num_1;
    assertTrue(s_1 < 0, "Path condition is violated: assertTrue(s_1 < 0) //[2]");
    s_1 = 0;
    max_sum_1 = Math.max(0, 0);
    assertTrue(num_iter_1.hasNext(), "Path condition is violated: assertTrue(num_iter_1.hasNext()) //[3]");
    num_1 = num_iter_1.next();
    s_1 += -num_1;
    assertFalse(s_1 < 0, "Path condition is violated: assertFalse(s_1 < 0) //[4]");
    max_sum_1 = Math.max(s_1, max_sum_1);
    assertFalse(num_iter_1.hasNext(), "Path condition is violated: assertFalse(num_iter_1.hasNext()) //[5]");
    assertFalse(max_sum_1 == 0, "Path condition is violated: assertFalse(max_sum_1 == 0) //[6]");
    long min_sum_1 = -max_sum_1;
    return min_sum_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static long min_subarray_sum(ArrayList<Long> nums){
    long max_sum_1 = 0;
    long s_1 = 0;
    Iterator<Long> num_iter_1 = nums.iterator();
    long num_1;
    assertTrue(num_iter_1.hasNext()); //[1]
    num_1 = num_iter_1.next();
    s_1 += -num_1;
    assertTrue(s_1 < 0); //[2]
    s_1 = 0;
    max_sum_1 = Math.max(0, 0);
    assertTrue(num_iter_1.hasNext()); //[3]
    num_1 = num_iter_1.next();
    s_1 += -num_1;
    assertFalse(s_1 < 0); //[4]
    max_sum_1 = Math.max(s_1, max_sum_1);
    assertFalse(num_iter_1.hasNext()); //[5]
    assertFalse(max_sum_1 == 0); //[6]
    long min_sum_1 = -max_sum_1;
    return min_sum_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((nums.iterator()).hasNext())
2#assertTrue(0 + -num_1 < 0)
3#assertTrue((nums.iterator()).hasNext())
4#assertFalse(0 + -num_1 < 0)
5#assertFalse((nums.iterator()).hasNext())
6#assertFalse(Math.max(s_1, max_sum_1) == 0)

*/
