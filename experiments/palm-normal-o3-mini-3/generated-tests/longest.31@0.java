```java
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return Collections.singletonList("a").iterator();
        } else if(callCount == 2) {
            return Collections.singletonList("bb").iterator();
        }
        return Collections.emptyIterator();
    }
    @Override
    public String get(int index) { return null; }
    @Override
    public int size() { return 1; }
};
longest(customList);
```