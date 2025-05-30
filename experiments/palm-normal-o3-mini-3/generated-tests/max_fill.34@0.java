```java
int[][] grid = new int[2][];
grid[0] = new int[1];
grid[1] = new int[2];
grid[0][0] = 3;
grid[1][0] = 2;
grid[1][1] = 4;
int bucket_capacity = 3;
max_fill(grid, bucket_capacity);
```