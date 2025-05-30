import java.util.*;
import java.util.*;

class COMMON {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertTrue(0 < l1.length, "Path condition is violated: assertTrue(0 < l1.length) //[1]");
    int j_1 = 0;
    assertTrue(0 < l2.length, "Path condition is violated: assertTrue(0 < l2.length) //[2]");
    assertFalse(l1[0] == l2[0], "Path condition is violated: assertFalse(l1[0] == l2[0]) //[3]");
    j_1 += 1;
    assertTrue(1 < l2.length, "Path condition is violated: assertTrue(1 < l2.length) //[4]");
    assertTrue(l1[0] == l2[1], "Path condition is violated: assertTrue(l1[0] == l2[1]) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.*;
public static void common(int[] l1, int[] l2){
    HashSet<Integer> common_1 = new HashSet<Integer>();
    int i_1 = 0;
    assertTrue(0 < l1.length); //[1]
    int j_1 = 0;
    assertTrue(0 < l2.length); //[2]
    assertFalse(l1[0] == l2[0]); //[3]
    j_1 += 1;
    assertTrue(1 < l2.length); //[4]
    assertTrue(l1[0] == l2[1]); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l1.length)
2#assertTrue(0 < l2.length)
3#assertFalse(l1[0] == l2[0])
4#assertTrue(1 < l2.length)
5#assertTrue(l1[0] == l2[1])

*/
