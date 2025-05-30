import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FILTER_BY_SUBSTRING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<String> filter_by_substring(List<String> strings, String substring){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[1]");
    string_1 = string_iter_1.next();
    assertTrue(string_1.contains(substring), "Path condition is violated: assertTrue(string_1.contains(substring)) //[2]");
    result_1.add(string_1);
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[3]");
    string_1 = string_iter_1.next();
    assertFalse(string_1.contains(substring), "Path condition is violated: assertFalse(string_1.contains(substring)) //[4]");
    assertFalse(string_iter_1.hasNext(), "Path condition is violated: assertFalse(string_iter_1.hasNext()) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<String> filter_by_substring(List<String> strings, String substring){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext()); //[1]
    string_1 = string_iter_1.next();
    assertTrue(string_1.contains(substring)); //[2]
    result_1.add(string_1);
    assertTrue(string_iter_1.hasNext()); //[3]
    string_1 = string_iter_1.next();
    assertFalse(string_1.contains(substring)); //[4]
    assertFalse(string_iter_1.hasNext()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((strings.iterator()).hasNext())
2#assertTrue((string_iter_1.next()).contains(substring))
3#assertTrue((strings.iterator()).hasNext())
4#assertFalse((string_iter_1.next()).contains(substring))
5#assertFalse((strings.iterator()).hasNext())

*/
