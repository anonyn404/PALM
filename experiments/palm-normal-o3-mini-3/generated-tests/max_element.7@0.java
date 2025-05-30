```java
List<Integer> l = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 0;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean used = false;
            public boolean hasNext() {
                return !used;
            }
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                used = true;
                return 1;
            }
        };
    }
};
max_element(l);
```