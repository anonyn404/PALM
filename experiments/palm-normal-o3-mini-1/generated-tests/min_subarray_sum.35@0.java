```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int count = 0;
            public boolean hasNext() { 
                return count == 0; 
            }
            public Long next() { 
                if (!hasNext()) throw new NoSuchElementException();
                count++;
                return ArrayList.this.get(0);
            }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
};
list.add(5L);
list.add(-10L);
list.add(3L);
min_subarray_sum(list);
```