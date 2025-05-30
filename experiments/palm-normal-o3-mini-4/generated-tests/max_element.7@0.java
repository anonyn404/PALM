```java
List<Integer> l = new AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if(index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private boolean done = false;
            @Override
            public boolean hasNext() {
                return !done;
            }
            @Override
            public Integer next() {
                if (done) throw new NoSuchElementException();
                done = true;
                return 2;
            }
        };
    }
};
max_element(l);
```