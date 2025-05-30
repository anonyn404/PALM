```java
List<Integer> customList = new AbstractList<Integer>() {
    boolean first = true;
    @Override
    public Iterator<Integer> iterator() {
        if (first) {
            first = false;
            return Collections.singleton(42).iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return first ? 1 : 0;
    }
    @Override
    public Integer get(int index) {
        if (first && index == 0) return 42;
        throw new IndexOutOfBoundsException();
    }
};
remove_duplicates(customList);
```