import java.util.*;

class CHANGE_BASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String change_base(int x, int base){
    String result_1 = "";
    assertFalse(x > 0, "Path condition is violated: assertFalse(x > 0) //[1]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String change_base(int x, int base){
    String result_1 = "";
    assertFalse(x > 0); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(x > 0)

*/
