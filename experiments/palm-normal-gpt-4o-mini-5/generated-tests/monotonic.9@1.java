```java
public static void main(String args[]) { 
    // Test case that satisfies all assertions
    int[] testArray1 = {1, 2, 2, 3}; // Monotonic increasing
    assert monotonic(testArray1); 

    int[] testArray2 = {3, 2, 2, 1}; // Monotonic decreasing
    assert monotonic(testArray2); 

    int[] testArray3 = {1, 1, 1}; // Monotonic constant
    assert monotonic(testArray3); 

    int[] testArray4 = {1}; // Edge case: Single element array
    assert monotonic(testArray4); 
    
    int[] testArray5 = {2, 2}; // Edge case: Two same elements
    assert monotonic(testArray5); 
}
```