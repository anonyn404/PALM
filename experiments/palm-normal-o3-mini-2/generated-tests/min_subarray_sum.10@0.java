```java
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
                return null;
            }
        };
    }
};
list.add(123L);
min_subarray_sum(list);
```