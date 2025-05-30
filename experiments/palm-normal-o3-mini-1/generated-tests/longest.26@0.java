```java
List<String> customList = new AbstractList<String>() {
    int iterCalls = 0;
    @Override public String get(int index) { throw new UnsupportedOperationException(); }
    @Override public int size() { return 1; }
    @Override public Iterator<String> iterator() {
        iterCalls++;
        if(iterCalls == 1) {
            return Collections.singletonList("").iterator();
        } else {
            return Collections.singletonList("a").iterator();
        }
    }
};
longest(customList);
```