import java.util.*;
public class MAX_FILL28 {

    public static int max_fill(int[][] grid, int bucket_capacity) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int row_capacity = 0;
            for (int j = 0; j < grid[i].length; j++) {
                row_capacity += grid[i][j];
            }
            result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
        }
        return result;
    }
public void my_test() {max_fill(new int[][] {{5, 5}}, 1);
}
}