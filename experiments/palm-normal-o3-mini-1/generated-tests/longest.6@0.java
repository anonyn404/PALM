```java
public static void main(String args[]) { 
    List<String> customList = new ArrayList<String>() {
        int calls = 0;
        @Override
        public Iterator<String> iterator() {
            calls++;
            if(calls == 1) {
                return Collections.emptyIterator();
            } else {
                return Arrays.asList("value").iterator();
            }
        }
    };
    longest(customList);
}
```