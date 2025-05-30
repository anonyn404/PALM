```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int index = 0;
            public boolean hasNext() {
                return index < 1;
            }
            public Long next() {
                if (index < 1) {
                    index++;
                    return get(0);
                }
                throw new NoSuchElementException();
            }
        };
    }
};
list.add(1L);
list.add(2L);
list.add(3L);
min_subarray_sum(list);
```