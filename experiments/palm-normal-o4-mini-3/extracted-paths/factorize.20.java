import java.util.*;
import java.util.ArrayList;
import java.util.List;

class FACTORIZE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void factorize(int n){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 <= (int) (Math.sqrt(n) + 1), "Path condition is violated: assertTrue(2 <= (int) (Math.sqrt(n) + 1)) //[1]");
    assertFalse(n % 2 == 0, "Path condition is violated: assertFalse(n % 2 == 0) //[2]");
    i_1 += 1;
    assertTrue(3 <= (int) (Math.sqrt(n) + 1), "Path condition is violated: assertTrue(3 <= (int) (Math.sqrt(n) + 1)) //[3]");
    assertTrue(n % 3 == 0, "Path condition is violated: assertTrue(n % 3 == 0) //[4]");
    result_1.add(3);
    n = n / 3;
    assertFalse(3 <= (int) (Math.sqrt(n) + 1), "Path condition is violated: assertFalse(3 <= (int) (Math.sqrt(n) + 1)) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void factorize(int n){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 <= (int) (Math.sqrt(n) + 1)); //[1]
    assertFalse(n % 2 == 0); //[2]
    i_1 += 1;
    assertTrue(3 <= (int) (Math.sqrt(n) + 1)); //[3]
    assertTrue(n % 3 == 0); //[4]
    result_1.add(3);
    n = n / 3;
    assertFalse(3 <= (int) (Math.sqrt(n) + 1)); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(2 <= (int) (Math.sqrt(n) + 1))
2#assertFalse(n % 2 == 0)
3#assertTrue(3 <= (int) (Math.sqrt(n) + 1))
4#assertTrue(n % 3 == 0)
5#assertFalse(3 <= (int) (Math.sqrt(n / 3) + 1))

*/
