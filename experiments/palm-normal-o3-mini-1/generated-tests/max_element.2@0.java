```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if (index == 0) return 1;
        return 2;
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public java.util.Iterator<Integer> iterator() {
        return new java.util.Iterator<Integer>() {
            private boolean returned = false;
            @Override
            public boolean hasNext() {
                return !returned;
            }
            @Override
            public Integer next() {
                if (!returned) {
                    returned = true;
                    return 2;
                }
                throw new java.util.NoSuchElementException();
            }
        };
    }
};
max_element(l);
```