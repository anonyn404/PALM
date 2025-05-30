```java
List<Integer> list = new ArrayList<Integer>() {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return false; }
            public Integer next() { throw new NoSuchElementException(); }
        };
    }
};
list.add(42);
max_element(list);
```