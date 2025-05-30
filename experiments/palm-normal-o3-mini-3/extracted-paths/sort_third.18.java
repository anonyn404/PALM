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
    assertFalse(3 < l.size(), "Path condition is violated: assertFalse(3 < l.size()) //[2]");
    Collections.sort(thirds_1);
    int i_2 = 0;
    assertTrue(0 < l.size(), "Path condition is violated: assertTrue(0 < l.size()) //[3]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[4]");
    result_1.add(thirds_1.get((int) 0));
    i_2 += 1;
    assertTrue(1 < l.size(), "Path condition is violated: assertTrue(1 < l.size()) //[5]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[6]");
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
    assertFalse(3 < l.size()); //[2]
    Collections.sort(thirds_1);
    int i_2 = 0;
    assertTrue(0 < l.size()); //[3]
    assertTrue(true); //[4]
    result_1.add(thirds_1.get((int) 0));
    i_2 += 1;
    assertTrue(1 < l.size()); //[5]
    assertFalse(false); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.size())
2#assertFalse(3 < l.size())
3#assertTrue(0 < l.size())
4#assertTrue(true)
5#assertTrue(1 < l.size())
6#assertFalse(false)

*/
