import java.util.*;
import java.util.ArrayList;

class GENERATE_INTEGERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<Integer> generate_integers(int a, int b){
    int lower_1 = Math.max(2, Math.min(a, b));
    int upper_1 = Math.min(8, Math.max(a, b));
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = lower_1;
    assertTrue(i_1 <= upper_1, "Path condition is violated: assertTrue(i_1 <= upper_1) //[1]");
    assertFalse(i_1 % 2 == 0, "Path condition is violated: assertFalse(i_1 % 2 == 0) //[2]");
    i_1 += 1;
    assertTrue(i_1 <= upper_1, "Path condition is violated: assertTrue(i_1 <= upper_1) //[3]");
    assertTrue(i_1 % 2 == 0, "Path condition is violated: assertTrue(i_1 % 2 == 0) //[4]");
    result_1.add(i_1);
    i_1 += 1;
    assertFalse(i_1 <= upper_1, "Path condition is violated: assertFalse(i_1 <= upper_1) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static ArrayList<Integer> generate_integers(int a, int b){
    int lower_1 = Math.max(2, Math.min(a, b));
    int upper_1 = Math.min(8, Math.max(a, b));
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = lower_1;
    assertTrue(i_1 <= upper_1); //[1]
    assertFalse(i_1 % 2 == 0); //[2]
    i_1 += 1;
    assertTrue(i_1 <= upper_1); //[3]
    assertTrue(i_1 % 2 == 0); //[4]
    result_1.add(i_1);
    i_1 += 1;
    assertFalse(i_1 <= upper_1); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(lower_1 <= Math.min(8, Math.max(a, b)))
2#assertFalse(lower_1 % 2 == 0)
3#assertTrue(lower_1 + 1 <= Math.min(8, Math.max(a, b)))
4#assertTrue(lower_1 + 1 % 2 == 0)
5#assertFalse((lower_1 + 1) + 1 <= Math.min(8, Math.max(a, b)))

*/
