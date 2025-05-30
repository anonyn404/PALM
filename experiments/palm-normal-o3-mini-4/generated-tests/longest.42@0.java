```java
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        if (callCount++ == 0) {
            return Collections.singletonList("a").iterator();
        } else {
            return Collections.singletonList("bb").iterator();
        }
    }
    @Override
    public String get(int index) {
        return index == 0 ? "" : null;
    }
    @Override
    public int size() {
        return 1;
    }
};
longest(customList);
```