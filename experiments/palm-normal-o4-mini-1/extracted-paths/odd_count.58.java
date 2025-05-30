import java.util.*;
import java.util.ArrayList;

class ODD_COUNT {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertTrue(s_iter_1.hasNext(), "Path condition is violated: assertTrue(s_iter_1.hasNext()) //[1]");
    s_1 = s_iter_1.next();
    int n_1 = 0;
    int i_1 = 0;
    assertTrue(0 < s_1.length(), "Path condition is violated: assertTrue(0 < s_1.length()) //[2]");
    int digit_1 = s_1.charAt(0) - '0';
    assertTrue(digit_1 % 2 == 1, "Path condition is violated: assertTrue(digit_1 % 2 == 1) //[3]");
    n_1++;
    i_1++;
    assertTrue(1 < s_1.length(), "Path condition is violated: assertTrue(1 < s_1.length()) //[4]");
    int digit_2 = s_1.charAt(1) - '0';
    assertFalse(digit_2 % 2 == 1, "Path condition is violated: assertFalse(digit_2 % 2 == 1) //[5]");
    i_1++;
    assertFalse(2 < s_1.length(), "Path condition is violated: assertFalse(2 < s_1.length()) //[6]");
    result_1.add("the number of odd elements " + 1 + "n the str" + 1 + "ng " + 1 + " of the " + 1 + "nput.");
    assertTrue(s_iter_1.hasNext(), "Path condition is violated: assertTrue(s_iter_1.hasNext()) //[7]");
    s_1 = s_iter_1.next();
    int n_2 = 0;
    int i_2 = 0;
    assertTrue(0 < s_1.length(), "Path condition is violated: assertTrue(0 < s_1.length()) //[8]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static void odd_count(ArrayList<String> lst){
    ArrayList<String> result_1 = new ArrayList<>();
    Iterator<String> s_iter_1 = lst.iterator();
    String s_1;
    assertTrue(s_iter_1.hasNext()); //[1]
    s_1 = s_iter_1.next();
    int n_1 = 0;
    int i_1 = 0;
    assertTrue(0 < s_1.length()); //[2]
    int digit_1 = s_1.charAt(0) - '0';
    assertTrue(digit_1 % 2 == 1); //[3]
    n_1++;
    i_1++;
    assertTrue(1 < s_1.length()); //[4]
    int digit_2 = s_1.charAt(1) - '0';
    assertFalse(digit_2 % 2 == 1); //[5]
    i_1++;
    assertFalse(2 < s_1.length()); //[6]
    result_1.add("the number of odd elements " + 1 + "n the str" + 1 + "ng " + 1 + " of the " + 1 + "nput.");
    assertTrue(s_iter_1.hasNext()); //[7]
    s_1 = s_iter_1.next();
    int n_2 = 0;
    int i_2 = 0;
    assertTrue(0 < s_1.length()); //[8]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((lst.iterator()).hasNext())
2#assertTrue(0 < (s_iter_1.next()).length())
3#assertTrue(s_iter_1.next().charAt(0) - '0' % 2 == 1)
4#assertTrue(1 < (s_iter_1.next()).length())
5#assertFalse(s_iter_1.next().charAt(1) - '0' % 2 == 1)
6#assertFalse(2 < (s_iter_1.next()).length())
7#assertTrue((lst.iterator()).hasNext())
8#assertTrue(0 < (s_iter_1.next()).length())

*/
