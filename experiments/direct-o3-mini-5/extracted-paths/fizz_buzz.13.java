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
    assertTrue(0 < (0 + "").length(), "Path condition is violated: assertTrue(0 < (0 + \"\").length()) //[3]");
    assertFalse((0 + "").substring(0, 1).equals("7"), "Path condition is violated: assertFalse((0 + \"\").substring(0, 1).equals(\"7\")) //[4]");
    j_1 += 1;
    assertTrue(1 < (0 + "").length(), "Path condition is violated: assertTrue(1 < (0 + \"\").length()) //[5]");
    assertTrue((0 + "").substring(1, 2).equals("7"), "Path condition is violated: assertTrue((0 + \"\").substring(1, 2).equals(\"7\")) //[6]");
    result_1 += 1;
    j_1 += 1;
    assertFalse(2 < (0 + "").length(), "Path condition is violated: assertFalse(2 < (0 + \"\").length()) //[7]");
    i_1 += 1;
    assertTrue(1 < n, "Path condition is violated: assertTrue(1 < n) //[8]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[9]");
    i_1 += 1;
    assertFalse(2 < n, "Path condition is violated: assertFalse(2 < n) //[10]");
    return 1;
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
    assertTrue(0 < (0 + "").length()); //[3]
    assertFalse((0 + "").substring(0, 1).equals("7")); //[4]
    j_1 += 1;
    assertTrue(1 < (0 + "").length()); //[5]
    assertTrue((0 + "").substring(1, 2).equals("7")); //[6]
    result_1 += 1;
    j_1 += 1;
    assertFalse(2 < (0 + "").length()); //[7]
    i_1 += 1;
    assertTrue(1 < n); //[8]
    assertFalse(false); //[9]
    i_1 += 1;
    assertFalse(2 < n); //[10]
    return 1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < n)
2#assertTrue(true)
3#assertTrue(0 < (0 + "").length())
4#assertFalse((0 + "").substring(0, 1).equals("7"))
5#assertTrue(1 < (0 + "").length())
6#assertTrue((0 + "").substring(1, 2).equals("7"))
7#assertFalse(2 < (0 + "").length())
8#assertTrue(1 < n)
9#assertFalse(false)
10#assertFalse(2 < n)

*/
