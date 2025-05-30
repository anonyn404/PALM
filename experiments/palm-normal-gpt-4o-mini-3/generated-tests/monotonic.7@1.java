```java
public static void main(String args[]) { 
    int[] testArray1 = {1}; // for edge case (single element) - assertTrue
    int[] testArray2 = {1, 2}; // for assertTrue (monotonic increasing)
    int[] testArray3 = {2, 1}; // for assertTrue (monotonic decreasing)
    int[] testArray4 = {1, 1}; // for assertTrue (monotonic with duplicates)

    assert monotonic(testArray1); // should be true
    assert monotonic(testArray2); // should be true
    assert monotonic(testArray3); // should be true
    assert monotonic(testArray4); // should be true
}
```