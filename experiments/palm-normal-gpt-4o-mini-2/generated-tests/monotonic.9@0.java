```java
public static void main(String args[]) { 
    int[] testArray = {1, 2, 2, 3};  // This is a monotonic non-decreasing array
    assert monotonic(testArray) == true; 

    int[] testArray2 = {3, 2, 2, 1}; // This is a monotonic non-increasing array
    assert monotonic(testArray2) == true; 

    int[] testArray3 = {1, 1, 1};   // This is a monotonic constant array
    assert monotonic(testArray3) == true; 

    int[] testArray4 = {};  // This tests the edge case of an empty array
    assert monotonic(testArray4) == true; 
}
```