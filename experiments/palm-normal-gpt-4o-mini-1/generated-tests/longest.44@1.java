```java
List<String> strings = new ArrayList<>();
strings.add(""); // This will pass assertFalse(string_1.length() > 0) 
strings.add(""); // This will pass assertFalse(string_1.length() > 0) again
longest(strings);
```