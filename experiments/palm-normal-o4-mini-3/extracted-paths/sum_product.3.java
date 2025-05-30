import java.util.*;
import java.util.List;

class SUM_PRODUCT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static Integer[] sum_product(List<Integer> numbers){
    Integer[] result_1 = new Integer[] { 0, 1 };
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    result_1[0] += n_1;
    result_1[1] *= n_1;
    assertFalse(n_iter_1.hasNext(), "Path condition is violated: assertFalse(n_iter_1.hasNext()) //[2]");
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
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    result_1[0] += n_1;
    result_1[1] *= n_1;
    assertFalse(n_iter_1.hasNext()); //[2]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertFalse((numbers.iterator()).hasNext())

*/
