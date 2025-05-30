import java.util.*;

class COMPARE_ONE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static Object compare_one(Object a, Object b){
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
    assertFalse(b instanceof Double, "Path condition is violated: assertFalse(b instanceof Double) //[4]");
    assertFalse(a instanceof Integer, "Path condition is violated: assertFalse(a instanceof Integer) //[5]");
    assertTrue(b instanceof Integer, "Path condition is violated: assertTrue(b instanceof Integer) //[6]");
    temp_b_1 = ((Integer) b).doubleValue();
    assertFalse(temp_a_1 == temp_b_1, "Path condition is violated: assertFalse(temp_a_1 == temp_b_1) //[7]");
    assertTrue(temp_a_1 > temp_b_1, "Path condition is violated: assertTrue(temp_a_1 > temp_b_1) //[8]");
    return a;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static Object compare_one(Object a, Object b){
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
    assertFalse(b instanceof Double); //[4]
    assertFalse(a instanceof Integer); //[5]
    assertTrue(b instanceof Integer); //[6]
    temp_b_1 = ((Integer) b).doubleValue();
    assertFalse(temp_a_1 == temp_b_1); //[7]
    assertTrue(temp_a_1 > temp_b_1); //[8]
    return a;
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
4#assertFalse(b instanceof Double)
5#assertFalse(a instanceof Integer)
6#assertTrue(b instanceof Integer)
7#assertFalse(Double.parseDouble(temp_a_string_1) == ((Integer) b).doubleValue())
8#assertTrue(Double.parseDouble(temp_a_string_1) > ((Integer) b).doubleValue())

*/
