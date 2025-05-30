import java.util.*;
import java.util.List;

class MEAN_ABSOLUTE_DEVIATION {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void mean_absolute_deviation(List<Double> numbers){
    double sum_1 = 0.;
    Iterator<Double> number_iter_1 = numbers.iterator();
    Double number_1;
    assertFalse(number_iter_1.hasNext(), "Path condition is violated: assertFalse(number_iter_1.hasNext()) //[1]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static void mean_absolute_deviation(List<Double> numbers){
    double sum_1 = 0.;
    Iterator<Double> number_iter_1 = numbers.iterator();
    Double number_1;
    assertFalse(number_iter_1.hasNext()); //[1]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((numbers.iterator()).hasNext())

*/
