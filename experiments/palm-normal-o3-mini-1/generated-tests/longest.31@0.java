```java
List<String> list = new AbstractList<String>() {
    private int callCount = 0;
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<String>() {
                private boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (!done) { done = true; return "AA"; }
                    throw new NoSuchElementException();
                }
            };
        } else if (callCount == 2) {
            return new Iterator<String>() {
                private boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (!done) { done = true; return "B"; }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { return 1; }
};
longest(list);
```