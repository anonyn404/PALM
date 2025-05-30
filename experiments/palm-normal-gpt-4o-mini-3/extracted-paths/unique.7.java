import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class UNIQUE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void unique(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    assertTrue(result_1.contains(n_1), "Path condition is violated: assertTrue(result_1.contains(n_1)) //[2]");
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[3]");
    n_1 = n_iter_1.next();
    assertTrue(result_1.contains(n_1), "Path condition is violated: assertTrue(result_1.contains(n_1)) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public static void unique(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> n_iter_1 = l.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    assertTrue(result_1.contains(n_1)); //[2]
    assertTrue(n_iter_1.hasNext()); //[3]
    n_1 = n_iter_1.next();
    assertTrue(result_1.contains(n_1)); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((l.iterator()).hasNext())
2#assertTrue((new ArrayList<Integer>()).contains(n_iter_1.next()))
3#assertTrue((l.iterator()).hasNext())
4#assertTrue((new ArrayList<Integer>()).contains(n_iter_1.next()))

*/
