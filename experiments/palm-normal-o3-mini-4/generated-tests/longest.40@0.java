```java
List<String> list = new java.util.AbstractList<String>() {
    boolean firstCall = false;
    @Override
    public Iterator<String> iterator() {
        if (!firstCall) {
            firstCall = true;
            return new Iterator<String>() {
                int count = 0;
                @Override
                public boolean hasNext() {
                    return count < 2;
                }
                @Override
                public String next() {
                    if (count == 0) {
                        count++;
                        return "";
                    } else {
                        count++;
                        return "a";
                    }
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
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
longest(list);
```