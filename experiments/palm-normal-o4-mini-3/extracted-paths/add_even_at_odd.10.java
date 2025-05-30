import java.util.*;

class ADD_EVEN_AT_ODD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void add_even_at_odd(int[] lst){
    int sum_1 = 0;
    int i_1 = 1;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[1]");
    assertTrue(lst[1] % 2 == 0, "Path condition is violated: assertTrue(lst[1] % 2 == 0) //[2]");
    sum_1 += lst[1];
    i_1 += 2;
    assertTrue(3 < lst.length, "Path condition is violated: assertTrue(3 < lst.length) //[3]");
    assertTrue(lst[3] % 2 == 0, "Path condition is violated: assertTrue(lst[3] % 2 == 0) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void add_even_at_odd(int[] lst){
    int sum_1 = 0;
    int i_1 = 1;
    assertTrue(1 < lst.length); //[1]
    assertTrue(lst[1] % 2 == 0); //[2]
    sum_1 += lst[1];
    i_1 += 2;
    assertTrue(3 < lst.length); //[3]
    assertTrue(lst[3] % 2 == 0); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 < lst.length)
2#assertTrue(lst[1] % 2 == 0)
3#assertTrue(3 < lst.length)
4#assertTrue(lst[3] % 2 == 0)

*/
