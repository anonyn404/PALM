```java
    int[] testArray1 = {}; // edge case for empty array
    int[] testArray2 = {1, 2, 3}; // monotonic increasing
    int[] testArray3 = {3, 2, 1}; // monotonic decreasing
    int[] testArray4 = {1, 1, 1}; // monotonic constant
    int[] testArray5 = {3, 1, 2}; // non-monotonic
    
    assertTrue(monotonic(testArray1) == false);
    assertTrue(monotonic(testArray2) == false);
    assertTrue(monotonic(testArray3) == false);
    assertTrue(monotonic(testArray4) == false);
    assertFalse(monotonic(testArray5));
```