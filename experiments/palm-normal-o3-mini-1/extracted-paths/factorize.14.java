import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FACTORIZE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> factorize(int n){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 <= (int) (Math.sqrt(n) + 1), "Path condition is violated: assertTrue(2 <= (int) (Math.sqrt(n) + 1)) //[1]");
    assertFalse(n % 2 == 0, "Path condition is violated: assertFalse(n % 2 == 0) //[2]");
    i_1 += 1;
    assertFalse(3 <= (int) (Math.sqrt(n) + 1), "Path condition is violated: assertFalse(3 <= (int) (Math.sqrt(n) + 1)) //[3]");
    assertFalse(n > 1, "Path condition is violated: assertFalse(n > 1) //[4]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> factorize(int n){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 <= (int) (Math.sqrt(n) + 1)); //[1]
    assertFalse(n % 2 == 0); //[2]
    i_1 += 1;
    assertFalse(3 <= (int) (Math.sqrt(n) + 1)); //[3]
    assertFalse(n > 1); //[4]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(2 <= (int) (Math.sqrt(n) + 1))
2#assertFalse(n % 2 == 0)
3#assertFalse(3 <= (int) (Math.sqrt(n) + 1))
4#assertFalse(n > 1)

*/
