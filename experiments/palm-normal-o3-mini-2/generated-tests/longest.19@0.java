```java
List<String> customList = new AbstractList<String>() {
    boolean first = true;
    @Override
    public Iterator<String> iterator() {
        if (first) {
            first = false;
            return new Iterator<String>() {
                boolean hasNext = true;
                public boolean hasNext() { return hasNext; }
                public String next() {
                    if (!hasNext) throw new NoSuchElementException();
                    hasNext = false;
                    return "";
                }
            };
        }
        return new Iterator<String>() {
            public boolean hasNext() { return false; }
            public String next() { throw new NoSuchElementException(); }
        };
    }
    @Override
    public String get(int index) { return ""; }
    @Override
    public int size() { return first ? 1 : 0; }
};
longest(customList);
```