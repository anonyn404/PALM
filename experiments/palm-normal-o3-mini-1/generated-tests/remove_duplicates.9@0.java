```java
List<Integer> customList = new AbstractList<Integer>() {
    int callCount = 0;
    @Override
    public Iterator<Integer> iterator() {
        callCount++;
        if (callCount == 1) {
            return Collections.emptyIterator();
        } else if (callCount == 2) {
            return new Iterator<Integer>() {
                boolean returned = false;
                @Override
                public boolean hasNext() {
                    return !returned;
                }
                @Override
                public Integer next() {
                    if (!returned) {
                        returned = true;
                        return 0;
                    }
                    throw new NoSuchElementException();
                }
            };
        }
        return Collections.emptyIterator();
    }
    @Override
    public Integer get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
};
remove_duplicates(customList);
```