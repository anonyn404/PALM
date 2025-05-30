```java
public static void main(String args[]) {
    List<String> custom = new AbstractList<String>() {
        boolean firstCall = true;
        @Override
        public Iterator<String> iterator() {
            if (firstCall) {
                firstCall = false;
                return Arrays.asList("", "").iterator();
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
            return 0;
        }
    };
    longest(custom);
}
```