```java
List<Integer> numbers = new ArrayList<>(Collections.singletonList(0)); // single element list (ensures the first iterator has next, second iterator can still point to valid elements)
remove_duplicates(numbers);
```