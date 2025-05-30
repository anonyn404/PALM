```java
List<String> strings = Arrays.asList("a");
assertTrue(strings.iterator().hasNext()); 
assertTrue(strings.iterator().next().length() > 0); 
assertFalse(strings.iterator().hasNext()); 
Iterator<String> string_iter_2 = strings.iterator();
assertFalse(string_iter_2.hasNext()); 
```