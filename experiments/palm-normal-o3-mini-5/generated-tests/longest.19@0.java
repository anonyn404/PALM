```java
List<String> testList = new AbstractList<String>() {
    boolean firstCall = false;
    public Iterator<String> iterator() {
        if (!firstCall) {
            firstCall = true;
            return new Iterator<String>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public String next() {
                    if (returned) throw new NoSuchElementException();
                    returned = true;
                    return "";
                }
            };
        }
        return Collections.emptyIterator();
    }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { return 1; }
};
longest(testList);
```