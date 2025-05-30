import java.util.*;
import java.util.ArrayList;
import java.util.List;

class INCR_LIST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> incr_list(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
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
public static List<Integer> incr_list(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
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
1#assertFalse((l.iterator()).hasNext())

*/
