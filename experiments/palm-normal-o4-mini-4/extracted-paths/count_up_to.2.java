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
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(2 < n)
2#assertFalse(false)

*/
