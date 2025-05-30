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
    assertTrue(2 < n, "Path condition is violated: assertTrue(2 < n) //[1]");
    assertFalse(n % 2 == 0 && is_prime(2), "Path condition is violated: assertFalse(n % 2 == 0 && is_prime(2)) //[2]");
    j_1 += 1;
    assertTrue(3 < n, "Path condition is violated: assertTrue(3 < n) //[3]");
    assertTrue(n % 3 == 0 && is_prime(3), "Path condition is violated: assertTrue(n % 3 == 0 && is_prime(3)) //[4]");
    largest_1 = 3;
    j_1 += 1;
    assertFalse(4 < n, "Path condition is violated: assertFalse(4 < n) //[5]");
    return 3;
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
    assertTrue(2 < n); //[1]
    assertFalse(n % 2 == 0 && is_prime(2)); //[2]
    j_1 += 1;
    assertTrue(3 < n); //[3]
    assertTrue(n % 3 == 0 && is_prime(3)); //[4]
    largest_1 = 3;
    j_1 += 1;
    assertFalse(4 < n); //[5]
    return 3;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(2 < n)
2#assertFalse(n % 2 == 0 && is_prime(2))
3#assertTrue(3 < n)
4#assertTrue(n % 3 == 0 && is_prime(3))
5#assertFalse(4 < n)

*/
