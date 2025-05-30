```java
public static void main(String args[]) {
    List<String> customList = new ArrayList<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if (callCount == 1) {
                return Collections.singletonList("A").iterator();
            } else {
                return Collections.singletonList("BB").iterator();
            }
        }
    };
    longest(customList);
}
```