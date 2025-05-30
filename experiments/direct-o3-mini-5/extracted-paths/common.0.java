import java.util.*;
import java.util.*;

class COMMON {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertFalse(0 < l1.length, "Path condition is violated: assertFalse(0 < l1.length) //[1]");
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertFalse(c_iter_1.hasNext(), "Path condition is violated: assertFalse(c_iter_1.hasNext()) //[2]");
    Arrays.sort(result_1);
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static int[] common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertFalse(0 < l1.length); //[1]
    int[] result_1 = new int[common_1.size()];
    int index_1 = 0;
    Iterator<Integer> c_iter_1 = common_1.iterator();
    Integer c_1;
    assertFalse(c_iter_1.hasNext()); //[2]
    Arrays.sort(result_1);
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < l1.length)
2#assertFalse((new HashSet<Integer>().iterator()).hasNext())

*/
