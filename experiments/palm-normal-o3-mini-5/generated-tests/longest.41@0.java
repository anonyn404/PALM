```java
public static void main(String args[]) {
    List<String> list = new ArrayList<String>() {
        boolean used = false;
        @Override
        public Iterator<String> iterator() {
            if (!used) {
                used = true;
                return java.util.Arrays.asList("abc", "a").iterator();
            }
            return java.util.Collections.emptyIterator();
        }
    };
    longest(list);
}
```