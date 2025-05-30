import java.util.*;
import java.util.ArrayList;
import java.util.List;

class COUNT_UP_TO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void count_up_to(int n){
    List<Integer> primes_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 < n, "Path condition is violated: assertTrue(2 < n) //[1]");
    boolean is_prime_1 = true;
    int j_1 = 2;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    primes_1.add(2);
    i_1 += 1;
    assertTrue(3 < n, "Path condition is violated: assertTrue(3 < n) //[4]");
    boolean is_prime_2 = true;
    int j_2 = 2;
    assertTrue(true, "Path condition is violated: assertTrue(true) //[5]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[6]");
    j_2 += 1;
    assertFalse(false, "Path condition is violated: assertFalse(false) //[7]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[8]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void count_up_to(int n){
    List<Integer> primes_1 = new ArrayList<Integer>();
    int i_1 = 2;
    assertTrue(2 < n); //[1]
    boolean is_prime_1 = true;
    int j_1 = 2;
    assertFalse(false); //[2]
    assertTrue(true); //[3]
    primes_1.add(2);
    i_1 += 1;
    assertTrue(3 < n); //[4]
    boolean is_prime_2 = true;
    int j_2 = 2;
    assertTrue(true); //[5]
    assertFalse(false); //[6]
    j_2 += 1;
    assertFalse(false); //[7]
    assertTrue(true); //[8]
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
4#assertTrue(3 < n)
5#assertTrue(true)
6#assertFalse(false)
7#assertFalse(false)
8#assertTrue(true)

*/
