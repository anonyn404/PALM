```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) { return 0; }
    public int size() { return 1; }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return false; }
            public Integer next() { throw new NoSuchElementException(); }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
};
max_element(l);
```