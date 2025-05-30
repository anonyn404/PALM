import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

class BY_LENGTH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<String> by_length(ArrayList<Integer> a){
    Map<Integer, String> digit_map_1 = new HashMap<>();
    digit_map_1.put(1, "One");
    digit_map_1.put(2, "Two");
    digit_map_1.put(3, "Three");
    digit_map_1.put(4, "Four");
    digit_map_1.put(5, "Five");
    digit_map_1.put(6, "Six");
    digit_map_1.put(7, "Seven");
    digit_map_1.put(8, "Eight");
    digit_map_1.put(9, "Nine");
    Collections.sort(a, Collections.reverseOrder());
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<Integer> num_iter_1 = a.iterator();
    int num_1;
    assertTrue(num_iter_1.hasNext(), "Path condition is violated: assertTrue(num_iter_1.hasNext()) //[1]");
    num_1 = num_iter_1.next();
    assertFalse(digit_map_1.get(num_1) != null, "Path condition is violated: assertFalse(digit_map_1.get(num_1) != null) //[2]");
    assertTrue(num_iter_1.hasNext(), "Path condition is violated: assertTrue(num_iter_1.hasNext()) //[3]");
    num_1 = num_iter_1.next();
    assertFalse(digit_map_1.get(num_1) != null, "Path condition is violated: assertFalse(digit_map_1.get(num_1) != null) //[4]");
    assertFalse(num_iter_1.hasNext(), "Path condition is violated: assertFalse(num_iter_1.hasNext()) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
public static ArrayList<String> by_length(ArrayList<Integer> a){
    Map<Integer, String> digit_map_1 = new HashMap<>();
    digit_map_1.put(1, "One");
    digit_map_1.put(2, "Two");
    digit_map_1.put(3, "Three");
    digit_map_1.put(4, "Four");
    digit_map_1.put(5, "Five");
    digit_map_1.put(6, "Six");
    digit_map_1.put(7, "Seven");
    digit_map_1.put(8, "Eight");
    digit_map_1.put(9, "Nine");
    Collections.sort(a, Collections.reverseOrder());
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<Integer> num_iter_1 = a.iterator();
    int num_1;
    assertTrue(num_iter_1.hasNext()); //[1]
    num_1 = num_iter_1.next();
    assertFalse(digit_map_1.get(num_1) != null); //[2]
    assertTrue(num_iter_1.hasNext()); //[3]
    num_1 = num_iter_1.next();
    assertFalse(digit_map_1.get(num_1) != null); //[4]
    assertFalse(num_iter_1.hasNext()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((a.iterator()).hasNext())
2#assertFalse((new HashMap<>()).get(num_iter_1.next()) != null)
3#assertTrue((a.iterator()).hasNext())
4#assertFalse((new HashMap<>()).get(num_iter_1.next()) != null)
5#assertFalse((a.iterator()).hasNext())

*/
