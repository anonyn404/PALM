```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int index = 0;
            public boolean hasNext() {
                return index < 2;
            }
            public Long next() {
                if(index == 0) {
                    index++;
                    return 0L;
                }
                if(index == 1) {
                    index++;
                    return 1L;
                }
                throw new NoSuchElementException();
            }
        };
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Long get(int index) {
        if(index == 0) {
            return 0L;
        }
        throw new IndexOutOfBoundsException();
    }
};
min_subarray_sum(list);
```