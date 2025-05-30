```java
ArrayList<Long> list = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return Collections.singletonList(get(0)).iterator();
    }
};
list.add(0L);
list.add(0L);
list.add(0L);
min_subarray_sum(list);
```