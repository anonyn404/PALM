import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class REMOVE_DUPLICATES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> remove_duplicates(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    HashMap<Integer, Integer> count_1 = new HashMap<Integer, Integer>();
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertFalse(n_iter_1.hasNext(), "Path condition is violated: assertFalse(n_iter_1.hasNext()) //[1]");
    Iterator<Integer> n_iter_2 = numbers.iterator();
    Integer n_2;
    assertTrue(n_iter_2.hasNext(), "Path condition is violated: assertTrue(n_iter_2.hasNext()) //[2]");
    n_2 = n_iter_2.next();
    assertFalse(count_1.get(n_2) == 1, "Path condition is violated: assertFalse(count_1.get(n_2) == 1) //[3]");
    assertFalse(n_iter_2.hasNext(), "Path condition is violated: assertFalse(n_iter_2.hasNext()) //[4]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public static List<Integer> remove_duplicates(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    HashMap<Integer, Integer> count_1 = new HashMap<Integer, Integer>();
    Iterator<Integer> n_iter_1 = numbers.iterator();
    Integer n_1;
    assertFalse(n_iter_1.hasNext()); //[1]
    Iterator<Integer> n_iter_2 = numbers.iterator();
    Integer n_2;
    assertTrue(n_iter_2.hasNext()); //[2]
    n_2 = n_iter_2.next();
    assertFalse(count_1.get(n_2) == 1); //[3]
    assertFalse(n_iter_2.hasNext()); //[4]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((numbers.iterator()).hasNext())
2#assertTrue((numbers.iterator()).hasNext())
3#assertFalse((new HashMap<Integer, Integer>()).get(n_iter_2.next()) == 1)
4#assertFalse((numbers.iterator()).hasNext())

*/
