import java.util.*;
import java.util.*;

class NEXT_SMALLEST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static Integer next_smallest(int[] lst){
    HashSet<Integer> numbers_1 = new HashSet<Integer>();
    Integer n_1;
    assertFalse(0 < lst.length, "Path condition is violated: assertFalse(0 < lst.length) //[1]");
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertTrue(no_duplicate_1.length < 2, "Path condition is violated: assertTrue(no_duplicate_1.length < 2) //[2]");
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
    assertFalse(0 < lst.length); //[1]
    Integer[] no_duplicate_1 = numbers_1.toArray(new Integer[] {});
    Arrays.sort(no_duplicate_1);
    assertTrue(no_duplicate_1.length < 2); //[2]
    return null;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < lst.length)
2#assertTrue(no_duplicate_1.length < 2)

*/
