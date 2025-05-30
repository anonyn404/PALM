import java.util.*;
import java.util.ArrayList;
import java.util.List;

class ROLLING_MAX {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> rolling_max(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    Integer running_max_1 = null;
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
import java.util.ArrayList;
import java.util.List;
public static List<Integer> rolling_max(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    Integer running_max_1 = null;
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
