```java
List<Integer> list = new AbstractList<Integer>() {
    public Integer get(int index) {
        return index == 0 ? 1 : 2;
    }
    public int size() {
        return 2;
    }
    public Iterator<Integer> iterator() {
        return Arrays.asList(2, 1).iterator();
    }
};
max_element(list);
```