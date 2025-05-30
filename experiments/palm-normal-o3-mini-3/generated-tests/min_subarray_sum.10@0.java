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
                return 42L;
            }
        };
    }
};
list.add(42L);
min_subarray_sum(list);
```