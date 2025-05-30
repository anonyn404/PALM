```java
ArrayList<Long> customList = new ArrayList<Long>() {
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < 2;
            }
            @Override
            public Long next() {
                if(index < 2) {
                    index++;
                    return 1L;
                }
                throw new NoSuchElementException();
            }
        };
    }
};
min_subarray_sum(customList);
```