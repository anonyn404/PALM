```java
    int[] testCase1 = {1, 1, 1}; // All elements are the same (monotonic)
    int[] testCase2 = {3, 2, 1}; // Reverse sorted order (monotonic)
    int[] testCase3 = {}; // Empty array (edge case, considered monotonic)
    int[] testCase4 = {2}; // Single element (considered monotonic)
    int[] testCase5 = {1, 2, 2, 3}; // Non-decreasing order (monotonic)
    
    assertTrue(monotonic(testCase1)); 
    assertTrue(monotonic(testCase2)); 
    assertTrue(monotonic(testCase3)); 
    assertTrue(monotonic(testCase4)); 
    assertTrue(monotonic(testCase5)); 
```