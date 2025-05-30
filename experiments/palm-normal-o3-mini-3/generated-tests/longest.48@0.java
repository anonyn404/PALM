```java
List<String> custom = new AbstractList<String>() {
    int iterCount = 0;
    @Override
    public Iterator<String> iterator() {
        iterCount++;
        if(iterCount == 1) {
            return Collections.singletonList("").iterator();
        } else if(iterCount == 2) {
            return Arrays.asList("a", "").iterator();
        }
        return Collections.emptyList().iterator();
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
longest(custom);
```