```java
List<Integer> list = new AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 5;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 1;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean hasNext = true;
            public boolean hasNext() { return hasNext; }
            public Integer next() {
                hasNext = false;
                return 10;
            }
        };
    }
};
max_element(list);
```