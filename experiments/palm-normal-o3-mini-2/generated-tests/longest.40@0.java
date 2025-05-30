```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        boolean firstIteratorCalled = false;
        @Override
        public Iterator<String> iterator() {
            if (!firstIteratorCalled) {
                firstIteratorCalled = true;
                return Arrays.asList("", "a").iterator();
            } else {
                return Collections.emptyIterator();
            }
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
        @Override
        public int size() {
            return 2;
        }
    };
    longest(list);
}
```