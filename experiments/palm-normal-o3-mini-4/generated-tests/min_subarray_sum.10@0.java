```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return java.util.Collections.emptyIterator();
    }
};
list.add(42L);
min_subarray_sum(list);
```