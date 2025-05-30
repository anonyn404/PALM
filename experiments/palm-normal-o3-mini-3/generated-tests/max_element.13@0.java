```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int i) {
        if(i == 0) return 1;
        if(i == 1) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;
            public boolean hasNext() {
                return i < 2;
            }
            public Integer next() {
                if(i == 0) { i++; return 2; }
                if(i == 1) { i++; return 1; }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```