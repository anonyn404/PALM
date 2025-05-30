import java.util.*;

class COMPARE_ONE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void compare_one(Object a, Object b){
    double temp_a_1 = 0, temp_b_1 = 0;
    assertTrue(a instanceof String, "Path condition is violated: assertTrue(a instanceof String) //[1]");
    String temp_a_string_1 = a.toString();
    temp_a_string_1 = temp_a_string_1.replace(',', '.');
    temp_a_1 = Double.parseDouble(temp_a_string_1);
    assertTrue(b instanceof String, "Path condition is violated: assertTrue(b instanceof String) //[2]");
    String temp_b_string_1 = b.toString();
    temp_b_string_1 = temp_b_string_1.replace(',', '.');
    temp_b_1 = Double.parseDouble(temp_b_string_1);
    assertFalse(a instanceof Double, "Path condition is violated: assertFalse(a instanceof Double) //[3]");
    assertTrue(b instanceof Double, "Path condition is violated: assertTrue(b instanceof Double) //[4]");
    temp_b_1 = (Double) b;
    assertTrue(a instanceof Integer, "Path condition is violated: assertTrue(a instanceof Integer) //[5]");
    temp_a_1 = ((Integer) a).doubleValue();
    assertTrue(b instanceof Integer, "Path condition is violated: assertTrue(b instanceof Integer) //[6]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void compare_one(Object a, Object b){
    double temp_a_1 = 0, temp_b_1 = 0;
    assertTrue(a instanceof String); //[1]
    String temp_a_string_1 = a.toString();
    temp_a_string_1 = temp_a_string_1.replace(',', '.');
    temp_a_1 = Double.parseDouble(temp_a_string_1);
    assertTrue(b instanceof String); //[2]
    String temp_b_string_1 = b.toString();
    temp_b_string_1 = temp_b_string_1.replace(',', '.');
    temp_b_1 = Double.parseDouble(temp_b_string_1);
    assertFalse(a instanceof Double); //[3]
    assertTrue(b instanceof Double); //[4]
    temp_b_1 = (Double) b;
    assertTrue(a instanceof Integer); //[5]
    temp_a_1 = ((Integer) a).doubleValue();
    assertTrue(b instanceof Integer); //[6]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(a instanceof String)
2#assertTrue(b instanceof String)
3#assertFalse(a instanceof Double)
4#assertTrue(b instanceof Double)
5#assertTrue(a instanceof Integer)
6#assertTrue(b instanceof Integer)

*/
