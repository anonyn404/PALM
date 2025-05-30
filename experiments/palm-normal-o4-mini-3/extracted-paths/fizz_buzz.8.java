import java.util.*;

class FIZZ_BUZZ {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int fizz_buzz(int n){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < n, "Path condition is violated: assertTrue(0 < n) //[1]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[2]");
    int j_1 = 0;
    assertFalse(0 < (0 + "").length(), "Path condition is violated: assertFalse(0 < (0 + \"\").length()) //[3]");
    i_1 += 1;
    assertFalse(1 < n, "Path condition is violated: assertFalse(1 < n) //[4]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int fizz_buzz(int n){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < n); //[1]
    assertTrue(true); //[2]
    int j_1 = 0;
    assertFalse(0 < (0 + "").length()); //[3]
    i_1 += 1;
    assertFalse(1 < n); //[4]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < n)
2#assertTrue(true)
3#assertFalse(0 < (0 + "").length())
4#assertFalse(1 < n)

*/
