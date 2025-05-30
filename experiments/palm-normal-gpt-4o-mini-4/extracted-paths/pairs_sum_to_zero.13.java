import java.util.*;
import java.util.List;

class PAIRS_SUM_TO_ZERO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void pairs_sum_to_zero(List<Integer> l){
    int i_1 = 0;
    assertTrue(0 < l.size(), "Path condition is violated: assertTrue(0 < l.size()) //[1]");
    int j_1 = 1;
    assertTrue(1 < l.size(), "Path condition is violated: assertTrue(1 < l.size()) //[2]");
    assertFalse(l.get(0) + l.get(1) == 0, "Path condition is violated: assertFalse(l.get(0) + l.get(1) == 0) //[3]");
    j_1 += 1;
    assertFalse(2 < l.size(), "Path condition is violated: assertFalse(2 < l.size()) //[4]");
    i_1 += 1;
    assertTrue(1 < l.size(), "Path condition is violated: assertTrue(1 < l.size()) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void pairs_sum_to_zero(List<Integer> l){
    int i_1 = 0;
    assertTrue(0 < l.size()); //[1]
    int j_1 = 1;
    assertTrue(1 < l.size()); //[2]
    assertFalse(l.get(0) + l.get(1) == 0); //[3]
    j_1 += 1;
    assertFalse(2 < l.size()); //[4]
    i_1 += 1;
    assertTrue(1 < l.size()); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.size())
2#assertTrue(1 < l.size())
3#assertFalse(l.get(0) + l.get(1) == 0)
4#assertFalse(2 < l.size())
5#assertTrue(1 < l.size())

*/
