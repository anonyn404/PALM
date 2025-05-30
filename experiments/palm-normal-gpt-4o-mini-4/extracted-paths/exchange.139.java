import java.util.*;
import java.util.ArrayList;

class EXCHANGE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String exchange(ArrayList<Integer> lst1, ArrayList<Integer> lst2){
    int odd_1 = 0, even_1 = 0;
    Iterator<Integer> i_iter_1 = lst1.iterator();
    int i_1;
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[1]");
    i_1 = i_iter_1.next();
    assertTrue((i_1 % 2) == 1, "Path condition is violated: assertTrue((i_1 % 2) == 1) //[2]");
    odd_1++;
    assertTrue(i_iter_1.hasNext(), "Path condition is violated: assertTrue(i_iter_1.hasNext()) //[3]");
    i_1 = i_iter_1.next();
    assertTrue((i_1 % 2) == 1, "Path condition is violated: assertTrue((i_1 % 2) == 1) //[4]");
    odd_1++;
    assertFalse(i_iter_1.hasNext(), "Path condition is violated: assertFalse(i_iter_1.hasNext()) //[5]");
    Iterator<Integer> i_iter_2 = lst2.iterator();
    int i_2;
    assertTrue(i_iter_2.hasNext(), "Path condition is violated: assertTrue(i_iter_2.hasNext()) //[6]");
    i_2 = i_iter_2.next();
    assertTrue((i_2 % 2) == 0, "Path condition is violated: assertTrue((i_2 % 2) == 0) //[7]");
    even_1++;
    assertFalse(i_iter_2.hasNext(), "Path condition is violated: assertFalse(i_iter_2.hasNext()) //[8]");
    assertFalse(false, "Path condition is violated: assertFalse(false) //[9]");
    return "NO";
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
    assertTrue(i_iter_1.hasNext()); //[1]
    i_1 = i_iter_1.next();
    assertTrue((i_1 % 2) == 1); //[2]
    odd_1++;
    assertTrue(i_iter_1.hasNext()); //[3]
    i_1 = i_iter_1.next();
    assertTrue((i_1 % 2) == 1); //[4]
    odd_1++;
    assertFalse(i_iter_1.hasNext()); //[5]
    Iterator<Integer> i_iter_2 = lst2.iterator();
    int i_2;
    assertTrue(i_iter_2.hasNext()); //[6]
    i_2 = i_iter_2.next();
    assertTrue((i_2 % 2) == 0); //[7]
    even_1++;
    assertFalse(i_iter_2.hasNext()); //[8]
    assertFalse(false); //[9]
    return "NO";
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((lst1.iterator()).hasNext())
2#assertTrue((i_iter_1.next() % 2) == 1)
3#assertTrue((lst1.iterator()).hasNext())
4#assertTrue((i_iter_1.next() % 2) == 1)
5#assertFalse((lst1.iterator()).hasNext())
6#assertTrue((lst2.iterator()).hasNext())
7#assertTrue((i_iter_2.next() % 2) == 0)
8#assertFalse((lst2.iterator()).hasNext())
9#assertFalse(false)

*/
