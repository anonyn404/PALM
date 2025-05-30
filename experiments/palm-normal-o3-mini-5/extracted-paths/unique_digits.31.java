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
    assertFalse((curr_digit_1 % 2) == 0, "Path condition is violated: assertFalse((curr_digit_1 % 2) == 0) //[3]");
    num_1 /= 10;
    assertFalse(num_1 > 0, "Path condition is violated: assertFalse(num_1 > 0) //[4]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[5]");
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[6]");
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0, "Path condition is violated: assertTrue(num_2 > 0) //[7]");
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
    assertFalse((curr_digit_1 % 2) == 0); //[3]
    num_1 /= 10;
    assertFalse(num_1 > 0); //[4]
    assertTrue(true); //[5]
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext()); //[6]
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0); //[7]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((x.iterator()).hasNext())
2#assertTrue(i_1 > 0)
3#assertFalse((i_1 % 10 % 2) == 0)
4#assertFalse(i_1 / 10 > 0)
5#assertTrue(true)
6#assertTrue((x.iterator()).hasNext())
7#assertTrue(i_1 > 0)

*/
