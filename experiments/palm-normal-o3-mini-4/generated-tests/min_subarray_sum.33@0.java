```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count < 1;
            }
            @Override
            public Long next() {
                count++;
                return get(0);
            }
        };
    }
};
list.add(0L);
list.add(-1L);
list.add(-2L);
min_subarray_sum(list);
```