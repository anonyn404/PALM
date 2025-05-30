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
    assertFalse(i_1 <= arr.size() - 1, "Path condition is violated: assertFalse(i_1 <= arr.size() - 1) //[1]");
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
    assertFalse(i_1 <= arr.size() - 1); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(arr.size() - k <= arr.size() - 1)

*/
