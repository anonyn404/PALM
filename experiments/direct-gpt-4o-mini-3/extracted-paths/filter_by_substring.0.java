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
    assertFalse(string_iter_1.hasNext(), "Path condition is violated: assertFalse(string_iter_1.hasNext()) //[1]");
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
    assertFalse(string_iter_1.hasNext()); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((strings.iterator()).hasNext())

*/
