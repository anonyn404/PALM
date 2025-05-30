```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int idx = 0;
                @Override
                public boolean hasNext() {
                    return idx < 2;
                }
                @Override
                public Long next() {
                    return get(idx++);
                }
            };
        }
    };
    list.add(5L);
    list.add(0L);
    min_subarray_sum(list);
}
```