import java.util.*;

class EAT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] eat(int number, int need, int remaining){
    assertFalse(need <= remaining, "Path condition is violated: assertFalse(need <= remaining) //[1]");
    return new int[] { number + remaining, 0 };
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] eat(int number, int need, int remaining){
    assertFalse(need <= remaining); //[1]
    return new int[] { number + remaining, 0 };
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(need <= remaining)

*/
