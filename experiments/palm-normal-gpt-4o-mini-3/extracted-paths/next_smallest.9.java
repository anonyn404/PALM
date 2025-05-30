import java.util.*;
import java.util.*;

class NEXT_SMALLEST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static Integer next_smallest(int[] lst){
    HashSet<Integer> numbers_1 = new HashSet<Integer>();
    Integer n_1;
    assertTrue(0 < lst.length, "Path condition is violated: assertTrue(0 < lst.length) //[1]");
    n_1 = lst[0];
    numbers_1.add(n_1);
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[2]");
    n_1 = lst[1];
    numbers_1.add(n_1);
    assertFalse(2 < lst.length, "Path condition is violated: assertFalse(2 < lst.length) //[3]");
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertTrue(no_duplicate_1.length < 2, "Path condition is violated: assertTrue(no_duplicate_1.length < 2) //[4]");
    return null;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static Integer next_smallest(int[] lst){
    HashSet<Integer> numbers_1 = new HashSet<Integer>();
    Integer n_1;
    assertTrue(0 < lst.length); //[1]
    n_1 = lst[0];
    numbers_1.add(n_1);
    assertTrue(1 < lst.length); //[2]
    n_1 = lst[1];
    numbers_1.add(n_1);
    assertFalse(2 < lst.length); //[3]
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertTrue(no_duplicate_1.length < 2); //[4]
    return null;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertTrue(1 < lst.length)
3#assertFalse(2 < lst.length)
4#assertTrue(no_duplicate_1.length < 2)

*/
