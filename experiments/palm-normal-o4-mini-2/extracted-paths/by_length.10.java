import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

class BY_LENGTH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void by_length(ArrayList<Integer> a){
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
    assertTrue(digit_map_1.get(num_1) != null, "Path condition is violated: assertTrue(digit_map_1.get(num_1) != null) //[2]");
    result_1.add(digit_map_1.get(num_1));
    assertTrue(num_iter_1.hasNext(), "Path condition is violated: assertTrue(num_iter_1.hasNext()) //[3]");
    num_1 = num_iter_1.next();
    assertTrue(digit_map_1.get(num_1) != null, "Path condition is violated: assertTrue(digit_map_1.get(num_1) != null) //[4]");
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
public static void by_length(ArrayList<Integer> a){
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
    assertTrue(digit_map_1.get(num_1) != null); //[2]
    result_1.add(digit_map_1.get(num_1));
    assertTrue(num_iter_1.hasNext()); //[3]
    num_1 = num_iter_1.next();
    assertTrue(digit_map_1.get(num_1) != null); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((a.iterator()).hasNext())
2#assertTrue((new HashMap<>()).get(num_iter_1.next()) != null)
3#assertTrue((a.iterator()).hasNext())
4#assertTrue((new HashMap<>()).get(num_iter_1.next()) != null)

*/
