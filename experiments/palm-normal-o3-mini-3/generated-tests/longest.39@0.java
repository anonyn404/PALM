```java
List<String> list = new AbstractList<String>() {
    int iterCalls = 0;
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { throw new UnsupportedOperationException(); }
    @Override
    public Iterator<String> iterator() {
        iterCalls++;
        if (iterCalls == 1) {
            return new Iterator<String>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public String next() { done = true; return "x"; }
            };
        }
        return new Iterator<String>() {
            int pos = 0;
            public boolean hasNext() { return pos < 2; }
            public String next() {
                if (pos == 0) { pos++; return "yy"; }
                if (pos == 1) { pos++; return "zz"; }
                throw new NoSuchElementException();
            }
        };
    }
};
longest(list);
```