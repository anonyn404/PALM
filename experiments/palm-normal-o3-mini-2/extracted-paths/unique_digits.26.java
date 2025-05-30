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
    assertTrue(num_1 > 0, "Path condition is violated: assertTrue(num_1 > 0) //[2]");
    int curr_digit_1 = num_1 % 10;
    assertTrue((curr_digit_1 % 2) == 0, "Path condition is violated: assertTrue((curr_digit_1 % 2) == 0) //[3]");
    all_odd_1 = false;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[4]");
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[5]");
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0, "Path condition is violated: assertTrue(num_2 > 0) //[6]");
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
    assertTrue(num_1 > 0); //[2]
    int curr_digit_1 = num_1 % 10;
    assertTrue((curr_digit_1 % 2) == 0); //[3]
    all_odd_1 = false;
    assertFalse(false); //[4]
    assertTrue(i_iter_1.hasNext()); //[5]
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((x.iterator()).hasNext())
2#assertTrue(i_1 > 0)
3#assertTrue((i_1 % 10 % 2) == 0)
4#assertFalse(false)
5#assertTrue((x.iterator()).hasNext())
6#assertTrue(i_1 > 0)

*/
