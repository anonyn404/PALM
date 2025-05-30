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
    assertTrue(num_1 > 0, "Path condition is violated: assertTrue(num_1 > 0) //[4]");
    int curr_digit_2 = num_1 % 10;
    assertTrue((curr_digit_2 % 2) == 0, "Path condition is violated: assertTrue((curr_digit_2 % 2) == 0) //[5]");
    all_odd_1 = false;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[6]");
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[7]");
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0, "Path condition is violated: assertTrue(num_2 > 0) //[8]");
    int curr_digit_3 = num_2 % 10;
    assertFalse((curr_digit_3 % 2) == 0, "Path condition is violated: assertFalse((curr_digit_3 % 2) == 0) //[9]");
    num_2 /= 10;
    assertFalse(num_2 > 0, "Path condition is violated: assertFalse(num_2 > 0) //[10]");
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
    assertTrue(num_1 > 0); //[4]
    int curr_digit_2 = num_1 % 10;
    assertTrue((curr_digit_2 % 2) == 0); //[5]
    all_odd_1 = false;
    assertFalse(false); //[6]
    assertTrue(i_iter_1.hasNext()); //[7]
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0); //[8]
    int curr_digit_3 = num_2 % 10;
    assertFalse((curr_digit_3 % 2) == 0); //[9]
    num_2 /= 10;
    assertFalse(num_2 > 0); //[10]
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
4#assertTrue(i_1 / 10 > 0)
5#assertTrue((i_1 / 10 % 10 % 2) == 0)
6#assertFalse(false)
7#assertTrue((x.iterator()).hasNext())
8#assertTrue(i_1 > 0)
9#assertFalse((i_1 % 10 % 2) == 0)
10#assertFalse(i_1 / 10 > 0)

*/
