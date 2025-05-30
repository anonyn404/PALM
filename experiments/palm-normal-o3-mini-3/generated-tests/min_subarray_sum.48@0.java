```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Long get(int index) {
            if (index == 0) return 0L;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int cursor = 0;
                public boolean hasNext() {
                    return cursor < 2;
                }
                public Long next() {
                    if (cursor == 0) { cursor++; return 0L; }
                    if (cursor == 1) { cursor++; return 1L; }
                    throw new NoSuchElementException();
                }
            };
        }
    };
    min_subarray_sum(list);
}
```