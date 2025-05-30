```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        boolean firstIteratorCall = true;
        @Override
        public Iterator<String> iterator() {
            if (firstIteratorCall) {
                firstIteratorCall = false;
                return Collections.emptyIterator();
            } else {
                return new Iterator<String>() {
                    int index = 0;
                    final String[] arr = {"a", "b"};
                    public boolean hasNext() { return index < arr.length; }
                    public String next() { return arr[index++]; }
                };
            }
        }
        @Override
        public String get(int index) {
            return index == 0 ? "a" : "b";
        }
        @Override
        public int size() {
            return 2;
        }
    };
    longest(list);
}
```