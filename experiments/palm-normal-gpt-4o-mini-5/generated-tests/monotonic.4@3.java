```java
    int[] l = new int[]{1, 1, 1}; // All elements the same (monotonic)
    assertTrue(monotonic(l));
    
    l = new int[]{1, 2, 2, 3}; // Non-decreasing (monotonic)
    assertTrue(monotonic(l));
    
    l = new int[]{3, 2, 2, 1}; // Non-increasing (monotonic)
    assertTrue(monotonic(l));
    
    l = new int[]{1, 2, 3}; // Strictly increasing (monotonic)
    assertTrue(monotonic(l));
    
    l = new int[]{3, 2, 1}; // Strictly decreasing (monotonic)
    assertTrue(monotonic(l));
    
    l = new int[]{}; // Edge case: empty array
    assertTrue(monotonic(l));
    
    l = null; // Edge case: null
    assertFalse(monotonic(l));
```