```java
public static void main(String args[]) { 
    List<String> customList = new AbstractList<String>() {
        boolean firstCall = false;
        List<String> underlying = Arrays.asList("a", "a");
        @Override
        public String get(int index) {
            return underlying.get(index);
        }
        @Override
        public int size() {
            return underlying.size();
        }
        @Override
        public Iterator<String> iterator() {
            if (!firstCall) {
                firstCall = true;
                return underlying.iterator();
            } else {
                return Collections.emptyIterator();
            }
        }
    };
    longest(customList);
}
```