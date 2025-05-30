import java.util.*;
import java.util.List;

class BELOW_ZERO {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void below_zero(List<Integer> operations){
    int balance_1 = 0;
    Iterator<Integer> op_iter_1 = operations.iterator();
    Integer op_1;
    assertTrue(op_iter_1.hasNext(), "Path condition is violated: assertTrue(op_iter_1.hasNext()) //[1]");
    op_1 = op_iter_1.next();
    balance_1 += op_1;
    assertFalse(balance_1 < 0, "Path condition is violated: assertFalse(balance_1 < 0) //[2]");
    assertTrue(op_iter_1.hasNext(), "Path condition is violated: assertTrue(op_iter_1.hasNext()) //[3]");
    op_1 = op_iter_1.next();
    balance_1 += op_1;
    assertFalse(balance_1 < 0, "Path condition is violated: assertFalse(balance_1 < 0) //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void below_zero(List<Integer> operations){
    int balance_1 = 0;
    Iterator<Integer> op_iter_1 = operations.iterator();
    Integer op_1;
    assertTrue(op_iter_1.hasNext()); //[1]
    op_1 = op_iter_1.next();
    balance_1 += op_1;
    assertFalse(balance_1 < 0); //[2]
    assertTrue(op_iter_1.hasNext()); //[3]
    op_1 = op_iter_1.next();
    balance_1 += op_1;
    assertFalse(balance_1 < 0); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((operations.iterator()).hasNext())
2#assertFalse(0 + op_1 < 0)
3#assertTrue((operations.iterator()).hasNext())
4#assertFalse((0 + op_1) + op_1 < 0)

*/
