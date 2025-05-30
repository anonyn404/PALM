import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class IS_NESTED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static boolean is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertTrue(0 < brackets.length(), "Path condition is violated: assertTrue(0 < brackets.length()) //[1]");
    assertFalse(brackets.charAt(0) == '[', "Path condition is violated: assertFalse(brackets.charAt(0) == '[') //[2]");
    closing_brackets_1.add(0);
    i_1++;
    assertTrue(1 < brackets.length(), "Path condition is violated: assertTrue(1 < brackets.length()) //[3]");
    assertTrue(brackets.charAt(1) == '[', "Path condition is violated: assertTrue(brackets.charAt(1) == '[') //[4]");
    opening_brackets_1.add(1);
    i_1++;
    assertFalse(2 < brackets.length(), "Path condition is violated: assertFalse(2 < brackets.length()) //[5]");
    Collections.reverse(closing_brackets_1);
    int cnt_1 = 0, i_2 = 0, l_1 = closing_brackets_1.size();
    Iterator<Integer> idx_iter_1 = opening_brackets_1.iterator();
    int idx_1;
    assertFalse(idx_iter_1.hasNext(), "Path condition is violated: assertFalse(idx_iter_1.hasNext()) //[6]");
    return false;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static boolean is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertTrue(0 < brackets.length()); //[1]
    assertFalse(brackets.charAt(0) == '['); //[2]
    closing_brackets_1.add(0);
    i_1++;
    assertTrue(1 < brackets.length()); //[3]
    assertTrue(brackets.charAt(1) == '['); //[4]
    opening_brackets_1.add(1);
    i_1++;
    assertFalse(2 < brackets.length()); //[5]
    Collections.reverse(closing_brackets_1);
    int cnt_1 = 0, i_2 = 0, l_1 = closing_brackets_1.size();
    Iterator<Integer> idx_iter_1 = opening_brackets_1.iterator();
    int idx_1;
    assertFalse(idx_iter_1.hasNext()); //[6]
    return false;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < brackets.length())
2#assertFalse(brackets.charAt(0) == '[')
3#assertTrue(1 < brackets.length())
4#assertTrue(brackets.charAt(1) == '[')
5#assertFalse(2 < brackets.length())
6#assertFalse((new ArrayList<>().iterator()).hasNext())

*/
