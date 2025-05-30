```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return Collections.emptyIterator();
    }
};
list.add(7L);
list.add(3L);
min_subarray_sum(list);
```