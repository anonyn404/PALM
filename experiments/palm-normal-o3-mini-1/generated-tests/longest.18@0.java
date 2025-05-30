```java
public static void main(String args[]) {
    List<String> testList = new ArrayList<String>() {
        boolean firstCall = true;
        @Override
        public Iterator<String> iterator() {
            if (firstCall) {
                firstCall = false;
                return new Iterator<String>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }
                    @Override
                    public String next() {
                        throw new NoSuchElementException();
                    }
                };
            }
            return java.util.Arrays.asList("a", "b").iterator();
        }
    };
    longest(testList);
}
```