```java
List<String> customList = new AbstractList<String>() {
    int count = 0;
    @Override
    public Iterator<String> iterator() {
        if(count++ == 0) {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
            };
        } else {
            return Arrays.asList("hello", "world").iterator();
        }
    }
    @Override
    public String get(int index) { throw new UnsupportedOperationException(); }
    @Override
    public int size() { return 2; }
};
longest(customList);
```