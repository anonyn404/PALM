import java.util.*;
import java.util.ArrayList;
import java.util.List;

class GET_POSITIVE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void get_positive(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> number_iter_1 = numbers.iterator();
    Integer number_1;
    assertTrue(number_iter_1.hasNext(), "Path condition is violated: assertTrue(number_iter_1.hasNext()) //[1]");
    number_1 = number_iter_1.next();
    assertTrue(number_1 > 0, "Path condition is violated: assertTrue(number_1 > 0) //[2]");
    result_1.add(number_1);
    assertTrue(number_iter_1.hasNext(), "Path condition is violated: assertTrue(number_iter_1.hasNext()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static void get_positive(List<Integer> numbers){
    List<Integer> result_1 = new ArrayList<Integer>();
    Iterator<Integer> number_iter_1 = numbers.iterator();
    Integer number_1;
    assertTrue(number_iter_1.hasNext()); //[1]
    number_1 = number_iter_1.next();
    assertTrue(number_1 > 0); //[2]
    result_1.add(number_1);
    assertTrue(number_iter_1.hasNext()); //[3]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertTrue(number_iter_1.next() > 0)
3#assertTrue((numbers.iterator()).hasNext())

*/
