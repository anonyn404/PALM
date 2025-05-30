import java.util.*;
import java.util.ArrayList;

class SOLUTION {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int solution(ArrayList<Integer> lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.size(), "Path condition is violated: assertTrue(0 < lst.size()) //[1]");
    assertTrue(true && (lst.get(0) % 2) == 1, "Path condition is violated: assertTrue(true && (lst.get(0) % 2) == 1) //[2]");
    result_1 += lst.get(0);
    i_1++;
    assertTrue(1 < lst.size(), "Path condition is violated: assertTrue(1 < lst.size()) //[3]");
    assertTrue(false && (lst.get(1) % 2) == 1, "Path condition is violated: assertTrue(false && (lst.get(1) % 2) == 1) //[4]");
    result_1 += lst.get(1);
    i_1++;
    assertFalse(2 < lst.size(), "Path condition is violated: assertFalse(2 < lst.size()) //[5]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static int solution(ArrayList<Integer> lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.size()); //[1]
    assertTrue(true && (lst.get(0) % 2) == 1); //[2]
    result_1 += lst.get(0);
    i_1++;
    assertTrue(1 < lst.size()); //[3]
    assertTrue(false && (lst.get(1) % 2) == 1); //[4]
    result_1 += lst.get(1);
    i_1++;
    assertFalse(2 < lst.size()); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.size())
2#assertTrue(true && (lst.get(0) % 2) == 1)
3#assertTrue(1 < lst.size())
4#assertTrue(false && (lst.get(1) % 2) == 1)
5#assertFalse(2 < lst.size())

*/
