```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>(java.util.Arrays.asList(1L, 2L, 3L)) {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                public boolean hasNext() { return false; }
                public Long next() { return null; }
            };
        }
    };
    min_subarray_sum(list);
}
```