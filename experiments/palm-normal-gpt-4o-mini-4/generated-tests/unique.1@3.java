```java
public static void main(String args[]) { 
    List<Integer> result = unique(new ArrayList<>()); 
    assertTrue(result.isEmpty()); 
    List<Integer> result2 = unique(Collections.emptyList()); 
    assertTrue(result2.isEmpty()); 
}
```