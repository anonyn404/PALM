```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) { return 5; }
    public int size() { return 0; }
};
max_element(l);
```