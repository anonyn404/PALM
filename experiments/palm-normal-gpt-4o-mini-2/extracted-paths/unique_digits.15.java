import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class UNIQUE_DIGITS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void unique_digits(ArrayList<Integer> x){
    ArrayList<Integer> res_1 = new ArrayList<Integer>();
    Iterator<Integer> i_iter_1 = x.iterator();
    int i_1;
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[1]");
    i_1 = i_iter_1.next();
    int num_1 = i_1;
    boolean all_odd_1 = true;
    assertFalse(num_1 > 0, "Path condition is violated: assertFalse(num_1 > 0) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[4]");
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertFalse(num_2 > 0, "Path condition is violated: assertFalse(num_2 > 0) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static void unique_digits(ArrayList<Integer> x){
    ArrayList<Integer> res_1 = new ArrayList<Integer>();
    Iterator<Integer> i_iter_1 = x.iterator();
    int i_1;
    assertTrue(i_iter_1.hasNext()); //[1]
    i_1 = i_iter_1.next();
    int num_1 = i_1;
    boolean all_odd_1 = true;
    assertFalse(num_1 > 0); //[2]
    assertTrue(true); //[3]
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext()); //[4]
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertFalse(num_2 > 0); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((x.iterator()).hasNext())
2#assertFalse(i_1 > 0)
3#assertTrue(true)
4#assertTrue((x.iterator()).hasNext())
5#assertFalse(i_1 > 0)

*/
