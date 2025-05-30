import java.util.*;
import java.util.List;

class LONGEST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String longest(List<String> strings){
    int maxlen_1 = 0;
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext(), "Path condition is violated: assertTrue(string_iter_1.hasNext()) //[1]");
    string_1 = string_iter_1.next();
    assertFalse(string_1.length() > 0, "Path condition is violated: assertFalse(string_1.length() > 0) //[2]");
    assertFalse(string_iter_1.hasNext(), "Path condition is violated: assertFalse(string_iter_1.hasNext()) //[3]");
    Iterator<String> string_iter_2 = strings.iterator();
    String string_2;
    assertFalse(string_iter_2.hasNext(), "Path condition is violated: assertFalse(string_iter_2.hasNext()) //[4]");
    return null;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static String longest(List<String> strings){
    int maxlen_1 = 0;
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertTrue(string_iter_1.hasNext()); //[1]
    string_1 = string_iter_1.next();
    assertFalse(string_1.length() > 0); //[2]
    assertFalse(string_iter_1.hasNext()); //[3]
    Iterator<String> string_iter_2 = strings.iterator();
    String string_2;
    assertFalse(string_iter_2.hasNext()); //[4]
    return null;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((strings.iterator()).hasNext())
2#assertFalse((string_iter_1.next()).length() > 0)
3#assertFalse((strings.iterator()).hasNext())
4#assertFalse((strings.iterator()).hasNext())

*/
