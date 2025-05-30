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
    assertFalse(num_iter_1.hasNext(), "Path condition is violated: assertFalse(num_iter_1.hasNext()) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
    max_sum_1 = -nums.get(0);
    int i_1 = 1;
    assertTrue(1 < nums.size(), "Path condition is violated: assertTrue(1 < nums.size()) //[3]");
    max_sum_1 = Math.max(max_sum_1, -nums.get(1));
    i_1++;
    assertTrue(2 < nums.size(), "Path condition is violated: assertTrue(2 < nums.size()) //[4]");
    max_sum_1 = Math.max(max_sum_1, -nums.get(2));
    i_1++;
    assertFalse(3 < nums.size(), "Path condition is violated: assertFalse(3 < nums.size()) //[5]");
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
    assertFalse(num_iter_1.hasNext()); //[1]
    assertTrue(true); //[2]
    max_sum_1 = -nums.get(0);
    int i_1 = 1;
    assertTrue(1 < nums.size()); //[3]
    max_sum_1 = Math.max(max_sum_1, -nums.get(1));
    i_1++;
    assertTrue(2 < nums.size()); //[4]
    max_sum_1 = Math.max(max_sum_1, -nums.get(2));
    i_1++;
    assertFalse(3 < nums.size()); //[5]
    long min_sum_1 = -max_sum_1;
    return min_sum_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((nums.iterator()).hasNext())
2#assertTrue(true)
3#assertTrue(1 < nums.size())
4#assertTrue(2 < nums.size())
5#assertFalse(3 < nums.size())

*/
