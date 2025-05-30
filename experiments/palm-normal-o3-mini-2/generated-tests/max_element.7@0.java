```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) { return 1; }
    public int size() { return 1; }
    public Iterator<Integer> iterator() { return Collections.singletonList(2).iterator(); }
};
max_element(l);
```