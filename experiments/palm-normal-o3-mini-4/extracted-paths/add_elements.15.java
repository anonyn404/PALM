import java.util.*;
import java.util.ArrayList;

class ADD_ELEMENTS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int add_elements(ArrayList<Integer> arr, int k){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < k, "Path condition is violated: assertTrue(0 < k) //[1]");
    assertTrue(Integer.toString(arr.get(0)).length() <= 2, "Path condition is violated: assertTrue(Integer.toString(arr.get(0)).length() <= 2) //[2]");
    result_1 += arr.get(0);
    i_1++;
    assertTrue(1 < k, "Path condition is violated: assertTrue(1 < k) //[3]");
    assertTrue(Integer.toString(arr.get(1)).length() <= 2, "Path condition is violated: assertTrue(Integer.toString(arr.get(1)).length() <= 2) //[4]");
    result_1 += arr.get(1);
    i_1++;
    assertFalse(2 < k, "Path condition is violated: assertFalse(2 < k) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static int add_elements(ArrayList<Integer> arr, int k){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < k); //[1]
    assertTrue(Integer.toString(arr.get(0)).length() <= 2); //[2]
    result_1 += arr.get(0);
    i_1++;
    assertTrue(1 < k); //[3]
    assertTrue(Integer.toString(arr.get(1)).length() <= 2); //[4]
    result_1 += arr.get(1);
    i_1++;
    assertFalse(2 < k); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < k)
2#assertTrue(Integer.toString(arr.get(0)).length() <= 2)
3#assertTrue(1 < k)
4#assertTrue(Integer.toString(arr.get(1)).length() <= 2)
5#assertFalse(2 < k)

*/
