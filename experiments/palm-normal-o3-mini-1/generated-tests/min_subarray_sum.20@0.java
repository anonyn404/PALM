```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            public boolean hasNext() {
                return false;
            }
            public Long next() {
                throw new NoSuchElementException();
            }
        };
    }
};
list.add(10L);
list.add(20L);
min_subarray_sum(list);
```