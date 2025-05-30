import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class REMOVE_DUPLICATES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void remove_duplicates(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    HashMap<Integer, Integer> count_1 = new HashMap<Integer, Integer>();
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    assertFalse(!count_1.containsKey(n_1), "Path condition is violated: assertFalse(!count_1.containsKey(n_1)) //[2]");
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public static void remove_duplicates(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    HashMap<Integer, Integer> count_1 = new HashMap<Integer, Integer>();
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    assertFalse(!count_1.containsKey(n_1)); //[2]
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertTrue(n_iter_1.hasNext()); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertFalse(!(new HashMap<Integer, Integer>()).containsKey(n_iter_1.next()))
3#assertTrue((numbers.iterator()).hasNext())

*/
