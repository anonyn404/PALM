```java
public static void main(String args[]) {
    final int[] callCount = {0};
    List<String> customList = new ArrayList<String>() {
        public Iterator<String> iterator() {
            callCount[0]++;
            if (callCount[0] == 1) {
                return Arrays.asList("").iterator();
            } else {
                return Arrays.asList("a", "b").iterator();
            }
        }
    };
    longest(customList);
}
```