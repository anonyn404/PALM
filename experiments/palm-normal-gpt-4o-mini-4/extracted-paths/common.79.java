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
    assertFalse(0 < l2.length, "Path condition is violated: assertFalse(0 < l2.length) //[2]");
    i_1 += 1;
    assertTrue(1 < l1.length, "Path condition is violated: assertTrue(1 < l1.length) //[3]");
    int j_2 = 0;
    assertFalse(0 < l2.length, "Path condition is violated: assertFalse(0 < l2.length) //[4]");
    i_1 += 1;
    assertFalse(2 < l1.length, "Path condition is violated: assertFalse(2 < l1.length) //[5]");
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertTrue(c_iter_1.hasNext(), "Path condition is violated: assertTrue(c_iter_1.hasNext()) //[6]");
    c_1 = c_iter_1.next();
    result_1[index_1] = c_1;
    index_1 += 1;
    assertTrue(c_iter_1.hasNext(), "Path condition is violated: assertTrue(c_iter_1.hasNext()) //[7]");
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
    assertFalse(0 < l2.length); //[2]
    i_1 += 1;
    assertTrue(1 < l1.length); //[3]
    int j_2 = 0;
    assertFalse(0 < l2.length); //[4]
    i_1 += 1;
    assertFalse(2 < l1.length); //[5]
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertTrue(c_iter_1.hasNext()); //[6]
    c_1 = c_iter_1.next();
    result_1[index_1] = c_1;
    index_1 += 1;
    assertTrue(c_iter_1.hasNext()); //[7]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l1.length)
2#assertFalse(0 < l2.length)
3#assertTrue(1 < l1.length)
4#assertFalse(0 < l2.length)
5#assertFalse(2 < l1.length)
6#assertTrue((new HashSet<Integer>().iterator()).hasNext())
7#assertTrue((new HashSet<Integer>().iterator()).hasNext())

*/
