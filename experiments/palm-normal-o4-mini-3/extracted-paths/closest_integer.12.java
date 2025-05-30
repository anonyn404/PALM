import java.util.*;

class CLOSEST_INTEGER {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void closest_integer(String value){
    assertTrue(value.indexOf('.') >= 0, "Path condition is violated: assertTrue(value.indexOf('.') >= 0) //[1]");
    assertTrue(value.charAt(value.length() - 1) == '0', "Path condition is violated: assertTrue(value.charAt(value.length() - 1) == '0') //[2]");
    value = value.substring(0, value.length() - 1);
    assertTrue(value.charAt(value.length() - 1) == '0', "Path condition is violated: assertTrue(value.charAt(value.length() - 1) == '0') //[3]");
    value = value.substring(0, value.length() - 1);
    assertFalse(value.charAt(value.length() - 1) == '0', "Path condition is violated: assertFalse(value.charAt(value.length() - 1) == '0') //[4]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void closest_integer(String value){
    assertTrue(value.indexOf('.') >= 0); //[1]
    assertTrue(value.charAt(value.length() - 1) == '0'); //[2]
    value = value.substring(0, value.length() - 1);
    assertTrue(value.charAt(value.length() - 1) == '0'); //[3]
    value = value.substring(0, value.length() - 1);
    assertFalse(value.charAt(value.length() - 1) == '0'); //[4]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(value.indexOf('.') >= 0)
2#assertTrue(value.charAt(value.length() - 1) == '0')
3#assertTrue((value.substring(0, value.length() - 1)).charAt((value.substring(0, value.length() - 1)).length() - 1) == '0')
4#assertFalse((value.substring(0, value.length() - 1)).charAt((value.substring(0, value.length() - 1)).length() - 1) == '0')

*/
