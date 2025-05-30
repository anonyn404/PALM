```java
    int[] testArray = {1, 2}; // Two elements increasing
    assert monotonic(testArray); 

    testArray = new int[]{2, 1}; // Two elements decreasing
    assert monotonic(testArray); 

    testArray = new int[]{1, 1}; // Two elements constant
    assert monotonic(testArray); 

    testArray = new int[]{1}; // Single element, all assertions should pass
    assert monotonic(testArray); 
```