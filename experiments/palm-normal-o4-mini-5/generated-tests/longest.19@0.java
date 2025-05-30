```java
java.util.List<String> strings = new java.util.AbstractList<String>() {
    private int count = 0;
    public java.util.Iterator<String> iterator() {
        if (count++ == 0) {
            return new java.util.Iterator<String>() {
                private boolean used = false;
                public boolean hasNext() { return !used; }
                public String next() {
                    if (used) throw new java.util.NoSuchElementException();
                    used = true;
                    return "";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else {
            return java.util.Collections.<String>emptyIterator();
        }
    }
    public String get(int index) { throw new IndexOutOfBoundsException(); }
    public int size() { return 0; }
};
longest(strings);
```