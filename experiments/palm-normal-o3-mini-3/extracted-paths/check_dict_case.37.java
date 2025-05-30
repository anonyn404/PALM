import java.util.*;
import java.util.HashMap;

class CHECK_DICT_CASE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void check_dict_case(HashMap<Object, Object> dict){
    assertFalse(dict.size() == 0, "Path condition is violated: assertFalse(dict.size() == 0) //[1]");
    String state_1 = "start";
    Iterator<Object> key_iter_1 = dict.keySet().iterator();
    Object key_1;
    assertTrue(key_iter_1.hasNext(), "Path condition is violated: assertTrue(key_iter_1.hasNext()) //[2]");
    key_1 = key_iter_1.next();
    assertFalse(!(key_1 instanceof String), "Path condition is violated: assertFalse(!(key_1 instanceof String)) //[3]");
    String str_key_1 = (String) key_1;
    assertFalse(state_1.equals("start"), "Path condition is violated: assertFalse(state_1.equals(\"start\")) //[4]");
    assertFalse((state_1.equals("upper") && !str_key_1.toUpperCase().equals(str_key_1)) || (state_1.equals("lower") && !str_key_1.toLowerCase().equals(str_key_1)), "Path condition is violated: assertFalse((state_1.equals(\"upper\") && !str_key_1.toUpperCase().equals(str_key_1)) || (state_1.equals(\"lower\") && !str_key_1.toLowerCase().equals(str_key_1))) //[5]");
    assertTrue(key_iter_1.hasNext(), "Path condition is violated: assertTrue(key_iter_1.hasNext()) //[6]");
    key_1 = key_iter_1.next();
    assertFalse(!(key_1 instanceof String), "Path condition is violated: assertFalse(!(key_1 instanceof String)) //[7]");
    String str_key_2 = (String) key_1;
    assertTrue(state_1.equals("start"), "Path condition is violated: assertTrue(state_1.equals(\"start\")) //[8]");
    assertTrue(str_key_2.toUpperCase().equals(str_key_2), "Path condition is violated: assertTrue(str_key_2.toUpperCase().equals(str_key_2)) //[9]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.HashMap;
public static void check_dict_case(HashMap<Object, Object> dict){
    assertFalse(dict.size() == 0); //[1]
    String state_1 = "start";
    Iterator<Object> key_iter_1 = dict.keySet().iterator();
    Object key_1;
    assertTrue(key_iter_1.hasNext()); //[2]
    key_1 = key_iter_1.next();
    assertFalse(!(key_1 instanceof String)); //[3]
    String str_key_1 = (String) key_1;
    assertFalse(state_1.equals("start")); //[4]
    assertFalse((state_1.equals("upper") && !str_key_1.toUpperCase().equals(str_key_1)) || (state_1.equals("lower") && !str_key_1.toLowerCase().equals(str_key_1))); //[5]
    assertTrue(key_iter_1.hasNext()); //[6]
    key_1 = key_iter_1.next();
    assertFalse(!(key_1 instanceof String)); //[7]
    String str_key_2 = (String) key_1;
    assertTrue(state_1.equals("start")); //[8]
    assertTrue(str_key_2.toUpperCase().equals(str_key_2)); //[9]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(dict.size() == 0)
2#assertTrue((dict.keySet().iterator()).hasNext())
3#assertFalse(!(key_iter_1.next() instanceof String))
4#assertFalse(("start").equals("start"))
5#assertFalse((("start").equals("upper") && !str_key_1.toUpperCase().equals((String) key_iter_1.next())) || (("start").equals("lower") && !str_key_1.toLowerCase().equals((String) key_iter_1.next())))
6#assertTrue((dict.keySet().iterator()).hasNext())
7#assertFalse(!(key_iter_1.next() instanceof String))
8#assertTrue(("start").equals("start"))
9#assertTrue(str_key_2.toUpperCase().equals((String) key_iter_1.next()))

*/
