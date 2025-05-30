```java
public static void main(String args[]) {
    List<Integer> list = new ArrayList<Integer>() {
        @Override
        public Integer get(int index) {
            if (index == 0) return 1;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Iterator<Integer> iterator() {
            return Arrays.asList(2, 3).iterator();
        }
    };
    max_element(list);
}
```