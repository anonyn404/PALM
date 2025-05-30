```java
public static void main(String args[]) {
    List<String> strings = new java.util.AbstractList<String>() {
        int iterCount = 0;
        public java.util.Iterator<String> iterator() {
            iterCount++;
            if (iterCount == 1) {
                return java.util.Arrays.asList("").iterator();
            } else if (iterCount == 2) {
                return java.util.Arrays.asList("a", "b").iterator();
            }
            return java.util.Collections.emptyIterator();
        }
        public String get(int index) { throw new UnsupportedOperationException(); }
        public int size() { throw new UnsupportedOperationException(); }
    };
    longest(strings);
}
```