import java.util.*;
import java.util.*;

class COMMON {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertTrue(0 < l1.length, "Path condition is violated: assertTrue(0 < l1.length) //[1]");
    int j_1 = 0;
    assertTrue(0 < l2.length, "Path condition is violated: assertTrue(0 < l2.length) //[2]");
    assertTrue(l1[0] == l2[0], "Path condition is violated: assertTrue(l1[0] == l2[0]) //[3]");
    common_1.add(l1[0]);
    j_1 += 1;
    assertFalse(1 < l2.length, "Path condition is violated: assertFalse(1 < l2.length) //[4]");
    i_1 += 1;
    assertFalse(1 < l1.length, "Path condition is violated: assertFalse(1 < l1.length) //[5]");
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertTrue(c_iter_1.hasNext(), "Path condition is violated: assertTrue(c_iter_1.hasNext()) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static void common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertTrue(0 < l1.length); //[1]
    int j_1 = 0;
    assertTrue(0 < l2.length); //[2]
    assertTrue(l1[0] == l2[0]); //[3]
    common_1.add(l1[0]);
    j_1 += 1;
    assertFalse(1 < l2.length); //[4]
    i_1 += 1;
    assertFalse(1 < l1.length); //[5]
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertTrue(c_iter_1.hasNext()); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l1.length)
2#assertTrue(0 < l2.length)
3#assertTrue(l1[0] == l2[0])
4#assertFalse(1 < l2.length)
5#assertFalse(1 < l1.length)
6#assertTrue((new HashSet<Integer>().iterator()).hasNext())

*/
