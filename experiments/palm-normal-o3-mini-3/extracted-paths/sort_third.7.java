import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SORT_THIRD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void sort_third(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    List<Integer> thirds_1 = new ArrayList<Integer>();
    int i_1 = 0;
    assertTrue(0 < l.size(), "Path condition is violated: assertTrue(0 < l.size()) //[1]");
    thirds_1.add(l.get(0));
    i_1 += 3;
    assertTrue(3 < l.size(), "Path condition is violated: assertTrue(3 < l.size()) //[2]");
    thirds_1.add(l.get(3));
    i_1 += 3;
    assertFalse(6 < l.size(), "Path condition is violated: assertFalse(6 < l.size()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public static void sort_third(List<Integer> l){
    List<Integer> result_1 = new ArrayList<Integer>();
    List<Integer> thirds_1 = new ArrayList<Integer>();
    int i_1 = 0;
    assertTrue(0 < l.size()); //[1]
    thirds_1.add(l.get(0));
    i_1 += 3;
    assertTrue(3 < l.size()); //[2]
    thirds_1.add(l.get(3));
    i_1 += 3;
    assertFalse(6 < l.size()); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.size())
2#assertTrue(3 < l.size())
3#assertFalse(6 < l.size())

*/
