```java
List<String> list = new ArrayList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        if (callCount++ == 0) {
            return java.util.Arrays.asList("", "a").iterator();
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
};
longest(list);
```