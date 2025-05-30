```java
List<String> list = new AbstractList<String>() {
    int iteratorCalls = 0;
    @Override
    public Iterator<String> iterator() {
        iteratorCalls++;
        if (iteratorCalls == 1) {
            return Collections.singletonList("a").iterator();
        } else {
            return Collections.singletonList("bb").iterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        return 1;
    }
};
longest(list);
```