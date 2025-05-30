```java
List<String> customList = new AbstractList<String>() {
    int iteratorCallCount = 0;
    @Override
    public Iterator<String> iterator() {
        iteratorCallCount++;
        if (iteratorCallCount == 1) {
            return Collections.emptyIterator();
        } else {
            return new Iterator<String>() {
                boolean hasReturned = false;
                @Override
                public boolean hasNext() {
                    return !hasReturned;
                }
                @Override
                public String next() {
                    if (!hasReturned) {
                        hasReturned = true;
                        return "non-empty";
                    }
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public String get(int index) {
        return "non-empty";
    }
    @Override
    public int size() {
        return 1;
    }
};

longest(customList);
```