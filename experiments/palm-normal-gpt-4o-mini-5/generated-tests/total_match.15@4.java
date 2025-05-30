```java
List<String> lst1 = new ArrayList<>();
List<String> lst2 = new ArrayList<>();
lst2.add(null); // This creates a situation where l2_1 can be considered lower than 0
total_match(lst1, lst2);
```