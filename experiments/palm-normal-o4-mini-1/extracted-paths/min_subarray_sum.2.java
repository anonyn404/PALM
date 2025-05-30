import java.util.*;
import java.util.ArrayList;

class MIN_SUBARRAY_SUM {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void min_subarray_sum(ArrayList<Long> nums){
    long max_sum_1 = 0;
    long s_1 = 0;
    Iterator<Long> num_iter_1 = nums.iterator();
    long num_1;
    assertFalse(num_iter_1.hasNext(), "Path condition is violated: assertFalse(num_iter_1.hasNext()) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void min_subarray_sum(ArrayList<Long> nums){
    long max_sum_1 = 0;
    long s_1 = 0;
    Iterator<Long> num_iter_1 = nums.iterator();
    long num_1;
    assertFalse(num_iter_1.hasNext()); //[1]
    assertTrue(true); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((nums.iterator()).hasNext())
2#assertTrue(true)

*/
