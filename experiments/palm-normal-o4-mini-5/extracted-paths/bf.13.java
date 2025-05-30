import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class BF {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static ArrayList<String> bf(String planet1, String planet2){
    ArrayList<String> planet_names_1 = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    ArrayList<String> result_1 = new ArrayList<String>();
    assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2)), "Path condition is violated: assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))) //[1]");
    int planet1_index_1 = planet_names_1.indexOf(planet1);
    int planet2_index_1 = planet_names_1.indexOf(planet2);
    assertFalse(planet1_index_1 < planet2_index_1, "Path condition is violated: assertFalse(planet1_index_1 < planet2_index_1) //[2]");
    int i_1 = planet2_index_1 + 1;
    assertTrue(i_1 < planet1_index_1, "Path condition is violated: assertTrue(i_1 < planet1_index_1) //[3]");
    result_1.add(planet_names_1.get(i_1));
    i_1 += 1;
    assertTrue(i_1 < planet1_index_1, "Path condition is violated: assertTrue(i_1 < planet1_index_1) //[4]");
    result_1.add(planet_names_1.get(i_1));
    i_1 += 1;
    assertFalse(i_1 < planet1_index_1, "Path condition is violated: assertFalse(i_1 < planet1_index_1) //[5]");
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
    assertFalse((!planet_names_1.contains(planet1)) || (!planet_names_1.contains(planet2))); //[1]
    int planet1_index_1 = planet_names_1.indexOf(planet1);
    int planet2_index_1 = planet_names_1.indexOf(planet2);
    assertFalse(planet1_index_1 < planet2_index_1); //[2]
    int i_1 = planet2_index_1 + 1;
    assertTrue(i_1 < planet1_index_1); //[3]
    result_1.add(planet_names_1.get(i_1));
    i_1 += 1;
    assertTrue(i_1 < planet1_index_1); //[4]
    result_1.add(planet_names_1.get(i_1));
    i_1 += 1;
    assertFalse(i_1 < planet1_index_1); //[5]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertFalse((!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet1)) || (!(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"))).contains(planet2)))
2#assertFalse(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet1) < new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet2))
3#assertTrue(new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet2) + 1 < new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet1))
4#assertTrue((new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet2) + 1) + 1 < new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet1))
5#assertFalse(((new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet2) + 1) + 1) + 1 < new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")).indexOf(planet1))

*/
