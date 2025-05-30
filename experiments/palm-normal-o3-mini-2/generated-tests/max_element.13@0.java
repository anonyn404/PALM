```java
public static void main(String args[]) {
    List<Integer> l = new ArrayList<Integer>() {
        @Override
        public Integer get(int index) {
            if (index == 0) return 1;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public Iterator<Integer> iterator() {
            return Arrays.asList(2, 1).iterator();
        }
    };
    max_element(l);
}
```