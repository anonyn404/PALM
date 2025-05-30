import java.util.*;

class EAT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] eat(int number, int need, int remaining){
    assertTrue(need <= remaining, "Path condition is violated: assertTrue(need <= remaining) //[1]");
    return new int[] { number + need, remaining - need };
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] eat(int number, int need, int remaining){
    assertTrue(need <= remaining); //[1]
    return new int[] { number + need, remaining - need };
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(need <= remaining)

*/
