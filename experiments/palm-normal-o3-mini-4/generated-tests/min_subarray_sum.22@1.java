```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            private int count = 0;
            public boolean hasNext() { 
                return count < 1; 
            }
            public Long next() { 
                count++; 
                return ArrayList.this.get(0); 
            }
        };
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);
```