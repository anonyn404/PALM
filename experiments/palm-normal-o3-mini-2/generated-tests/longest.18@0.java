```java
public static void main(String args[]) {
    List<String> customList = new AbstractList<String>() {
        boolean flag = false;
        @Override
        public Iterator<String> iterator() {
            if (!flag) {
                flag = true;
                return Collections.emptyIterator();
            } else {
                return Arrays.asList("a", "b").iterator();
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
    longest(customList);
}
```