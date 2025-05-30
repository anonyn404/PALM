```java
List<String> myList = new java.util.AbstractList<String>() {
    boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return new Iterator<String>() {
                int index = 0;
                String[] data = {"a", "aa"};
                @Override
                public boolean hasNext() {
                    return index < data.length;
                }
                @Override
                public String next() {
                    return data[index++];
                }
            };
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
};
longest(myList);
```