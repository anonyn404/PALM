```java
public static void main(String args[]) { 
    // Test case that satisfies all assertions
    int[] testArray1 = {1, 2, 2, 3}; // Monotonic increasing
    assert monotonic(testArray1); 

    int[] testArray2 = {3, 2, 2, 1}; // Monotonic decreasing
    assert monotonic(testArray2); 

    int[] testArray3 = {1, 1, 1}; // Monotonic constant
    assert monotonic(testArray3); 

    int[] testArray4 = {}; // Edge case: Empty array
    assert monotonic(testArray4); 
    
    int[] testArray5 = {Integer.MIN_VALUE, Integer.MAX_VALUE}; // Edge case: Min and Max Int
    assert monotonic(testArray5); 
}
```