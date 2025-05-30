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
    assertTrue(2 < l.size(), "Path condition is violated: assertTrue(2 < l.size()) //[4]");
    assertFalse(l.get(0) + l.get(2) == 0, "Path condition is violated: assertFalse(l.get(0) + l.get(2) == 0) //[5]");
    j_1 += 1;
    assertFalse(3 < l.size(), "Path condition is violated: assertFalse(3 < l.size()) //[6]");
    i_1 += 1;
    assertTrue(1 < l.size(), "Path condition is violated: assertTrue(1 < l.size()) //[7]");
    int j_2 = 2;
    assertTrue(2 < l.size(), "Path condition is violated: assertTrue(2 < l.size()) //[8]");
    assertFalse(l.get(1) + l.get(2) == 0, "Path condition is violated: assertFalse(l.get(1) + l.get(2) == 0) //[9]");
    j_2 += 1;
    assertTrue(3 < l.size(), "Path condition is violated: assertTrue(3 < l.size()) //[10]");
    assertFalse(l.get(1) + l.get(3) == 0, "Path condition is violated: assertFalse(l.get(1) + l.get(3) == 0) //[11]");
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
    assertTrue(2 < l.size()); //[4]
    assertFalse(l.get(0) + l.get(2) == 0); //[5]
    j_1 += 1;
    assertFalse(3 < l.size()); //[6]
    i_1 += 1;
    assertTrue(1 < l.size()); //[7]
    int j_2 = 2;
    assertTrue(2 < l.size()); //[8]
    assertFalse(l.get(1) + l.get(2) == 0); //[9]
    j_2 += 1;
    assertTrue(3 < l.size()); //[10]
    assertFalse(l.get(1) + l.get(3) == 0); //[11]
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
4#assertTrue(2 < l.size())
5#assertFalse(l.get(0) + l.get(2) == 0)
6#assertFalse(3 < l.size())
7#assertTrue(1 < l.size())
8#assertTrue(2 < l.size())
9#assertFalse(l.get(1) + l.get(2) == 0)
10#assertTrue(3 < l.size())
11#assertFalse(l.get(1) + l.get(3) == 0)

*/
