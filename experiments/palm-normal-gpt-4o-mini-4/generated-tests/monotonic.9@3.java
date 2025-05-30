```java
public static void main(String args[]) { 
    int[] test1 = {1, 2, 3, 4}; // sorted array, should pass assertTrue at [4]
    monotonic(test1);

    int[] test2 = {4, 3, 2, 1}; // reverse sorted array, should also pass assertTrue at [4]
    monotonic(test2);
    
    int[] test3 = {1}; // single element array, satisfies assertTrue at [2] and assertFalse at [3]
    monotonic(test3);
    
    int[] test4 = {1, 1}; // two elements, same, satisfies assertTrue at [4] and assertFalse at [3]
    monotonic(test4);
    
    int[] test5 = {}; // empty array, satisfies assertTrue at [1] and assertTrue at [4]
    monotonic(test5);
}
```