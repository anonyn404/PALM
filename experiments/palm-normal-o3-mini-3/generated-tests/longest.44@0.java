```java
List<String> strings = new java.util.AbstractList<String>() {
    boolean firstCall = true;
    public java.util.Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return java.util.Arrays.asList("", "").iterator();
        } else {
            return java.util.Arrays.asList("a", "").iterator();
        }
    }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public int size() { throw new UnsupportedOperationException(); }
};
longest(strings);
```