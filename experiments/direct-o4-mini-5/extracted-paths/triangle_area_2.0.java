import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class TRIANGLE_AREA_2 {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double triangle_area_2(double a, double b, double c){
    assertTrue(a + b <= c || a + c <= b || b + c <= a, "Path condition is violated: assertTrue(a + b <= c || a + c <= b || b + c <= a) //[1]");
    return -1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public static double triangle_area_2(double a, double b, double c){
    assertTrue(a + b <= c || a + c <= b || b + c <= a); //[1]
    return -1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(a + b <= c || a + c <= b || b + c <= a)

*/
