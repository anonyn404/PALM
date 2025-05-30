```java
public static void main(String args[]) {
    List<Integer> customList = new ArrayList<Integer>(java.util.Arrays.asList(1)) {
        boolean firstCall = true;
        @Override
        public Iterator<Integer> iterator() {
            if (firstCall) {
                firstCall = false;
                return java.util.Collections.emptyIterator();
            } else {
                return super.iterator();
            }
        }
    };
    remove_duplicates(customList);
}
```