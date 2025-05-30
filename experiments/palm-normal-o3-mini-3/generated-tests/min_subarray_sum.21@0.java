```java
ArrayList<Long> input = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private boolean first = true;
            @Override
            public boolean hasNext() {
                return first;
            }
            @Override
            public Long next() {
                if(first) {
                    first = false;
                    return get(0);
                }
                throw new NoSuchElementException();
            }
        };
    }
};
input.add(0L);
input.add(0L);
min_subarray_sum(input);
```