import java.util.*;

class LARGEST_PRIME_FACTOR {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    for (int i = 2; i < k; i += 1) {
        if (k % i == 0)
            return false;
    }
    return true;
}
public static int largest_prime_factor(int n){
    int largest_1 = 1;
    int j_1 = 2;
    assertFalse(2 < n, "Path condition is violated: assertFalse(2 < n) //[1]");
    return 1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    for (int i = 2; i < k; i += 1) {
        if (k % i == 0)
            return false;
    }
    return true;
}
public static int largest_prime_factor(int n){
    int largest_1 = 1;
    int j_1 = 2;
    assertFalse(2 < n); //[1]
    return 1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(2 < n)

*/
