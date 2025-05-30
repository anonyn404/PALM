```java
List<String> list = new java.util.AbstractList<String>() {
    int calls = 0;
    @Override
    public java.util.Iterator<String> iterator() {
        int currentCall = calls++;
        if (currentCall == 0) {
            return new java.util.Iterator<String>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (done) throw new java.util.NoSuchElementException();
                    done = true;
                    return "";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else {
            return new java.util.Iterator<String>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() {
                    if (done) throw new java.util.NoSuchElementException();
                    done = true;
                    return "a";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    }
    @Override
    public int size() { return 1; }
    @Override
    public String get(int index) { return index == 0 ? "" : null; }
};
longest(list);
```