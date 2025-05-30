```java
public static void main(String args[]) {
    List<String> customList = new AbstractList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if(callCount == 1) {
                return Collections.emptyIterator();
            } else {
                return Arrays.asList("dummy").iterator();
            }
        }
        @Override
        public String get(int index) {
            return "dummy";
        }
        @Override
        public int size() {
            return 1;
        }
    };
    longest(customList);
}
```