```java
ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(1L, 2L)) {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < 1;
            }
            @Override
            public Long next() {
                if (hasNext()) {
                    return get(index++);
                }
                throw new NoSuchElementException();
            }
        };
    }
};
min_subarray_sum(list);
```