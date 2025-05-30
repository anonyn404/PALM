```java
public static void main(String args[]) {
    java.util.List<String> customList = new java.util.AbstractList<String>() {
        int call = 0;
        public java.util.Iterator<String> iterator() {
            call++;
            if(call == 1) {
                return java.util.Collections.singletonList("").iterator();
            } else if(call == 2) {
                return java.util.Arrays.asList("a", "").iterator();
            }
            return java.util.Collections.emptyIterator();
        }
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
        public int size() {
            throw new UnsupportedOperationException();
        }
    };
    longest(customList);
}
```