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
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[1]");
    n_1 = n_iter_1.next();
    assertTrue(!count_1.containsKey(n_1), "Path condition is violated: assertTrue(!count_1.containsKey(n_1)) //[2]");
    count_1.put(n_1, 0);
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertTrue(n_iter_1.hasNext(), "Path condition is violated: assertTrue(n_iter_1.hasNext()) //[3]");
    n_1 = n_iter_1.next();
    assertFalse(!count_1.containsKey(n_1), "Path condition is violated: assertFalse(!count_1.containsKey(n_1)) //[4]");
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertFalse(n_iter_1.hasNext(), "Path condition is violated: assertFalse(n_iter_1.hasNext()) //[5]");
    Iterator<Integer> n_iter_2 = numbers.iterator();
    Integer n_2;
    assertTrue(n_iter_2.hasNext(), "Path condition is violated: assertTrue(n_iter_2.hasNext()) //[6]");
    n_2 = n_iter_2.next();
    assertTrue(count_1.get(n_2) == 1, "Path condition is violated: assertTrue(count_1.get(n_2) == 1) //[7]");
    result_1.add(n_2);
    assertTrue(n_iter_2.hasNext(), "Path condition is violated: assertTrue(n_iter_2.hasNext()) //[8]");
    n_2 = n_iter_2.next();
    assertTrue(count_1.get(n_2) == 1, "Path condition is violated: assertTrue(count_1.get(n_2) == 1) //[9]");
    result_1.add(n_2);
    assertFalse(n_iter_2.hasNext(), "Path condition is violated: assertFalse(n_iter_2.hasNext()) //[10]");
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
    assertTrue(n_iter_1.hasNext()); //[1]
    n_1 = n_iter_1.next();
    assertTrue(!count_1.containsKey(n_1)); //[2]
    count_1.put(n_1, 0);
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertTrue(n_iter_1.hasNext()); //[3]
    n_1 = n_iter_1.next();
    assertFalse(!count_1.containsKey(n_1)); //[4]
    count_1.put(n_1, count_1.get(n_1) + 1);
    assertFalse(n_iter_1.hasNext()); //[5]
    Iterator<Integer> n_iter_2 = numbers.iterator();
    Integer n_2;
    assertTrue(n_iter_2.hasNext()); //[6]
    n_2 = n_iter_2.next();
    assertTrue(count_1.get(n_2) == 1); //[7]
    result_1.add(n_2);
    assertTrue(n_iter_2.hasNext()); //[8]
    n_2 = n_iter_2.next();
    assertTrue(count_1.get(n_2) == 1); //[9]
    result_1.add(n_2);
    assertFalse(n_iter_2.hasNext()); //[10]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertTrue(!(new HashMap<Integer, Integer>()).containsKey(n_iter_1.next()))
3#assertTrue((numbers.iterator()).hasNext())
4#assertFalse(!(new HashMap<Integer, Integer>()).containsKey(n_iter_1.next()))
5#assertFalse((numbers.iterator()).hasNext())
6#assertTrue((numbers.iterator()).hasNext())
7#assertTrue((new HashMap<Integer, Integer>()).get(n_iter_2.next()) == 1)
8#assertTrue((numbers.iterator()).hasNext())
9#assertTrue((new HashMap<Integer, Integer>()).get(n_iter_2.next()) == 1)
10#assertFalse((numbers.iterator()).hasNext())

*/
