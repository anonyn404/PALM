```java
java.util.List<Integer> numbers = new java.util.AbstractList<Integer>() {
    boolean first = true;
    @Override public java.util.Iterator<Integer> iterator() {
        if (first) {
            first = false;
            return java.util.Collections.<Integer>emptyList().iterator();
        } else {
            return java.util.Arrays.asList(1).iterator();
        }
    }
    @Override public Integer get(int index) { throw new UnsupportedOperationException(); }
    @Override public int size() { throw new UnsupportedOperationException(); }
};
remove_duplicates(numbers);
```