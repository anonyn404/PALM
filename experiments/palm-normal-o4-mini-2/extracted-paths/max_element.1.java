import java.util.*;
import java.util.List;

class MAX_ELEMENT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int max_element(List<Integer> l){
    int m_1 = l.get(0);
    Iterator<Integer> e_iter_1 = l.iterator();
    Integer e_1;
    assertFalse(e_iter_1.hasNext(), "Path condition is violated: assertFalse(e_iter_1.hasNext()) //[1]");
    return m_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static int max_element(List<Integer> l){
    int m_1 = l.get(0);
    Iterator<Integer> e_iter_1 = l.iterator();
    Integer e_1;
    assertFalse(e_iter_1.hasNext()); //[1]
    return m_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((l.iterator()).hasNext())

*/
