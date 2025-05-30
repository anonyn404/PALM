```java
List<Object> values = new ArrayList<>();
values.add(1); // assertTrue(value_1 instanceof Integer); will pass
values.add("string"); // additional element to satisfy the hasNext calls
filter_integers(values);
```