```java
public static void main(String args[]) { 
    int[] test1 = {1, 2, 3, 4}; // sorted array, should pass assertTrue at [4]
    monotonic(test1);

    int[] test2 = {4, 3, 2, 1}; // reverse sorted array, should also pass assertTrue at [4]
    monotonic(test2);

    int[] test3 = {1, 1, 1, 1}; // all elements the same, should pass assertTrue at [4]
    monotonic(test3);
}
```