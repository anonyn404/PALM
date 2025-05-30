import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class SPECIAL_FILTER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void special_filter(int[] nums){
    int count_1 = 0;
    ArrayList<Integer> odd_digits_1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    Integer num_1;
    assertTrue(0 < nums.length, "Path condition is violated: assertTrue(0 < nums.length) //[1]");
    num_1 = nums[0];
    assertFalse(num_1 > 10, "Path condition is violated: assertFalse(num_1 > 10) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public static void special_filter(int[] nums){
    int count_1 = 0;
    ArrayList<Integer> odd_digits_1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    Integer num_1;
    assertTrue(0 < nums.length); //[1]
    num_1 = nums[0];
    assertFalse(num_1 > 10); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < nums.length)
2#assertFalse(nums[0] > 10)

*/
