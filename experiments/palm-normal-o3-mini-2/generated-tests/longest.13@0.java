```java
List<String> customList = new AbstractList<String>() {
    int iteratorCallCount = 0;
    @Override
    public Iterator<String> iterator() {
        iteratorCallCount++;
        if(iteratorCallCount == 1) {
            return new Iterator<String>() {
                @Override public boolean hasNext() { return false; }
                @Override public String next() { throw new NoSuchElementException(); }
            };
        } else if(iteratorCallCount == 2) {
            return new Iterator<String>() {
                boolean first = true;
                @Override public boolean hasNext() { return first; }
                @Override public String next() { 
                    if(first) { 
                        first = false; 
                        return ""; 
                    } 
                    throw new NoSuchElementException(); 
                }
            };
        }
        return Collections.emptyIterator();
    }
    @Override public String get(int index) { throw new UnsupportedOperationException(); }
    @Override public int size() { return 1; }
};
longest(customList);
```