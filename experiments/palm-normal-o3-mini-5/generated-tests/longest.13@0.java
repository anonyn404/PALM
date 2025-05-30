```java
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return Collections.emptyIterator();
        } else if (callCount == 2) {
            return new Iterator<String>() {
                boolean returned = false;
                @Override
                public boolean hasNext() { return !returned; }
                @Override
                public String next() {
                    if (!returned) { 
                        returned = true; 
                        return "";
                    }
                    throw new NoSuchElementException();
                }
            };
        }
        return Collections.emptyIterator();
    }
    @Override
    public String get(int index) { return ""; }
    @Override
    public int size() { return callCount >= 2 ? 1 : 0; }
};
longest(customList);
```