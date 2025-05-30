```java
List<Integer> list = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return Collections.singleton(2).iterator();
    }
};
max_element(list);
```