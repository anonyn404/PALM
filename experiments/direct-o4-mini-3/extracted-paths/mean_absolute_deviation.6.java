import java.util.*;
import java.util.List;

class MEAN_ABSOLUTE_DEVIATION {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static double mean_absolute_deviation(List<Double> numbers){
    double sum_1 = 0.;
    Iterator<Double> number_iter_1 = numbers.iterator();
    Double number_1;
    assertTrue(number_iter_1.hasNext(), "Path condition is violated: assertTrue(number_iter_1.hasNext()) //[1]");
    number_1 = number_iter_1.next();
    sum_1 += number_1;
    assertTrue(number_iter_1.hasNext(), "Path condition is violated: assertTrue(number_iter_1.hasNext()) //[2]");
    number_1 = number_iter_1.next();
    sum_1 += number_1;
    assertFalse(number_iter_1.hasNext(), "Path condition is violated: assertFalse(number_iter_1.hasNext()) //[3]");
    double mean_1 = sum_1 / numbers.size();
    double deviation_sum_1 = 0.;
    Iterator<Double> number_iter_2 = numbers.iterator();
    Double number_2;
    assertTrue(number_iter_2.hasNext(), "Path condition is violated: assertTrue(number_iter_2.hasNext()) //[4]");
    number_2 = number_iter_2.next();
    deviation_sum_1 += Math.abs(number_2 - mean_1);
    assertFalse(number_iter_2.hasNext(), "Path condition is violated: assertFalse(number_iter_2.hasNext()) //[5]");
    return deviation_sum_1 / numbers.size();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.List;
public static double mean_absolute_deviation(List<Double> numbers){
    double sum_1 = 0.;
    Iterator<Double> number_iter_1 = numbers.iterator();
    Double number_1;
    assertTrue(number_iter_1.hasNext()); //[1]
    number_1 = number_iter_1.next();
    sum_1 += number_1;
    assertTrue(number_iter_1.hasNext()); //[2]
    number_1 = number_iter_1.next();
    sum_1 += number_1;
    assertFalse(number_iter_1.hasNext()); //[3]
    double mean_1 = sum_1 / numbers.size();
    double deviation_sum_1 = 0.;
    Iterator<Double> number_iter_2 = numbers.iterator();
    Double number_2;
    assertTrue(number_iter_2.hasNext()); //[4]
    number_2 = number_iter_2.next();
    deviation_sum_1 += Math.abs(number_2 - mean_1);
    assertFalse(number_iter_2.hasNext()); //[5]
    return deviation_sum_1 / numbers.size();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((numbers.iterator()).hasNext())
2#assertTrue((numbers.iterator()).hasNext())
3#assertFalse((numbers.iterator()).hasNext())
4#assertTrue((numbers.iterator()).hasNext())
5#assertFalse((numbers.iterator()).hasNext())

*/
