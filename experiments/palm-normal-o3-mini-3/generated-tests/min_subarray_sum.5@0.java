```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return Collections.emptyIterator();
    }
};
list.add(1L);
list.add(2L);
min_subarray_sum(list);
```