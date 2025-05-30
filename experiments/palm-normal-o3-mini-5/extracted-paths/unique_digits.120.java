import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class UNIQUE_DIGITS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<Integer> unique_digits(ArrayList<Integer> x){
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
    assertFalse((curr_digit_2 % 2) == 0, "Path condition is violated: assertFalse((curr_digit_2 % 2) == 0) //[5]");
    num_1 /= 10;
    assertFalse(num_1 > 0, "Path condition is violated: assertFalse(num_1 > 0) //[6]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[7]");
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[8]");
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0, "Path condition is violated: assertTrue(num_2 > 0) //[9]");
    int curr_digit_3 = num_2 % 10;
    assertFalse((curr_digit_3 % 2) == 0, "Path condition is violated: assertFalse((curr_digit_3 % 2) == 0) //[10]");
    num_2 /= 10;
    assertTrue(num_2 > 0, "Path condition is violated: assertTrue(num_2 > 0) //[11]");
    int curr_digit_4 = num_2 % 10;
    assertFalse((curr_digit_4 % 2) == 0, "Path condition is violated: assertFalse((curr_digit_4 % 2) == 0) //[12]");
    num_2 /= 10;
    assertFalse(num_2 > 0, "Path condition is violated: assertFalse(num_2 > 0) //[13]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[14]");
    res_1.add(i_1);
    assertFalse(i_iter_1.hasNext(), "Path condition is violated: assertFalse(i_iter_1.hasNext()) //[15]");
    Collections.sort(res_1);
    return res_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static ArrayList<Integer> unique_digits(ArrayList<Integer> x){
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
    assertFalse((curr_digit_2 % 2) == 0); //[5]
    num_1 /= 10;
    assertFalse(num_1 > 0); //[6]
    assertTrue(true); //[7]
    res_1.add(i_1);
    assertTrue(i_iter_1.hasNext()); //[8]
    i_1 = i_iter_1.next();
    int num_2 = i_1;
    boolean all_odd_2 = true;
    assertTrue(num_2 > 0); //[9]
    int curr_digit_3 = num_2 % 10;
    assertFalse((curr_digit_3 % 2) == 0); //[10]
    num_2 /= 10;
    assertTrue(num_2 > 0); //[11]
    int curr_digit_4 = num_2 % 10;
    assertFalse((curr_digit_4 % 2) == 0); //[12]
    num_2 /= 10;
    assertFalse(num_2 > 0); //[13]
    assertTrue(true); //[14]
    res_1.add(i_1);
    assertFalse(i_iter_1.hasNext()); //[15]
    Collections.sort(res_1);
    return res_1;
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
5#assertFalse((i_1 / 10 % 10 % 2) == 0)
6#assertFalse((i_1 / 10) / 10 > 0)
7#assertTrue(true)
8#assertTrue((x.iterator()).hasNext())
9#assertTrue(i_1 > 0)
10#assertFalse((i_1 % 10 % 2) == 0)
11#assertTrue(i_1 / 10 > 0)
12#assertFalse((i_1 / 10 % 10 % 2) == 0)
13#assertFalse((i_1 / 10) / 10 > 0)
14#assertTrue(true)
15#assertFalse((x.iterator()).hasNext())

*/
