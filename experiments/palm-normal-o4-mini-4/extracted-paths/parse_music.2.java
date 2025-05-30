import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PARSE_MUSIC {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void parse_music(String music_string){
    HashMap<String, Integer> note_map_1 = new HashMap<String, Integer>();
    note_map_1.put("o", 4);
    note_map_1.put("o|", 2);
    note_map_1.put(".|", 1);
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(music_string.trim().equals(""), "Path condition is violated: assertFalse(music_string.trim().equals(\"\")) //[1]");
    java.lang.String[] note_array_1 = music_string.split(" ");
    String note_1;
    assertTrue(0 < note_array_1.length, "Path condition is violated: assertTrue(0 < note_array_1.length) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public static void parse_music(String music_string){
    HashMap<String, Integer> note_map_1 = new HashMap<String, Integer>();
    note_map_1.put("o", 4);
    note_map_1.put("o|", 2);
    note_map_1.put(".|", 1);
    List<Integer> result_1 = new ArrayList<Integer>();
    assertFalse(music_string.trim().equals("")); //[1]
    java.lang.String[] note_array_1 = music_string.split(" ");
    String note_1;
    assertTrue(0 < note_array_1.length); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse(music_string.trim().equals(""))
2#assertTrue(0 < music_string.split(" ").length)

*/
