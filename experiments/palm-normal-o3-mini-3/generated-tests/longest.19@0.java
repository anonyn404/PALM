```java
List<String> list = new AbstractList<String>() {
    boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return Arrays.asList("").iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public String get(int index) {
        return "";
    }
    @Override
    public int size() {
        return firstCall ? 1 : 0;
    }
};
longest(list);
```