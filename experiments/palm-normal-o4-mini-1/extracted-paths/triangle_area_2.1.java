import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class TRIANGLE_AREA_2 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double triangle_area_2(double a, double b, double c){
    assertFalse(a + b <= c || a + c <= b || b + c <= a, "Path condition is violated: assertFalse(a + b <= c || a + c <= b || b + c <= a) //[1]");
    double s_1 = (a + b + c) / 2.;
    double result_1 = Math.pow(s_1 * (s_1 - a) * (s_1 - b) * (s_1 - c), 0.5);
    BigDecimal bd_1 = BigDecimal.valueOf(result_1);
    bd_1 = bd_1.setScale(2, RoundingMode.HALF_UP);
    return bd_1.doubleValue();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public static double triangle_area_2(double a, double b, double c){
    assertFalse(a + b <= c || a + c <= b || b + c <= a); //[1]
    double s_1 = (a + b + c) / 2.;
    double result_1 = Math.pow(s_1 * (s_1 - a) * (s_1 - b) * (s_1 - c), 0.5);
    BigDecimal bd_1 = BigDecimal.valueOf(result_1);
    bd_1 = bd_1.setScale(2, RoundingMode.HALF_UP);
    return bd_1.doubleValue();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(a + b <= c || a + c <= b || b + c <= a)

*/
