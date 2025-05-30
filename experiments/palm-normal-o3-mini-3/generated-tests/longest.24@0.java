```java
List<String> list = new AbstractList<String>() {
    boolean firstIteratorUsed = false;
    @Override
    public Iterator<String> iterator() {
        if (!firstIteratorUsed) {
            firstIteratorUsed = true;
            return new Iterator<String>() {
                boolean elementReturned = false;
                @Override
                public boolean hasNext() {
                    return !elementReturned;
                }
                @Override
                public String next() {
                    if (!elementReturned) {
                        elementReturned = true;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
};
longest(list);
```