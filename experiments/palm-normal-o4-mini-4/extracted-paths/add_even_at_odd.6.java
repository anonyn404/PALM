import java.util.*;

class ADD_EVEN_AT_ODD {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int add_even_at_odd(int[] lst){
    int sum_1 = 0;
    int i_1 = 1;
    assertTrue(1 < lst.length, "Path condition is violated: assertTrue(1 < lst.length) //[1]");
    assertFalse(lst[1] % 2 == 0, "Path condition is violated: assertFalse(lst[1] % 2 == 0) //[2]");
    i_1 += 2;
    assertFalse(3 < lst.length, "Path condition is violated: assertFalse(3 < lst.length) //[3]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int add_even_at_odd(int[] lst){
    int sum_1 = 0;
    int i_1 = 1;
    assertTrue(1 < lst.length); //[1]
    assertFalse(lst[1] % 2 == 0); //[2]
    i_1 += 2;
    assertFalse(3 < lst.length); //[3]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 < lst.length)
2#assertFalse(lst[1] % 2 == 0)
3#assertFalse(3 < lst.length)

*/
