import java.util.*;
import java.util.ArrayList;
import java.util.List;

class ALL_PREFIXES {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<String> all_prefixes(String string){
    List<String> result_1 = new ArrayList<String>();
    int i_1 = 0;
    assertTrue(0 < string.length(), "Path condition is violated: assertTrue(0 < string.length()) //[1]");
    result_1.add(string.substring(0, 1));
    i_1 += 1;
    assertFalse(1 < string.length(), "Path condition is violated: assertFalse(1 < string.length()) //[2]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public static List<String> all_prefixes(String string){
    List<String> result_1 = new ArrayList<String>();
    int i_1 = 0;
    assertTrue(0 < string.length()); //[1]
    result_1.add(string.substring(0, 1));
    i_1 += 1;
    assertFalse(1 < string.length()); //[2]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < string.length())
2#assertFalse(1 < string.length())

*/
