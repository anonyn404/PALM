```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        final Long first = super.get(0);
        return new Iterator<Long>() {
            private boolean returned = false;
            public boolean hasNext() { return !returned; }
            public Long next() { if (!returned) { returned = true; return first; } throw new NoSuchElementException(); }
        };
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);
```