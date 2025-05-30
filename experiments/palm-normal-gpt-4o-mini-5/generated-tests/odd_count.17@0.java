```java
ArrayList<String> lst = new ArrayList<>();
lst.add(""); // This makes the first assertFalse pass.
lst.add("Hello"); // This makes the second assertTrue pass.
odd_count(lst);
```