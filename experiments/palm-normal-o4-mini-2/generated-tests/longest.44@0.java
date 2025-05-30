```java
List<String> strings = new AbstractList<String>() {
    boolean first = true;
    public Iterator<String> iterator() {
        if (first) {
            first = false;
            return java.util.Arrays.asList("", "").iterator();
        } else {
            return java.util.Collections.singletonList("a").iterator();
        }
    }
    public String get(int index) {
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 0;
    }
};
longest(strings);
```