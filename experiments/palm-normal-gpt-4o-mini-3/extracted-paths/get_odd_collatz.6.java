import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class GET_ODD_COLLATZ {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void get_odd_collatz(int n){
    ArrayList<Integer> result_1 = new ArrayList<>();
    assertTrue((n % 2) == 1, "Path condition is violated: assertTrue((n % 2) == 1) //[1]");
    result_1.add(n);
    assertTrue(n > 1, "Path condition is violated: assertTrue(n > 1) //[2]");
    assertTrue((n % 2) == 0, "Path condition is violated: assertTrue((n % 2) == 0) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static void get_odd_collatz(int n){
    ArrayList<Integer> result_1 = new ArrayList<>();
    assertTrue((n % 2) == 1); //[1]
    result_1.add(n);
    assertTrue(n > 1); //[2]
    assertTrue((n % 2) == 0); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((n % 2) == 1)
2#assertTrue(n > 1)
3#assertTrue((n % 2) == 0)

*/
