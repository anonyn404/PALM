```java
public static void main(String args[]) { 
    List<String> inputStrings = new ArrayList<>();
    String prefix = "test";
    assertFalse(inputStrings.iterator().hasNext());
    filter_by_prefix(inputStrings, prefix);
}
```