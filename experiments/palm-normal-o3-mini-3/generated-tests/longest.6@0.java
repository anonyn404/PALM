```java
List<String> strings = new AbstractList<String>() {
    private boolean first = true;
    @Override
    public Iterator<String> iterator() {
        if (first) {
            first = false;
            return Collections.emptyIterator();
        } else {
            return Collections.singleton("nonempty").iterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        return 0;
    }
};
longest(strings);
```