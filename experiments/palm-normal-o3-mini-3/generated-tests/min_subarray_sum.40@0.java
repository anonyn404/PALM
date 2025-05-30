```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int index = 0;
            public boolean hasNext() { return index < 1; }
            public Long next() { index++; return get(0); }
        };
    }
};
list.add(0L);
list.add(0L);
min_subarray_sum(list);
```