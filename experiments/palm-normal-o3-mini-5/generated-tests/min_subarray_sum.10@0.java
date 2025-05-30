```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Long next() {
                    throw new NoSuchElementException();
                }
            };
        }
        @Override
        public Long get(int index) {
            if(index == 0) return 42L;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 1;
        }
    };
    min_subarray_sum(list);
}
```