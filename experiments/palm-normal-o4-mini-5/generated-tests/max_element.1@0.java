```java
java.util.List<Integer> l = new java.util.AbstractList<Integer>() {
    public Integer get(int i) { return 42; }
    public int size() { return 0; }
};
max_element(l);
```