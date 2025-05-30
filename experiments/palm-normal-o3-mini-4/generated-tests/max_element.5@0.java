```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        if (index == 1) return 2;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int pos = 0;
            public boolean hasNext() {
                return pos < 2;
            }
            public Integer next() {
                if (pos == 0) { pos++; return 2; }
                if (pos == 1) { pos++; return 100; }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```