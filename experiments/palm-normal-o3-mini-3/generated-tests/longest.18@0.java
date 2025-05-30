```java
longest(new AbstractList<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
            };
        } else if (callCount == 2) {
            return new Iterator<String>() {
                int index = 0;
                public boolean hasNext() { return index < 2; }
                public String next() {
                    if (index < 2) 
                        return index++ == 0 ? "a" : "b";
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { return 0; }
});
```