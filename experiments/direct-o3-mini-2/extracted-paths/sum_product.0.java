import java.util.*;
import java.util.List;

class SUM_PRODUCT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static Integer[] sum_product(List<Integer> numbers){
    Integer[] result_1 = new Integer[] { 0, 1 };
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertFalse(n_iter_1.hasNext(), "Path condition is violated: assertFalse(n_iter_1.hasNext()) //[1]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static Integer[] sum_product(List<Integer> numbers){
    Integer[] result_1 = new Integer[] { 0, 1 };
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertFalse(n_iter_1.hasNext()); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((numbers.iterator()).hasNext())

*/
