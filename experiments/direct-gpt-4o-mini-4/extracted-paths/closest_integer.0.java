import java.util.*;

class CLOSEST_INTEGER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int closest_integer(String value){
    assertFalse(value.indexOf('.') >= 0, "Path condition is violated: assertFalse(value.indexOf('.') >= 0) //[1]");
    double num_1 = Double.parseDouble(value);
    int result_1 = 0;
    assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5"), "Path condition is violated: assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(\".5\")) //[2]");
    assertFalse(value.length() > 0, "Path condition is violated: assertFalse(value.length() > 0) //[3]");
    return 0;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int closest_integer(String value){
    assertFalse(value.indexOf('.') >= 0); //[1]
    double num_1 = Double.parseDouble(value);
    int result_1 = 0;
    assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5")); //[2]
    assertFalse(value.length() > 0); //[3]
    return 0;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(value.indexOf('.') >= 0)
2#assertFalse(value.length() >= 2 && value.substring(value.length() - 2).equals(".5"))
3#assertFalse(value.length() > 0)

*/
