import java.util.*;
import java.util.List;

class MAX_ELEMENT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void max_element(List<Integer> l){
    int m_1 = l.get(0);
    Iterator<Integer> e_iter_1 = l.iterator();
    Integer e_1;
    assertTrue(e_iter_1.hasNext(), "Path condition is violated: assertTrue(e_iter_1.hasNext()) //[1]");
    e_1 = e_iter_1.next();
    assertFalse(e_1 > m_1, "Path condition is violated: assertFalse(e_1 > m_1) //[2]");
    assertTrue(e_iter_1.hasNext(), "Path condition is violated: assertTrue(e_iter_1.hasNext()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void max_element(List<Integer> l){
    int m_1 = l.get(0);
    Iterator<Integer> e_iter_1 = l.iterator();
    Integer e_1;
    assertTrue(e_iter_1.hasNext()); //[1]
    e_1 = e_iter_1.next();
    assertFalse(e_1 > m_1); //[2]
    assertTrue(e_iter_1.hasNext()); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((l.iterator()).hasNext())
2#assertFalse(e_iter_1.next() > l.get(0))
3#assertTrue((l.iterator()).hasNext())

*/
