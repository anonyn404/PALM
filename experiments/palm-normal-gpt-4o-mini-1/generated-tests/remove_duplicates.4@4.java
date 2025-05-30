```java
List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2)); // non-empty list with elements
remove_duplicates(numbers);

numbers = new ArrayList<>(Arrays.asList(3)); // non-empty list with one element
remove_duplicates(numbers);

numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // non-empty list with multiple elements
remove_duplicates(numbers);

numbers = new ArrayList<>(Arrays.asList(5, 6, 7)); // another non-empty list with multiple distinct elements
remove_duplicates(numbers);
```