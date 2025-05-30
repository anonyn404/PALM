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
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[3]");
    int i_3 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[4]");
    assertFalse(count_num_1.get(lst[0]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[0]) > 2) //[5]");
    i_3++;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[6]");
    assertFalse(count_num_1.get(lst[1]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[1]) > 2) //[7]");
    i_3++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[8]");
    int i_4 = 0;
    assertTrue(0 < lst.length - 1, "Path condition is violated: assertTrue(0 < lst.length - 1) //[9]");
    assertFalse(lst[0] > lst[1], "Path condition is violated: assertFalse(lst[0] > lst[1]) //[10]");
    i_4++;
    assertTrue(1 < lst.length - 1, "Path condition is violated: assertTrue(1 < lst.length - 1) //[11]");
    assertFalse(lst[1] > lst[2], "Path condition is violated: assertFalse(lst[1] > lst[2]) //[12]");
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
    assertFalse(1 < lst.length); //[3]
    int i_3 = 0;
    assertTrue(0 < lst.length); //[4]
    assertFalse(count_num_1.get(lst[0]) > 2); //[5]
    i_3++;
    assertTrue(1 < lst.length); //[6]
    assertFalse(count_num_1.get(lst[1]) > 2); //[7]
    i_3++;
    assertFalse(2 < lst.length); //[8]
    int i_4 = 0;
    assertTrue(0 < lst.length - 1); //[9]
    assertFalse(lst[0] > lst[1]); //[10]
    i_4++;
    assertTrue(1 < lst.length - 1); //[11]
    assertFalse(lst[1] > lst[2]); //[12]
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
4#assertTrue(0 < lst.length)
5#assertFalse((new HashMap<>()).get(lst[0]) > 2)
6#assertTrue(1 < lst.length)
7#assertFalse((new HashMap<>()).get(lst[1]) > 2)
8#assertFalse(2 < lst.length)
9#assertTrue(0 < lst.length - 1)
10#assertFalse(lst[0] > lst[1])
11#assertTrue(1 < lst.length - 1)
12#assertFalse(lst[1] > lst[2])

*/
