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
    assertTrue(num_1 > 10, "Path condition is violated: assertTrue(num_1 > 10) //[2]");
    String number_as_string_1 = num_1 + "";
    assertFalse(odd_digits_1.contains(number_as_string_1.charAt(0) - '0') && odd_digits_1.contains(number_as_string_1.charAt(number_as_string_1.length() - 1) - '0'), "Path condition is violated: assertFalse(odd_digits_1.contains(number_as_string_1.charAt(0) - '0') && odd_digits_1.contains(number_as_string_1.charAt(number_as_string_1.length() - 1) - '0')) //[3]");
    assertTrue(1 < nums.length, "Path condition is violated: assertTrue(1 < nums.length) //[4]");
    num_1 = nums[1];
    assertTrue(num_1 > 10, "Path condition is violated: assertTrue(num_1 > 10) //[5]");
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
    assertTrue(num_1 > 10); //[2]
    String number_as_string_1 = num_1 + "";
    assertFalse(odd_digits_1.contains(number_as_string_1.charAt(0) - '0') && odd_digits_1.contains(number_as_string_1.charAt(number_as_string_1.length() - 1) - '0')); //[3]
    assertTrue(1 < nums.length); //[4]
    num_1 = nums[1];
    assertTrue(num_1 > 10); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < nums.length)
2#assertTrue(nums[0] > 10)
3#assertFalse((new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9))).contains((nums[0] + "").charAt(0) - '0') && (new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9))).contains((nums[0] + "").charAt((nums[0] + "").length() - 1) - '0'))
4#assertTrue(1 < nums.length)
5#assertTrue(nums[1] > 10)

*/
