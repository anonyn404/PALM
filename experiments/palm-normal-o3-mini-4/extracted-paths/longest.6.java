import java.util.*;
import java.util.List;

class LONGEST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void longest(List<String> strings){
    int maxlen_1 = 0;
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertFalse(string_iter_1.hasNext(), "Path condition is violated: assertFalse(string_iter_1.hasNext()) //[1]");
    Iterator<String> string_iter_2 = strings.iterator();
    String string_2;
    assertTrue(string_iter_2.hasNext(), "Path condition is violated: assertTrue(string_iter_2.hasNext()) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void longest(List<String> strings){
    int maxlen_1 = 0;
    Iterator<String> string_iter_1 = strings.iterator();
    String string_1;
    assertFalse(string_iter_1.hasNext()); //[1]
    Iterator<String> string_iter_2 = strings.iterator();
    String string_2;
    assertTrue(string_iter_2.hasNext()); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((strings.iterator()).hasNext())
2#assertTrue((strings.iterator()).hasNext())

*/
