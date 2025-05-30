```java
ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(1L, 2L)) {
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
};
min_subarray_sum(list);
```