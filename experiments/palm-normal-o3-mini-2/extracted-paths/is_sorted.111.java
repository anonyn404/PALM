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
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[3]");
    count_num_1.put(lst[1], count_num_1.get(lst[1]) + 1);
    i_2++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[4]");
    int i_3 = 0;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[5]");
    assertFalse(count_num_1.get(lst[0]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[0]) > 2) //[6]");
    i_3++;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[7]");
    assertFalse(count_num_1.get(lst[1]) > 2, "Path condition is violated: assertFalse(count_num_1.get(lst[1]) > 2) //[8]");
    i_3++;
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[9]");
    int i_4 = 0;
    assertTrue(0 < lst.length - 1, "Path condition is violated: assertTrue(0 < lst.length - 1) //[10]");
    assertFalse(lst[0] > lst[1], "Path condition is violated: assertFalse(lst[0] > lst[1]) //[11]");
    i_4++;
    assertTrue(1 < lst.length - 1, "Path condition is violated: assertTrue(1 < lst.length - 1) //[12]");
    assertTrue(lst[1] > lst[2], "Path condition is violated: assertTrue(lst[1] > lst[2]) //[13]");
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
    assertFalse(count_num_1.get(lst[1]) > 2); //[8]
    i_3++;
    assertFalse(2 < lst.length); //[9]
    int i_4 = 0;
    assertTrue(0 < lst.length - 1); //[10]
    assertFalse(lst[0] > lst[1]); //[11]
    i_4++;
    assertTrue(1 < lst.length - 1); //[12]
    assertTrue(lst[1] > lst[2]); //[13]
    return false;
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
8#assertFalse((new HashMap<>()).get(lst[1]) > 2)
9#assertFalse(2 < lst.length)
10#assertTrue(0 < lst.length - 1)
11#assertFalse(lst[0] > lst[1])
12#assertTrue(1 < lst.length - 1)
13#assertTrue(lst[1] > lst[2])

*/
