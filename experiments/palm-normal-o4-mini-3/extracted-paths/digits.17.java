import java.util.*;

class DIGITS {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void digits(int n){
    int product_1 = 1;
    int odd_count_1 = 0;
    assertTrue(n > 0, "Path condition is violated: assertTrue(n > 0) //[1]");
    int digit_1 = n % 10;
    assertTrue(digit_1 % 2 == 1, "Path condition is violated: assertTrue(digit_1 % 2 == 1) //[2]");
    product_1 *= digit_1;
    odd_count_1++;
    n /= 10;
    assertTrue(n > 0, "Path condition is violated: assertTrue(n > 0) //[3]");
    int digit_2 = n % 10;
    assertFalse(digit_2 % 2 == 1, "Path condition is violated: assertFalse(digit_2 % 2 == 1) //[4]");
    n /= 10;
    assertFalse(n > 0, "Path condition is violated: assertFalse(n > 0) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void digits(int n){
    int product_1 = 1;
    int odd_count_1 = 0;
    assertTrue(n > 0); //[1]
    int digit_1 = n % 10;
    assertTrue(digit_1 % 2 == 1); //[2]
    product_1 *= digit_1;
    odd_count_1++;
    n /= 10;
    assertTrue(n > 0); //[3]
    int digit_2 = n % 10;
    assertFalse(digit_2 % 2 == 1); //[4]
    n /= 10;
    assertFalse(n > 0); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(n > 0)
2#assertTrue(n % 10 % 2 == 1)
3#assertTrue(n / 10 > 0)
4#assertFalse(n / 10 % 10 % 2 == 1)
5#assertFalse((n / 10) / 10 > 0)

*/
