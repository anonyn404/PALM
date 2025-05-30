import java.util.*;

class INT_TO_MINI_ROMAN {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void int_to_mini_roman(int number){
    int[] num_1 = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    String[] sym_1 = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int i_1 = 12;
    String result_1 = "";
    assertTrue(number > 0, "Path condition is violated: assertTrue(number > 0) //[1]");
    int div_1 = (int) (number / num_1[12]);
    assertTrue(div_1 > 0, "Path condition is violated: assertTrue(div_1 > 0) //[2]");
    result_1 += sym_1[12];
    div_1 -= 1;
    assertTrue(div_1 > 0, "Path condition is violated: assertTrue(div_1 > 0) //[3]");
    result_1 += sym_1[12];
    div_1 -= 1;
    assertFalse(div_1 > 0, "Path condition is violated: assertFalse(div_1 > 0) //[4]");
    number %= num_1[12];
    i_1 -= 1;
    assertTrue(number > 0, "Path condition is violated: assertTrue(number > 0) //[5]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static void int_to_mini_roman(int number){
    int[] num_1 = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
    String[] sym_1 = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
    int i_1 = 12;
    String result_1 = "";
    assertTrue(number > 0); //[1]
    int div_1 = (int) (number / num_1[12]);
    assertTrue(div_1 > 0); //[2]
    result_1 += sym_1[12];
    div_1 -= 1;
    assertTrue(div_1 > 0); //[3]
    result_1 += sym_1[12];
    div_1 -= 1;
    assertFalse(div_1 > 0); //[4]
    number %= num_1[12];
    i_1 -= 1;
    assertTrue(number > 0); //[5]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(number > 0)
2#assertTrue((int) (number / num_1[12]) > 0)
3#assertTrue(((int) (number / num_1[12])) - 1 > 0)
4#assertFalse((((int) (number / num_1[12])) - 1) - 1 > 0)
5#assertTrue(number % num_1[12] > 0)

*/
