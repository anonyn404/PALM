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
    assertFalse(1 < lst.length, "Path condition is violated: assertFalse(1 < lst.length) //[2]");
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertFalse(no_duplicate_1.length < 2, "Path condition is violated: assertFalse(no_duplicate_1.length < 2) //[3]");
    return no_duplicate_1[1];
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
    assertFalse(1 < lst.length); //[2]
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertFalse(no_duplicate_1.length < 2); //[3]
    return no_duplicate_1[1];
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.length)
2#assertFalse(1 < lst.length)
3#assertFalse(no_duplicate_1.length < 2)

*/
