import java.util.*;
import java.util.ArrayList;

class FIB4 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void fib4(int n){
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    result_1.add(0);
    result_1.add(0);
    result_1.add(2);
    result_1.add(0);
    assertFalse(n < 4, "Path condition is violated: assertFalse(n < 4) //[1]");
    int i_1 = 4;
    assertTrue(4 < n + 1, "Path condition is violated: assertTrue(4 < n + 1) //[2]");
    result_1.add(result_1.get(0) + result_1.get(1) + result_1.get(2) + result_1.get(3));
    result_1.remove(0);
    i_1 += 1;
    assertTrue(5 < n + 1, "Path condition is violated: assertTrue(5 < n + 1) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void fib4(int n){
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    result_1.add(0);
    result_1.add(0);
    result_1.add(2);
    result_1.add(0);
    assertFalse(n < 4); //[1]
    int i_1 = 4;
    assertTrue(4 < n + 1); //[2]
    result_1.add(result_1.get(0) + result_1.get(1) + result_1.get(2) + result_1.get(3));
    result_1.remove(0);
    i_1 += 1;
    assertTrue(5 < n + 1); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(n < 4)
2#assertTrue(4 < n + 1)
3#assertTrue(5 < n + 1)

*/
