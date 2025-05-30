```java
List<String> strings = new AbstractList<String>() {
    boolean firstCall = true;
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return Arrays.asList("a", "").iterator();
        } else {
            return Collections.<String>emptyList().iterator();
        }
    }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { throw new UnsupportedOperationException(); }
};
longest(strings);
```