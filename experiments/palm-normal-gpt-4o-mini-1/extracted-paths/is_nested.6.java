import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class IS_NESTED {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertTrue(0 < brackets.length(), "Path condition is violated: assertTrue(0 < brackets.length()) //[1]");
    assertFalse(brackets.charAt(0) == '[', "Path condition is violated: assertFalse(brackets.charAt(0) == '[') //[2]");
    closing_brackets_1.add(0);
    i_1++;
    assertTrue(1 < brackets.length(), "Path condition is violated: assertTrue(1 < brackets.length()) //[3]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public static void is_nested(String brackets){
    ArrayList<Integer> opening_brackets_1 = new ArrayList<>();
    ArrayList<Integer> closing_brackets_1 = new ArrayList<>();
    int i_1 = 0;
    assertTrue(0 < brackets.length()); //[1]
    assertFalse(brackets.charAt(0) == '['); //[2]
    closing_brackets_1.add(0);
    i_1++;
    assertTrue(1 < brackets.length()); //[3]
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

*/
