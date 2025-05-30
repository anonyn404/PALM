```java
public static void main(String args[]) { 
    int[] testArray1 = {1, 2, 3, 4, 5}; // for assertTrue (monotonic increasing)
    int[] testArray2 = {5, 4, 3, 2, 1}; // for assertTrue (monotonic decreasing)
    int[] testArray3 = {1, 2, 2, 3}; // for assertTrue (monotonic with duplicates)
    int[] testArray4 = {1, 2, 2, 3, 3}; // for assertTrue (monotonic with duplicates)
    int[] testArray5 = {}; // for edge case (empty array)

    assert monotonic(testArray1); // should be true
    assert monotonic(testArray2); // should be true
    assert monotonic(testArray3); // should be true
    assert monotonic(testArray4); // should be true
    assert !monotonic(testArray5); // should be handled
}
```