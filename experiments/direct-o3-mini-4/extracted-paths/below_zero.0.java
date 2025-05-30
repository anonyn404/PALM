import java.util.*;
import java.util.List;

class BELOW_ZERO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean below_zero(List<Integer> operations){
    int balance_1 = 0;
    Iterator<Integer> op_iter_1 = operations.iterator();
    Integer op_1;
    assertFalse(op_iter_1.hasNext(), "Path condition is violated: assertFalse(op_iter_1.hasNext()) //[1]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static boolean below_zero(List<Integer> operations){
    int balance_1 = 0;
    Iterator<Integer> op_iter_1 = operations.iterator();
    Integer op_1;
    assertFalse(op_iter_1.hasNext()); //[1]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((operations.iterator()).hasNext())

*/
