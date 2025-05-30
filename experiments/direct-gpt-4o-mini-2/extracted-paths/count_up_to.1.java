import java.util.*;
import java.util.ArrayList;
import java.util.List;

class COUNT_UP_TO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> count_up_to(int n){
    List<Integer> primes_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 < n, "Path condition is violated: assertTrue(2 < n) //[1]");
    boolean is_prime_1 = true;
    int j_1 = 2;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    primes_1.add(2);
    i_1 += 1;
    assertFalse(3 < n, "Path condition is violated: assertFalse(3 < n) //[4]");
    return primes_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> count_up_to(int n){
    List<Integer> primes_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 < n); //[1]
    boolean is_prime_1 = true;
    int j_1 = 2;
    assertFalse(false); //[2]
    assertTrue(true); //[3]
    primes_1.add(2);
    i_1 += 1;
    assertFalse(3 < n); //[4]
    return primes_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(2 < n)
2#assertFalse(false)
3#assertTrue(true)
4#assertFalse(3 < n)

*/
