```java
java.util.List<String> lst1 = new java.util.ArrayList<String>();
java.util.List<String> lst2 = java.util.Arrays.asList(
    new String(new char[Integer.MAX_VALUE]), 
    "a"
);
total_match(lst1, lst2);
```