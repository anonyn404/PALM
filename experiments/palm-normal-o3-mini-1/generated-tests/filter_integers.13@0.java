```java
public static void main(String args[]) { 
    List<Object> list = new ArrayList<>();
    list.add("not an integer");
    list.add(42);
    filter_integers(list);
}
```