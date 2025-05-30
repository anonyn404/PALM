```java
public static void main(String args[]) {
    int[][] grid = new int[2][];
    grid[0] = new int[0];
    grid[1] = new int[]{1, 2};
    int bucket_capacity = 3;
    max_fill(grid, bucket_capacity);
}
```