import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class MAXIMUM_K {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k){
    Collections.sort(arr);
    ArrayList<Integer> result_1 = new ArrayList<>();
    int i_1 = arr.size() - k;
    assertTrue(i_1 <= arr.size() - 1, "Path condition is violated: assertTrue(i_1 <= arr.size() - 1) //[1]");
    result_1.add(arr.get(i_1));
    i_1++;
    assertTrue(i_1 <= arr.size() - 1, "Path condition is violated: assertTrue(i_1 <= arr.size() - 1) //[2]");
    result_1.add(arr.get(i_1));
    i_1++;
    assertFalse(i_1 <= arr.size() - 1, "Path condition is violated: assertFalse(i_1 <= arr.size() - 1) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k){
    Collections.sort(arr);
    ArrayList<Integer> result_1 = new ArrayList<>();
    int i_1 = arr.size() - k;
    assertTrue(i_1 <= arr.size() - 1); //[1]
    result_1.add(arr.get(i_1));
    i_1++;
    assertTrue(i_1 <= arr.size() - 1); //[2]
    result_1.add(arr.get(i_1));
    i_1++;
    assertFalse(i_1 <= arr.size() - 1); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(arr.size() - k <= arr.size() - 1)
2#assertTrue(arr.size() - k <= arr.size() - 1)
3#assertFalse(arr.size() - k <= arr.size() - 1)

*/
