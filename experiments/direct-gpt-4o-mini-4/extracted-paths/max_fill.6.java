import java.util.*;

class MAX_FILL {
    static void assertFalse(boolean v, String errmsg) {assert (v == false): errmsg;}
    static void assertTrue(boolean v, String errmsg) {assert (v == true): errmsg;}
    public static int max_fill(int[][] grid, int bucket_capacity){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < grid.length, "Path condition is violated: assertTrue(0 < grid.length) //[1]");
    int row_capacity_1 = 0;
    int j_1 = 0;
    assertTrue(0 < grid[0].length, "Path condition is violated: assertTrue(0 < grid[0].length) //[2]");
    row_capacity_1 += grid[0][0];
    j_1++;
    assertFalse(1 < grid[0].length, "Path condition is violated: assertFalse(1 < grid[0].length) //[3]");
    result_1 += (row_capacity_1 + bucket_capacity - 1) / bucket_capacity;
    i_1++;
    assertTrue(1 < grid.length, "Path condition is violated: assertTrue(1 < grid.length) //[4]");
    int row_capacity_2 = 0;
    int j_2 = 0;
    assertFalse(0 < grid[1].length, "Path condition is violated: assertFalse(0 < grid[1].length) //[5]");
    result_1 += (0 + bucket_capacity - 1) / bucket_capacity;
    i_1++;
    assertFalse(2 < grid.length, "Path condition is violated: assertFalse(2 < grid.length) //[6]");
    return result_1;
}


public static void main(String args[]) { ; }
}
/* SEPARATOR */
/*
import java.util.*;
public static int max_fill(int[][] grid, int bucket_capacity){
    int result_1 = 0;
    int i_1 = 0;
    assertTrue(0 < grid.length); //[1]
    int row_capacity_1 = 0;
    int j_1 = 0;
    assertTrue(0 < grid[0].length); //[2]
    row_capacity_1 += grid[0][0];
    j_1++;
    assertFalse(1 < grid[0].length); //[3]
    result_1 += (row_capacity_1 + bucket_capacity - 1) / bucket_capacity;
    i_1++;
    assertTrue(1 < grid.length); //[4]
    int row_capacity_2 = 0;
    int j_2 = 0;
    assertFalse(0 < grid[1].length); //[5]
    result_1 += (0 + bucket_capacity - 1) / bucket_capacity;
    i_1++;
    assertFalse(2 < grid.length); //[6]
    return result_1;
}
*/
/* SEPARATOR */
/*

*/
/* SEPARATOR */
/*
1#assertTrue(0 < grid.length)
2#assertTrue(0 < grid[0].length)
3#assertFalse(1 < grid[0].length)
4#assertTrue(1 < grid.length)
5#assertFalse(0 < grid[1].length)
6#assertFalse(2 < grid.length)

*/
