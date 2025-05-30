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
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[2]");
    count_num_1.put(lst[0], count_num_1.get(lst[0]) + 1);
    i_2++;
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[3]");
    int i_3 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[4]");
    int i_4 = 0;
    assertTrue(0 < lst.length - 1, "Path condition is violated: assertTrue(0 < lst.length - 1) //[5]");
    assertFalse(lst[0] > lst[1], "Path condition is violated: assertFalse(lst[0] > lst[1]) //[6]");
    i_4++;
    assertFalse(1 < lst.length - 1, "Path condition is violated: assertFalse(1 < lst.length - 1) //[7]");
    return true;
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
    assertTrue(0 < lst.length); //[2]
    count_num_1.put(lst[0], count_num_1.get(lst[0]) + 1);
    i_2++;
    assertFalse(1 < lst.length); //[3]
    int i_3 = 0;
    assertFalse(0 < lst.length); //[4]
    int i_4 = 0;
    assertTrue(0 < lst.length - 1); //[5]
    assertFalse(lst[0] > lst[1]); //[6]
    i_4++;
    assertFalse(1 < lst.length - 1); //[7]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertTrue(0 < lst.length)
3#assertFalse(1 < lst.length)
4#assertFalse(0 < lst.length)
5#assertTrue(0 < lst.length - 1)
6#assertFalse(lst[0] > lst[1])
7#assertFalse(1 < lst.length - 1)

*/
