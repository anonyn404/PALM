```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            boolean used = false;
            public boolean hasNext() {
                return !used;
            }
            public Long next() {
                if (!hasNext()) throw new NoSuchElementException();
                used = true;
                return get(0);
            }
        };
    }
};
list.add(5L);
list.add(-10L);
list.add(3L);
min_subarray_sum(list);
```