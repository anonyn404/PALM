import java.util.*;
import java.util.List;

class TOTAL_MATCH {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void total_match(List<String> lst1, List<String> lst2){
    int l1_1 = 0;
    Iterator<String> st_iter_1 = lst1.iterator();
    String st_1;
    assertTrue(st_iter_1.hasNext(), "Path condition is violated: assertTrue(st_iter_1.hasNext()) //[1]");
    st_1 = st_iter_1.next();
    l1_1 += st_1.length();
    assertTrue(st_iter_1.hasNext(), "Path condition is violated: assertTrue(st_iter_1.hasNext()) //[2]");
    st_1 = st_iter_1.next();
    l1_1 += st_1.length();
    assertFalse(st_iter_1.hasNext(), "Path condition is violated: assertFalse(st_iter_1.hasNext()) //[3]");
    int l2_1 = 0;
    Iterator<String> st_iter_2 = lst2.iterator();
    String st_2;
    assertTrue(st_iter_2.hasNext(), "Path condition is violated: assertTrue(st_iter_2.hasNext()) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void total_match(List<String> lst1, List<String> lst2){
    int l1_1 = 0;
    Iterator<String> st_iter_1 = lst1.iterator();
    String st_1;
    assertTrue(st_iter_1.hasNext()); //[1]
    st_1 = st_iter_1.next();
    l1_1 += st_1.length();
    assertTrue(st_iter_1.hasNext()); //[2]
    st_1 = st_iter_1.next();
    l1_1 += st_1.length();
    assertFalse(st_iter_1.hasNext()); //[3]
    int l2_1 = 0;
    Iterator<String> st_iter_2 = lst2.iterator();
    String st_2;
    assertTrue(st_iter_2.hasNext()); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((lst1.iterator()).hasNext())
2#assertTrue((lst1.iterator()).hasNext())
3#assertFalse((lst1.iterator()).hasNext())
4#assertTrue((lst2.iterator()).hasNext())

*/
