```java
ArrayList<Long> customList = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator(){
        return new Iterator<Long>() {
            boolean used = false;
            public boolean hasNext() {
                return !used;
            }
            public Long next() {
                if (used) throw new NoSuchElementException();
                used = true;
                return get(0);
            }
        };
    }
};
customList.add(5L);
customList.add(3L);
customList.add(7L);
min_subarray_sum(customList);
```