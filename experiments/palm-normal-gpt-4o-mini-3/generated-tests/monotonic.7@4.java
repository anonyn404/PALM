```java
    int[] testArray1 = {1}; // for edge case (single element, valid)
    int[] testArray2 = {1, 1}; // for assertTrue (monotonic with duplicates)
    int[] testArray3 = {2}; // for edge case (single element, valid)
    int[] testArray4 = {2, 2}; // for assertTrue (monotonic with duplicates)
    int[] testArray5 = {1, 2}; // for assertTrue (monotonic increasing)
    int[] testArray6 = {2, 1}; // for assertTrue (monotonic decreasing)

    assert monotonic(testArray1); // should be true
    assert monotonic(testArray2); // should be true
    assert monotonic(testArray3); // should be true
    assert monotonic(testArray4); // should be true
    assert monotonic(testArray5); // should be true
    assert monotonic(testArray6); // should be true
```