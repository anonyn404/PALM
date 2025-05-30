```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if(index == 0) return 42;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return false;
            }
            public Integer next() {
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```