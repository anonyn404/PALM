import java.util.*;
import java.util.ArrayList;

class PRIME_FIB {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int i = 2; i < (int) Math.sqrt(n) + 1; i += 1) {
        if (n % i == 0)
            return false;
    }
    return true;
}
public static int prime_fib(int n){
    ArrayList<Integer> fib_1 = new ArrayList<Integer>();
    fib_1.add(0);
    fib_1.add(1);
    assertTrue(true, "Path condition is violated: assertTrue(true) //[1]");
    int len_1 = fib_1.size();
    fib_1.add(fib_1.get(len_1 - 1) + fib_1.get(len_1 - 2));
    assertFalse(is_prime(fib_1.get(fib_1.size() - 1)), "Path condition is violated: assertFalse(is_prime(fib_1.get(fib_1.size() - 1))) //[2]");
    assertTrue(n == 0, "Path condition is violated: assertTrue(n == 0) //[3]");
    return fib_1.get(fib_1.size() - 1);
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int i = 2; i < (int) Math.sqrt(n) + 1; i += 1) {
        if (n % i == 0)
            return false;
    }
    return true;
}
public static int prime_fib(int n){
    ArrayList<Integer> fib_1 = new ArrayList<Integer>();
    fib_1.add(0);
    fib_1.add(1);
    assertTrue(true); //[1]
    int len_1 = fib_1.size();
    fib_1.add(fib_1.get(len_1 - 1) + fib_1.get(len_1 - 2));
    assertFalse(is_prime(fib_1.get(fib_1.size() - 1))); //[2]
    assertTrue(n == 0); //[3]
    return fib_1.get(fib_1.size() - 1);
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(true)
2#assertFalse(is_prime((new ArrayList<Integer>()).get((new ArrayList<Integer>()).size() - 1)))
3#assertTrue(n == 0)

*/
