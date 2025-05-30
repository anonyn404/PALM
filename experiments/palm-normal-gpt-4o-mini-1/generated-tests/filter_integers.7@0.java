```java
public static void main(String args[]) { 
    List<Object> values = new ArrayList<>();
    values.add(42);
    values.add("not an integer"); // ensuring that the second item is ignored
    filter_integers(values);
}
```