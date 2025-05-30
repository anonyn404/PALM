```java
public static void main(String args[]) {
    List<String> customList = new AbstractList<String>() {
        boolean firstCall = true;
        @Override
        public Iterator<String> iterator() {
            if (firstCall) {
                firstCall = false;
                return Collections.emptyIterator();
            }
            return Arrays.asList("nonEmpty", "").iterator();
        }
        @Override
        public int size() {
            return 2;
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
    };
    longest(customList);
}
```