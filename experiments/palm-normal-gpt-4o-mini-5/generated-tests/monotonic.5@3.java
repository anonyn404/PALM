```java
    int[] testArray1 = {}; // edge case for empty array
    int[] testArray2 = {1, 2, 2}; // monotonic increasing with duplicates
    int[] testArray3 = {3, 3, 2}; // monotonic decreasing with duplicates
    int[] testArray4 = {2, 2, 2}; // monotonic constant

    assertFalse(monotonic(testArray1));
    assertFalse(monotonic(testArray2));
    assertFalse(monotonic(testArray3));
    assertFalse(monotonic(testArray4));
```