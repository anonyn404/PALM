import java.util.*;

class INT_TO_MINI_ROMAN {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static String int_to_mini_roman(int number){
    int[] num_1 = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    String[] sym_1 = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int i_1 = 12;
    String result_1 = "";
    assertTrue(number > 0, "Path condition is violated: assertTrue(number > 0) //[1]");
    int div_1 = (int) (number / num_1[12]);
    assertFalse(div_1 > 0, "Path condition is violated: assertFalse(div_1 > 0) //[2]");
    number %= num_1[12];
    i_1 -= 1;
    assertTrue(number > 0, "Path condition is violated: assertTrue(number > 0) //[3]");
    int div_2 = (int) (number / num_1[11]);
    assertFalse(div_2 > 0, "Path condition is violated: assertFalse(div_2 > 0) //[4]");
    number %= num_1[11];
    i_1 -= 1;
    assertFalse(number > 0, "Path condition is violated: assertFalse(number > 0) //[5]");
    return result_1.toLowerCase();
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static String int_to_mini_roman(int number){
    int[] num_1 = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    String[] sym_1 = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int i_1 = 12;
    String result_1 = "";
    assertTrue(number > 0); //[1]
    int div_1 = (int) (number / num_1[12]);
    assertFalse(div_1 > 0); //[2]
    number %= num_1[12];
    i_1 -= 1;
    assertTrue(number > 0); //[3]
    int div_2 = (int) (number / num_1[11]);
    assertFalse(div_2 > 0); //[4]
    number %= num_1[11];
    i_1 -= 1;
    assertFalse(number > 0); //[5]
    return result_1.toLowerCase();
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(number > 0)
2#assertFalse((int) (number / num_1[12]) > 0)
3#assertTrue(number % num_1[12] > 0)
4#assertFalse((int) (number % num_1[12] / num_1[11]) > 0)
5#assertFalse((number % num_1[12]) % num_1[11] > 0)

*/
