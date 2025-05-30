import java.util.*;

class GREATEST_COMMON_DIVISOR {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int greatest_common_divisor(int a, int b){
    assertTrue(b > 0, "Path condition is violated: assertTrue(b > 0) //[1]");
    int tmp_1 = a;
    a = b;
    b = tmp_1 % b;
    assertTrue(b > 0, "Path condition is violated: assertTrue(b > 0) //[2]");
    int tmp_2 = a;
    a = b;
    b = tmp_2 % b;
    assertFalse(b > 0, "Path condition is violated: assertFalse(b > 0) //[3]");
    return a;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int greatest_common_divisor(int a, int b){
    assertTrue(b > 0); //[1]
    int tmp_1 = a;
    a = b;
    b = tmp_1 % b;
    assertTrue(b > 0); //[2]
    int tmp_2 = a;
    a = b;
    b = tmp_2 % b;
    assertFalse(b > 0); //[3]
    return a;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(b > 0)
2#assertTrue(tmp_1 % b > 0)
3#assertFalse(tmp_2 % b > 0)

*/
