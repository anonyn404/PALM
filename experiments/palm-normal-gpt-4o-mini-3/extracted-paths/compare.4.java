import java.util.*;

class COMPARE {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int[] compare(int[] game, int[] guess){
    int[] result_1 = new int[game.length];
    int i_1 = 0;
    assertTrue(0 < game.length, "Path condition is violated: assertTrue(0 < game.length) //[1]");
    result_1[i_1] = Math.abs(game[0] - guess[0]);
    i_1 += 1;
    assertTrue(1 < game.length, "Path condition is violated: assertTrue(1 < game.length) //[2]");
    result_1[i_1] = Math.abs(game[1] - guess[1]);
    i_1 += 1;
    assertFalse(2 < game.length, "Path condition is violated: assertFalse(2 < game.length) //[3]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int[] compare(int[] game, int[] guess){
    int[] result_1 = new int[game.length];
    int i_1 = 0;
    assertTrue(0 < game.length); //[1]
    result_1[i_1] = Math.abs(game[0] - guess[0]);
    i_1 += 1;
    assertTrue(1 < game.length); //[2]
    result_1[i_1] = Math.abs(game[1] - guess[1]);
    i_1 += 1;
    assertFalse(2 < game.length); //[3]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < game.length)
2#assertTrue(1 < game.length)
3#assertFalse(2 < game.length)

*/
