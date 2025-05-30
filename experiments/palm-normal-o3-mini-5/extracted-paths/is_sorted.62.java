import java.util.*;
import java.util.HashMap;

class IS_SORTED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void is_sorted(int[] lst){
    HashMap<Integer, Integer> count_num_1 = new HashMap<>();
    int i_1 = 0;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    int i_2 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[2]");
    count_num_1.put(lst[0], count_num_1.get(lst[0]) + 1);
    i_2++;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
    count_num_1.put(lst[1], count_num_1.get(lst[1]) + 1);
    i_2++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[4]");
    int i_3 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[5]");
    assertFalse(count_num_1.get(lst[0]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[0]) > 2) //[6]");
    i_3++;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[7]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashMap;
public static void is_sorted(int[] lst){
    HashMap<Integer, Integer> count_num_1 = new HashMap<>();
    int i_1 = 0;
    assertFalse(0 < lst.length); //[1]
    int i_2 = 0;
    assertTrue(0 < lst.length); //[2]
    count_num_1.put(lst[0], count_num_1.get(lst[0]) + 1);
    i_2++;
    assertTrue(1 < lst.length); //[3]
    count_num_1.put(lst[1], count_num_1.get(lst[1]) + 1);
    i_2++;
    assertFalse(2 < lst.length); //[4]
    int i_3 = 0;
    assertTrue(0 < lst.length); //[5]
    assertFalse(count_num_1.get(lst[0]) > 2); //[6]
    i_3++;
    assertTrue(1 < lst.length); //[7]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertTrue(0 < lst.length)
3#assertTrue(1 < lst.length)
4#assertFalse(2 < lst.length)
5#assertTrue(0 < lst.length)
6#assertFalse((new HashMap<>()).get(lst[0]) > 2)
7#assertTrue(1 < lst.length)

*/
