```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean nextAvailable = true;
            public boolean hasNext() {
                return nextAvailable;
            }
            public Integer next() {
                if (nextAvailable) {
                    nextAvailable = false;
                    return 2;
                }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```