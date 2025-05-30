import java.util.*;
import java.util.ArrayList;

class REVERSE_DELETE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<Object> reverse_delete(String s, String c){
    String new_s_1 = "";
    int i_1 = 0;
    assertTrue(0 < s.length(), "Path condition is violated: assertTrue(0 < s.length()) //[1]");
    assertTrue(c.indexOf(s.charAt(0)) == -1, "Path condition is violated: assertTrue(c.indexOf(s.charAt(0)) == -1) //[2]");
    new_s_1 += s.charAt(0);
    i_1++;
    assertTrue(1 < s.length(), "Path condition is violated: assertTrue(1 < s.length()) //[3]");
    assertTrue(c.indexOf(s.charAt(1)) == -1, "Path condition is violated: assertTrue(c.indexOf(s.charAt(1)) == -1) //[4]");
    new_s_1 += s.charAt(1);
    i_1++;
    assertFalse(2 < s.length(), "Path condition is violated: assertFalse(2 < s.length()) //[5]");
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertFalse(i_2 >= 0, "Path condition is violated: assertFalse(i_2 >= 0) //[6]");
    ArrayList<Object> res_1 = new ArrayList<>();
    res_1.add(new_s_1);
    res_1.add(reverse_s_1.equals(new_s_1));
    return res_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
public static ArrayList<Object> reverse_delete(String s, String c){
    String new_s_1 = "";
    int i_1 = 0;
    assertTrue(0 < s.length()); //[1]
    assertTrue(c.indexOf(s.charAt(0)) == -1); //[2]
    new_s_1 += s.charAt(0);
    i_1++;
    assertTrue(1 < s.length()); //[3]
    assertTrue(c.indexOf(s.charAt(1)) == -1); //[4]
    new_s_1 += s.charAt(1);
    i_1++;
    assertFalse(2 < s.length()); //[5]
    String reverse_s_1 = "";
    int i_2 = new_s_1.length() - 1;
    assertFalse(i_2 >= 0); //[6]
    ArrayList<Object> res_1 = new ArrayList<>();
    res_1.add(new_s_1);
    res_1.add(reverse_s_1.equals(new_s_1));
    return res_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < s.length())
2#assertTrue(c.indexOf(s.charAt(0)) == -1)
3#assertTrue(1 < s.length())
4#assertTrue(c.indexOf(s.charAt(1)) == -1)
5#assertFalse(2 < s.length())
6#assertFalse(("" + s.charAt(0)) + s.charAt(1).length() - 1 >= 0)

*/
