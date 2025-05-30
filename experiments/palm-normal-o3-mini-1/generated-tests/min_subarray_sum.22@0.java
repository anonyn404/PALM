```java
ArrayList<Long> custom = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int count = 0;
            public boolean hasNext() { return count < 1; }
            public Long next() { count++; return ArrayList.this.get(0); }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
};
custom.add(5L);
custom.add(100L);
min_subarray_sum(custom);
```