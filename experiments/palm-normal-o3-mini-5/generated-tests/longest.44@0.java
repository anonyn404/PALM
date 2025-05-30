```java
List<String> list = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return Arrays.asList("", "").iterator();
        } else {
            return Arrays.asList("a").iterator();
        }
    }
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public int size() {
        return 2;
    }
};
longest(list);
```