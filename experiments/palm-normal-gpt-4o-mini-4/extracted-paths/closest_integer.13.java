import java.util.*;

class CLOSEST_INTEGER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int closest_integer(String value){
    assertTrue(value.indexOf('.') >= 0, "Path condition is violated: assertTrue(value.indexOf('.') >= 0) //[1]");
    assertFalse(value.charAt(value.length() - 1) == '0', "Path condition is violated: assertFalse(value.charAt(value.length() - 1) == '0') //[2]");
    double num_1 = Double.parseDouble(value);
    int result_1 = 0;
    assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5"), "Path condition is violated: assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(\".5\")) //[3]");
    assertTrue(value.length() > 0, "Path condition is violated: assertTrue(value.length() > 0) //[4]");
    result_1 = (int) Math.round(num_1);
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int closest_integer(String value){
    assertTrue(value.indexOf('.') >= 0); //[1]
    assertFalse(value.charAt(value.length() - 1) == '0'); //[2]
    double num_1 = Double.parseDouble(value);
    int result_1 = 0;
    assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5")); //[3]
    assertTrue(value.length() > 0); //[4]
    result_1 = (int) Math.round(num_1);
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(value.indexOf('.') >= 0)
2#assertFalse(value.charAt(value.length() - 1) == '0')
3#assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5"))
4#assertTrue(value.length() > 0)

*/
