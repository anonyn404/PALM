import java.util.*;
import java.util.ArrayList;

class EXCHANGE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String exchange(ArrayList<Integer> lst1, ArrayList<Integer> lst2){
    int odd_1 = 0, even_1 = 0;
    Iterator<Integer> i_iter_1 = lst1.iterator();
    int i_1;
    assertFalse(i_iter_1.hasNext(), "Path condition is violated: assertFalse(i_iter_1.hasNext()) //[1]");
    Iterator<Integer> i_iter_2 = lst2.iterator();
    int i_2;
    assertFalse(i_iter_2.hasNext(), "Path condition is violated: assertFalse(i_iter_2.hasNext()) //[2]");
    assertTrue(true, "Path condition is violated: assertTrue(true) //[3]");
    return "YES";
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static String exchange(ArrayList<Integer> lst1, ArrayList<Integer> lst2){
    int odd_1 = 0, even_1 = 0;
    Iterator<Integer> i_iter_1 = lst1.iterator();
    int i_1;
    assertFalse(i_iter_1.hasNext()); //[1]
    Iterator<Integer> i_iter_2 = lst2.iterator();
    int i_2;
    assertFalse(i_iter_2.hasNext()); //[2]
    assertTrue(true); //[3]
    return "YES";
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((lst1.iterator()).hasNext())
2#assertFalse((lst2.iterator()).hasNext())
3#assertTrue(true)

*/
