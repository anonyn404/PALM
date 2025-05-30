import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class IS_NESTED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertFalse(0 < brackets.length(), "Path condition is violated: assertFalse(0 < brackets.length()) //[1]");
    Collections.reverse(closing_brackets_1);
    int cnt_1 = 0, i_2 = 0, l_1 = closing_brackets_1.size();
    Iterator<Integer> idx_iter_1 = opening_brackets_1.iterator();
    int idx_1;
    assertTrue(idx_iter_1.hasNext(), "Path condition is violated: assertTrue(idx_iter_1.hasNext()) //[2]");
    idx_1 = idx_iter_1.next();
    assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0), "Path condition is violated: assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0)) //[3]");
    assertTrue(idx_iter_1.hasNext(), "Path condition is violated: assertTrue(idx_iter_1.hasNext()) //[4]");
    idx_1 = idx_iter_1.next();
    assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0), "Path condition is violated: assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0)) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static void is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertFalse(0 < brackets.length()); //[1]
    Collections.reverse(closing_brackets_1);
    int cnt_1 = 0, i_2 = 0, l_1 = closing_brackets_1.size();
    Iterator<Integer> idx_iter_1 = opening_brackets_1.iterator();
    int idx_1;
    assertTrue(idx_iter_1.hasNext()); //[2]
    idx_1 = idx_iter_1.next();
    assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0)); //[3]
    assertTrue(idx_iter_1.hasNext()); //[4]
    idx_1 = idx_iter_1.next();
    assertFalse(0 < l_1 && idx_1 < closing_brackets_1.get(0)); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(0 < brackets.length())
2#assertTrue((new ArrayList<>().iterator()).hasNext())
3#assertFalse(0 < new ArrayList<>().size() && idx_iter_1.next() < (new ArrayList<>()).get(0))
4#assertTrue((new ArrayList<>().iterator()).hasNext())
5#assertFalse(0 < new ArrayList<>().size() && idx_iter_1.next() < (new ArrayList<>()).get(0))

*/
