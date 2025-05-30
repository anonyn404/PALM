```java
    int[] testArray = {1};  // This tests the edge case of a single-element array
    assert monotonic(testArray) == true; 

    int[] testArray2 = {1, 2}; // This is a monotonic non-decreasing array
    assert monotonic(testArray2) == true; 

    int[] testArray3 = {2, 1}; // This is a monotonic non-increasing array
    assert monotonic(testArray3) == true; 

    int[] testArray4 = {1, 1}; // This is a monotonic constant array
    assert monotonic(testArray4) == true; 

    int[] testArray5 = {1, 2, 3};  // This is a monotonic non-decreasing array
    assert monotonic(testArray5) == true; 

    int[] testArray6 = {3, 3, 3};  // This is a monotonic constant array with duplicates
    assert monotonic(testArray6) == true; 
```