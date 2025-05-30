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
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    assertFalse(running_max_1 == null, "Path condition is violated: assertFalse(running_max_1 == null) //[2]");
    running_max_1 = Math.max(running_max_1, n_1);
    result_1.add(running_max_1);
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[3]");
    n_1 = n_iter_1.next();
    assertTrue(running_max_1 == null, "Path condition is violated: assertTrue(running_max_1 == null) //[4]");
    running_max_1 = n_1;
    result_1.add(running_max_1);
    assertFalse(n_iter_1.hasNext(), "Path condition is violated: assertFalse(n_iter_1.hasNext()) //[5]");
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
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    assertFalse(running_max_1 == null); //[2]
    running_max_1 = Math.max(running_max_1, n_1);
    result_1.add(running_max_1);
    assertTrue(n_iter_1.hasNext()); //[3]
    n_1 = n_iter_1.next();
    assertTrue(running_max_1 == null); //[4]
    running_max_1 = n_1;
    result_1.add(running_max_1);
    assertFalse(n_iter_1.hasNext()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertFalse(null == null)
3#assertTrue((numbers.iterator()).hasNext())
4#assertTrue(Math.max(running_max_1, n_1) == null)
5#assertFalse((numbers.iterator()).hasNext())

*/
