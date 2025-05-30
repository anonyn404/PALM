import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class BF {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static void bf(String planet1, String planet2){
    ArrayList<String> planet_names_1 = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result_1 = new ArrayList<String>();
    assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2)), "Path condition is violated: assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))) //[1]");
    int planet1_index_1 = planet_names_1.indexOf(planet1);
    int planet2_index_1 = planet_names_1.indexOf(planet2);
    assertFalse(planet1_index_1 < planet2_index_1, "Path condition is violated: assertFalse(planet1_index_1 < planet2_index_1) //[2]");
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public static void bf(String planet1, String planet2){
    ArrayList<String> planet_names_1 = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result_1 = new ArrayList<String>();
    assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))); //[1]
    int planet1_index_1 = planet_names_1.indexOf(planet1);
    int planet2_index_1 = planet_names_1.indexOf(planet2);
    assertFalse(planet1_index_1 < planet2_index_1); //[2]
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet1)) || (!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet2)))
2#assertFalse(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet1) < new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet2))

*/
