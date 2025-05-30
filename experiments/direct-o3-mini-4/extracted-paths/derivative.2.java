import java.util.*;
import java.util.ArrayList;
import java.util.List;

class DERIVATIVE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> derivative(List<Integer> xs){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 1;
    assertTrue(1 < xs.size(), "Path condition is violated: assertTrue(1 < xs.size()) //[1]");
    result_1.add(1 * xs.get(1));
    i_1 += 1;
    assertTrue(2 < xs.size(), "Path condition is violated: assertTrue(2 < xs.size()) //[2]");
    result_1.add(2 * xs.get(2));
    i_1 += 1;
    assertFalse(3 < xs.size(), "Path condition is violated: assertFalse(3 < xs.size()) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<Integer> derivative(List<Integer> xs){
    List<Integer> result_1 = new ArrayList<Integer>();
    int i_1 = 1;
    assertTrue(1 < xs.size()); //[1]
    result_1.add(1 * xs.get(1));
    i_1 += 1;
    assertTrue(2 < xs.size()); //[2]
    result_1.add(2 * xs.get(2));
    i_1 += 1;
    assertFalse(3 < xs.size()); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1 < xs.size())
2#assertTrue(2 < xs.size())
3#assertFalse(3 < xs.size())

*/
