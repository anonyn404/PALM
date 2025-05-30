```java
public static void main(String args[]) { 
    int[] testArray = {1, 2, 3, 4, 5}; // Monotonic increasing
    assert monotonic(testArray); 

    testArray = new int[]{5, 4, 3, 2, 1}; // Monotonic decreasing
    assert monotonic(testArray);

    testArray = new int[]{2, 2, 2}; // Monotonic constant
    assert monotonic(testArray);

    testArray = new int[]{}; // Edge case empty array
    assert !monotonic(testArray); // Should not pass assertTrue since length is 0

    testArray = null; // Edge case null array
    assert !monotonic(testArray); // Should not pass assertTrue since length is 0
}
```