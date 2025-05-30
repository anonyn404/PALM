```java
List<String> custom = new AbstractList<String>() {
    private boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return Collections.singletonList("a").iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public String get(int index) {
        return "a";
    }
};
longest(custom);
```