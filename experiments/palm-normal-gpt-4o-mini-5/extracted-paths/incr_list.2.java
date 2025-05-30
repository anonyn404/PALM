import java.util.*;
import java.util.ArrayList;
import java.util.List;

class INCR_LIST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void incr_list(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    result_1.add(n_1 + 1);
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void incr_list(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    result_1.add(n_1 + 1);
    assertTrue(n_iter_1.hasNext()); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((l.iterator()).hasNext())
2#assertTrue((l.iterator()).hasNext())

*/
