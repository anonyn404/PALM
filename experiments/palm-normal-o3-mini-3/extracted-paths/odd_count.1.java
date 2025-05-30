import java.util.*;
import java.util.ArrayList;

class ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<String> odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertFalse(s_iter_1.hasNext(), "Path condition is violated: assertFalse(s_iter_1.hasNext()) //[1]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static ArrayList<String> odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertFalse(s_iter_1.hasNext()); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((lst.iterator()).hasNext())

*/
