```java
ArrayList<String> lst = new ArrayList<>();
lst.add(""); // This ensures s_1.length() = 0 for the first iteration
odd_count(lst);
lst.add("a"); // Now s_1.length() > 0 for the second iteration
odd_count(lst);
```