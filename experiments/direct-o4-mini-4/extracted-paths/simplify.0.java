import java.util.*;

class SIMPLIFY {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean simplify(String x, String n){
    int a_1 = Integer.parseInt(x.split("/")[0]);
    int b_1 = Integer.parseInt(x.split("/")[1]);
    int c_1 = Integer.parseInt(n.split("/")[0]);
    int d_1 = Integer.parseInt(n.split("/")[1]);
    int numerator_1 = a_1 * c_1;
    int denom_1 = b_1 * d_1;
    assertTrue(1.0 * numerator_1 / denom_1 == (int) (numerator_1 / denom_1), "Path condition is violated: assertTrue(1.0 * numerator_1 / denom_1 == (int) (numerator_1 / denom_1)) //[1]");
    return true;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static boolean simplify(String x, String n){
    int a_1 = Integer.parseInt(x.split("/")[0]);
    int b_1 = Integer.parseInt(x.split("/")[1]);
    int c_1 = Integer.parseInt(n.split("/")[0]);
    int d_1 = Integer.parseInt(n.split("/")[1]);
    int numerator_1 = a_1 * c_1;
    int denom_1 = b_1 * d_1;
    assertTrue(1.0 * numerator_1 / denom_1 == (int) (numerator_1 / denom_1)); //[1]
    return true;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(1.0 * Integer.parseInt(x.split("/")[0]) * Integer.parseInt(n.split("/")[0]) / Integer.parseInt(x.split("/")[1]) * Integer.parseInt(n.split("/")[1]) == (int) (Integer.parseInt(x.split("/")[0]) * Integer.parseInt(n.split("/")[0]) / Integer.parseInt(x.split("/")[1]) * Integer.parseInt(n.split("/")[1])))

*/
