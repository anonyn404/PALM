```java
public static void main(String args[]) {
    List<Integer> list = new AbstractList<Integer>() {
        public Integer get(int index) {
            if (index == 0) return 1;
            if (index == 1) return 1;
            throw new IndexOutOfBoundsException();
        }
        public int size() { return 2; }
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                int index = 0;
                public boolean hasNext() { return index < 2; }
                public Integer next() {
                    if (index == 0) {
                        index++;
                        return 2;
                    }
                    if (index == 1) {
                        index++;
                        return 1;
                    }
                    throw new NoSuchElementException();
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    };
    max_element(list);
}
```