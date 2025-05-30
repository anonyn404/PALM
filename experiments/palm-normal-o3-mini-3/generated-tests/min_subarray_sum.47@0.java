```java
public static void main(String args[]) {
    ArrayList<Long> testList = new ArrayList<Long>() {
        @Override public int size() { return 1; }
        @Override public Long get(int index) {
            if(index == 0) return 1L;
            if(index == 1) return 0L;
            throw new IndexOutOfBoundsException();
        }
        @Override public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int index = 0;
                public boolean hasNext() { return index < 2; }
                public Long next() {
                    if(index == 0) { index++; return 1L; }
                    if(index == 1) { index++; return 0L; }
                    throw new NoSuchElementException();
                }
            };
        }
    };
    min_subarray_sum(testList);
}
```