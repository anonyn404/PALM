```java
public static void main(String args[]) { 
    List<Integer> result = unique(new ArrayList<>()); 
    assertTrue(result.isEmpty()); 
    List<Integer> result2 = unique(Arrays.asList(1, 2, 3)); 
    assertTrue(result2.isEmpty()); 
}
```