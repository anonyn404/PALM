import java.util.*;
import java.util.HashMap;

class IS_SORTED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_sorted(int[] lst){
    HashMap<Integer, Integer> count_num_1 = new HashMap<>();
    int i_1 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    int i_2 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[2]");
    int i_3 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[3]");
    assertFalse(count_num_1.get(lst[0]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[0]) > 2) //[4]");
    i_3++;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[5]");
    int i_4 = 0;
    assertTrue(0 < lst.length - 1, "Path condition is violated: assertTrue(0 < lst.length - 1) //[6]");
    assertTrue(lst[0] > lst[1], "Path condition is violated: assertTrue(lst[0] > lst[1]) //[7]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashMap;
public static boolean is_sorted(int[] lst){
    HashMap<Integer, Integer> count_num_1 = new HashMap<>();
    int i_1 = 0;
    assertFalse(0 < lst.length); //[1]
    int i_2 = 0;
    assertFalse(0 < lst.length); //[2]
    int i_3 = 0;
    assertTrue(0 < lst.length); //[3]
    assertFalse(count_num_1.get(lst[0]) > 2); //[4]
    i_3++;
    assertFalse(1 < lst.length); //[5]
    int i_4 = 0;
    assertTrue(0 < lst.length - 1); //[6]
    assertTrue(lst[0] > lst[1]); //[7]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertFalse(0 < lst.length)
3#assertTrue(0 < lst.length)
4#assertFalse((new HashMap<>()).get(lst[0]) > 2)
5#assertFalse(1 < lst.length)
6#assertTrue(0 < lst.length - 1)
7#assertTrue(lst[0] > lst[1])

*/
