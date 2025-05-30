```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                public boolean hasNext() { return false; }
                public Long next() { return null; }
            };
        }
    };
    list.add(10L);
    list.add(5L);
    list.add(7L);
    min_subarray_sum(list);
}
```