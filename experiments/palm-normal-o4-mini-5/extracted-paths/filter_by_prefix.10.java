import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FILTER_BY_PREFIX {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void filter_by_prefix(List<String> strings, String prefix){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[1]");
    string_1 = string_iter_1.next();
    assertTrue(string_1.startsWith(prefix), "Path condition is violated: assertTrue(string_1.startsWith(prefix)) //[2]");
    result_1.add(string_1);
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[3]");
    string_1 = string_iter_1.next();
    assertTrue(string_1.startsWith(prefix), "Path condition is violated: assertTrue(string_1.startsWith(prefix)) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void filter_by_prefix(List<String> strings, String prefix){
    List<String> result_1 = new ArrayList<String>();
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext()); //[1]
    string_1 = string_iter_1.next();
    assertTrue(string_1.startsWith(prefix)); //[2]
    result_1.add(string_1);
    assertTrue(string_iter_1.hasNext()); //[3]
    string_1 = string_iter_1.next();
    assertTrue(string_1.startsWith(prefix)); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((strings.iterator()).hasNext())
2#assertTrue((string_iter_1.next()).startsWith(prefix))
3#assertTrue((strings.iterator()).hasNext())
4#assertTrue((string_iter_1.next()).startsWith(prefix))

*/
