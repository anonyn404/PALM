import java.util.*;
import java.util.ArrayList;

class ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertTrue(s_iter_1.hasNext(), "Path condition is violated: assertTrue(s_iter_1.hasNext()) //[1]");
    s_1 = s_iter_1.next();
    int n_1 = 0;
    int i_1 = 0;
    assertFalse(0 < s_1.length(), "Path condition is violated: assertFalse(0 < s_1.length()) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertTrue(s_iter_1.hasNext()); //[1]
    s_1 = s_iter_1.next();
    int n_1 = 0;
    int i_1 = 0;
    assertFalse(0 < s_1.length()); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((lst.iterator()).hasNext())
2#assertFalse(0 < (s_iter_1.next()).length())

*/
