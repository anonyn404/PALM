import java.util.*;

class CHOOSE_NUM {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int choose_num(int x, int y){
    assertFalse(x > y, "Path condition is violated: assertFalse(x > y) //[1]");
    assertFalse((y % 2) == 0, "Path condition is violated: assertFalse((y % 2) == 0) //[2]");
    assertFalse(x == y, "Path condition is violated: assertFalse(x == y) //[3]");
    return y - 1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int choose_num(int x, int y){
    assertFalse(x > y); //[1]
    assertFalse((y % 2) == 0); //[2]
    assertFalse(x == y); //[3]
    return y - 1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(x > y)
2#assertFalse((y % 2) == 0)
3#assertFalse(x == y)

*/
