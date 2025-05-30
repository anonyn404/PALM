import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class ISCUDE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean iscude(int a){
    a = Math.abs(a);
    double root_1 = Math.pow(a, 1. / 3);
    BigDecimal bd_1 = BigDecimal.valueOf(root_1);
    int round_root_1 = (int) bd_1.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(round_root_1, 3)) == a;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public static boolean iscude(int a){
    a = Math.abs(a);
    double root_1 = Math.pow(a, 1. / 3);
    BigDecimal bd_1 = BigDecimal.valueOf(root_1);
    int round_root_1 = (int) bd_1.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(round_root_1, 3)) == a;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*

*/
