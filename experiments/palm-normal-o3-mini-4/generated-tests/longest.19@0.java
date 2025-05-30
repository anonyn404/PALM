```java
List<String> list = new AbstractList<String>() {
    private int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<String>() {
                private boolean first = true;
                @Override
                public boolean hasNext() {
                    return first;
                }
                @Override
                public String next() {
                    if (!first) throw new NoSuchElementException();
                    first = false;
                    return "";
                }
            };
        } else {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override public int size() {
        throw new UnsupportedOperationException();
    }
    @Override public String get(int index) {
        throw new UnsupportedOperationException();
    }
};
longest(list);
```