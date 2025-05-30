import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FILTER_BY_SUBSTRING {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void filter_by_substring(List<String> strings, String substring){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[1]");
    string_1 = string_iter_1.next();
    assertFalse(string_1.contains(substring), "Path condition is violated: assertFalse(string_1.contains(substring)) //[2]");
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void filter_by_substring(List<String> strings, String substring){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext()); //[1]
    string_1 = string_iter_1.next();
    assertFalse(string_1.contains(substring)); //[2]
    assertTrue(string_iter_1.hasNext()); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((strings.iterator()).hasNext())
2#assertFalse((string_iter_1.next()).contains(substring))
3#assertTrue((strings.iterator()).hasNext())

*/
