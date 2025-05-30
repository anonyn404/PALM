```java
longest(new java.util.AbstractList<String>() {
    boolean first = true;
    @Override public java.util.Iterator<String> iterator() {
        if (first) {
            first = false;
            return java.util.Collections.<String>emptyList().iterator();
        } else {
            return java.util.Collections.singletonList("elem").iterator();
        }
    }
    @Override public String get(int index) { throw new IndexOutOfBoundsException(); }
    @Override public int size() { return 0; }
});
```