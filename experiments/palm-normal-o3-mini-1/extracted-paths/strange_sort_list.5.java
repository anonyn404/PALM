import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class STRANGE_SORT_LIST {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void strange_sort_list(List<Integer> lst){
    List<Integer> result_1 = new ArrayList<Integer>();
    boolean switched_1 = true;
    assertTrue(lst.size() > 0, "Path condition is violated: assertTrue(lst.size() > 0) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
    result_1.add(Collections.min(lst));
    lst.remove(result_1.get(result_1.size() - 1));
    switched_1 = (!true);
    assertTrue(lst.size() > 0, "Path condition is violated: assertTrue(lst.size() > 0) //[3]");
    assertTrue(switched_1, "Path condition is violated: assertTrue(switched_1) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public static void strange_sort_list(List<Integer> lst){
    List<Integer> result_1 = new ArrayList<Integer>();
    boolean switched_1 = true;
    assertTrue(lst.size() > 0); //[1]
    assertTrue(true); //[2]
    result_1.add(Collections.min(lst));
    lst.remove(result_1.get(result_1.size() - 1));
    switched_1 = (!true);
    assertTrue(lst.size() > 0); //[3]
    assertTrue(switched_1); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(lst.size() > 0)
2#assertTrue(true)
3#assertTrue(lst.size() > 0)
4#assertTrue((!true))

*/
