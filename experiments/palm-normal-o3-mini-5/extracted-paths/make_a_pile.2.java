import java.util.*;
import java.util.ArrayList;

class MAKE_A_PILE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void make_a_pile(int n){
    ArrayList<Integer> pile_1 = new ArrayList<Integer>();
    int i_1 = 0;
    assertTrue(0 < n, "Path condition is violated: assertTrue(0 < n) //[1]");
    pile_1.add(n + 0);
    i_1++;
    assertTrue(1 < n, "Path condition is violated: assertTrue(1 < n) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void make_a_pile(int n){
    ArrayList<Integer> pile_1 = new ArrayList<Integer>();
    int i_1 = 0;
    assertTrue(0 < n); //[1]
    pile_1.add(n + 0);
    i_1++;
    assertTrue(1 < n); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < n)
2#assertTrue(1 < n)

*/
