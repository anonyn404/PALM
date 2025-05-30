import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class BF {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<String> bf(String planet1, String planet2){
    ArrayList<String> planet_names_1 = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result_1 = new ArrayList<String>();
    assertTrue((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2)), "Path condition is violated: assertTrue((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))) //[1]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public static ArrayList<String> bf(String planet1, String planet2){
    ArrayList<String> planet_names_1 = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result_1 = new ArrayList<String>();
    assertTrue((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))); //[1]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue((!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet1)) || (!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet2)))

*/
