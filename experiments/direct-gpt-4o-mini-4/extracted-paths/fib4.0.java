import java.util.*;
import java.util.ArrayList;

class FIB4 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int fib4(int n){
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    result_1.add(0);
    result_1.add(0);
    result_1.add(2);
    result_1.add(0);
    assertTrue(n < 4, "Path condition is violated: assertTrue(n < 4) //[1]");
    return result_1.get(n);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static int fib4(int n){
    ArrayList<Integer> result_1 = new ArrayList<Integer>();
    result_1.add(0);
    result_1.add(0);
    result_1.add(2);
    result_1.add(0);
    assertTrue(n < 4); //[1]
    return result_1.get(n);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(n < 4)

*/
