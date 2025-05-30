import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FILTER_INTEGERS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> filter_integers(List<Object> values){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Object> value_iter_1 = values.iterator();
    Object value_1;
    assertTrue(value_iter_1.hasNext(), "Path condition is violated: assertTrue(value_iter_1.hasNext()) //[1]");
    value_1 = value_iter_1.next();
    assertFalse(value_1 instanceof Integer, "Path condition is violated: assertFalse(value_1 instanceof Integer) //[2]");
    assertTrue(value_iter_1.hasNext(), "Path condition is violated: assertTrue(value_iter_1.hasNext()) //[3]");
    value_1 = value_iter_1.next();
    assertTrue(value_1 instanceof Integer, "Path condition is violated: assertTrue(value_1 instanceof Integer) //[4]");
    result_1.add((Integer) value_1);
    assertFalse(value_iter_1.hasNext(), "Path condition is violated: assertFalse(value_iter_1.hasNext()) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> filter_integers(List<Object> values){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Object> value_iter_1 = values.iterator();
    Object value_1;
    assertTrue(value_iter_1.hasNext()); //[1]
    value_1 = value_iter_1.next();
    assertFalse(value_1 instanceof Integer); //[2]
    assertTrue(value_iter_1.hasNext()); //[3]
    value_1 = value_iter_1.next();
    assertTrue(value_1 instanceof Integer); //[4]
    result_1.add((Integer) value_1);
    assertFalse(value_iter_1.hasNext()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((values.iterator()).hasNext())
2#assertFalse(value_iter_1.next() instanceof Integer)
3#assertTrue((values.iterator()).hasNext())
4#assertTrue(value_iter_1.next() instanceof Integer)
5#assertFalse((values.iterator()).hasNext())

*/
