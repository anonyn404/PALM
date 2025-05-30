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
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[5]");
    assertFalse(count_num_1.get(lst[1]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[1]) > 2) //[6]");
    i_3++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[7]");
    int i_4 = 0;
    assertTrue(0 < lst.length - 1, "Path condition is violated: assertTrue(0 < lst.length - 1) //[8]");
    assertTrue(lst[0] > lst[1], "Path condition is violated: assertTrue(lst[0] > lst[1]) //[9]");
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
    assertTrue(1 < lst.length); //[5]
    assertFalse(count_num_1.get(lst[1]) > 2); //[6]
    i_3++;
    assertFalse(2 < lst.length); //[7]
    int i_4 = 0;
    assertTrue(0 < lst.length - 1); //[8]
    assertTrue(lst[0] > lst[1]); //[9]
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
5#assertTrue(1 < lst.length)
6#assertFalse((new HashMap<>()).get(lst[1]) > 2)
7#assertFalse(2 < lst.length)
8#assertTrue(0 < lst.length - 1)
9#assertTrue(lst[0] > lst[1])

*/
