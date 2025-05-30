```java
List<String> strings = new ArrayList<>();
strings.add(""); // This will pass assertFalse(string_1.length() > 0)
strings.add(""); // This will pass assertFalse(string_1.length() > 0) again
strings.add("a"); // This will pass assertFalse(string_2.length() == 0)
longest(strings);
```