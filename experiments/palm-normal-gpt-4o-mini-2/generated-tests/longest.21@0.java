```java
List<String> input = new ArrayList<>();
input.add(""); // triggers assertFalse at [2]
input.add("abc"); // triggers assertTrue at [4]
longest(input);
```