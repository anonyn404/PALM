```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private boolean returnedFirst = false;
            public boolean hasNext() {
                return !returnedFirst;
            }
            public Long next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                returnedFirst = true;
                return get(0);
            }
        };
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);
```