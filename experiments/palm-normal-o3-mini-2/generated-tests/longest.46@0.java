```java
List<String> strings = new ArrayList<String>() {
    private boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return java.util.Arrays.asList("a", "ab").iterator();
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
};
longest(strings);
```