import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PARSE_MUSIC {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static List<Integer> parse_music(String music_string){
    HashMap<String, Integer> note_map_1 = new HashMap<String, Integer>();
    note_map_1.put("o", 4);
    note_map_1.put("o|", 2);
    note_map_1.put(".|", 1);
    List<Integer> result_1 = new ArrayList<Integer>();
    assertTrue(music_string.trim().equals(""), "Path condition is violated: assertTrue(music_string.trim().equals(\"\")) //[1]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public static List<Integer> parse_music(String music_string){
    HashMap<String, Integer> note_map_1 = new HashMap<String, Integer>();
    note_map_1.put("o", 4);
    note_map_1.put("o|", 2);
    note_map_1.put(".|", 1);
    List<Integer> result_1 = new ArrayList<Integer>();
    assertTrue(music_string.trim().equals("")); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(music_string.trim().equals(""))

*/
