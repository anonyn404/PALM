import java.util.*;
import java.util.List;

class PAIRS_SUM_TO_ZERO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean pairs_sum_to_zero(List<Integer> l){
    int i_1 = 0;
    assertTrue(0 < l.size(), "Path condition is violated: assertTrue(0 < l.size()) //[1]");
    int j_1 = 1;
    assertFalse(1 < l.size(), "Path condition is violated: assertFalse(1 < l.size()) //[2]");
    i_1 += 1;
    assertTrue(1 < l.size(), "Path condition is violated: assertTrue(1 < l.size()) //[3]");
    int j_2 = 2;
    assertTrue(2 < l.size(), "Path condition is violated: assertTrue(2 < l.size()) //[4]");
    assertTrue(l.get(1) + l.get(2) == 0, "Path condition is violated: assertTrue(l.get(1) + l.get(2) == 0) //[5]");
    return true;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static boolean pairs_sum_to_zero(List<Integer> l){
    int i_1 = 0;
    assertTrue(0 < l.size()); //[1]
    int j_1 = 1;
    assertFalse(1 < l.size()); //[2]
    i_1 += 1;
    assertTrue(1 < l.size()); //[3]
    int j_2 = 2;
    assertTrue(2 < l.size()); //[4]
    assertTrue(l.get(1) + l.get(2) == 0); //[5]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < l.size())
2#assertFalse(1 < l.size())
3#assertTrue(1 < l.size())
4#assertTrue(2 < l.size())
5#assertTrue(l.get(1) + l.get(2) == 0)

*/
