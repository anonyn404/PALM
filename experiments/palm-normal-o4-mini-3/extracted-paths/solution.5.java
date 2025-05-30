import java.util.*;
import java.util.ArrayList;

class SOLUTION {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int solution(ArrayList<Integer> lst){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < lst.size(), "Path condition is violated: assertTrue(0 < lst.size()) //[1]");
    assertFalse(true && (lst.get(0) % 2) == 1, "Path condition is violated: assertFalse(true && (lst.get(0) % 2) == 1) //[2]");
    i_1++;
    assertFalse(1 < lst.size(), "Path condition is violated: assertFalse(1 < lst.size()) //[3]");
    return 0;
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
    assertFalse(true && (lst.get(0) % 2) == 1); //[2]
    i_1++;
    assertFalse(1 < lst.size()); //[3]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < lst.size())
2#assertFalse(true && (lst.get(0) % 2) == 1)
3#assertFalse(1 < lst.size())

*/
