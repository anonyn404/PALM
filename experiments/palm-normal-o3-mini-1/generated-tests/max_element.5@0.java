```java
List<Integer> l = new AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if(index == 0) return 1;
        if(index == 1) return 3;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;
            public boolean hasNext() {
                return index < 2;
            }
            public Integer next() {
                if(index == 0) { index++; return 2; }
                if(index == 1) { index++; return 4; }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```