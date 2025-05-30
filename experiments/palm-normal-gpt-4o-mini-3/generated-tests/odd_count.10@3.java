```java
ArrayList<String> lst = new ArrayList<>();
lst.add(""); // Edge case: empty string
lst.add(" "); // A space character to ensure non-empty but length > 0 when checked
odd_count(lst);
```