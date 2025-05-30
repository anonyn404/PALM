import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class GET_ODD_COLLATZ {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void get_odd_collatz(int n){
    ArrayList<Integer> result_1 = new ArrayList<>();
    assertFalse((n % 2) == 1, "Path condition is violated: assertFalse((n % 2) == 1) //[1]");
    assertTrue(n > 1, "Path condition is violated: assertTrue(n > 1) //[2]");
    assertFalse((n % 2) == 0, "Path condition is violated: assertFalse((n % 2) == 0) //[3]");
    n = 3 * n + 1;
    assertFalse((n % 2) == 1, "Path condition is violated: assertFalse((n % 2) == 1) //[4]");
    assertTrue(n > 1, "Path condition is violated: assertTrue(n > 1) //[5]");
    assertFalse((n % 2) == 0, "Path condition is violated: assertFalse((n % 2) == 0) //[6]");
    n = 3 * n + 1;
    assertTrue((n % 2) == 1, "Path condition is violated: assertTrue((n % 2) == 1) //[7]");
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
    assertFalse((n % 2) == 1); //[1]
    assertTrue(n > 1); //[2]
    assertFalse((n % 2) == 0); //[3]
    n = 3 * n + 1;
    assertFalse((n % 2) == 1); //[4]
    assertTrue(n > 1); //[5]
    assertFalse((n % 2) == 0); //[6]
    n = 3 * n + 1;
    assertTrue((n % 2) == 1); //[7]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((n % 2) == 1)
2#assertTrue(n > 1)
3#assertFalse((n % 2) == 0)
4#assertFalse((3 * n + 1 % 2) == 1)
5#assertTrue(3 * n + 1 > 1)
6#assertFalse((3 * n + 1 % 2) == 0)
7#assertTrue((3 * n + 1 % 2) == 1)

*/
