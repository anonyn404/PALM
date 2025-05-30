```java
public static void main(String args[]) { 
    List<Integer> l = new AbstractList<Integer>() {
        @Override
        public Integer get(int index) {
            if (index == 0) return 42;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Iterator<Integer> iterator() {
            return Collections.emptyIterator();
        }
    };
    max_element(l);
}
```