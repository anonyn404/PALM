```java
class CustomList extends ArrayList<Long> {
    @Override
    public Iterator<Long> iterator() {
        return Collections.emptyIterator();
    }
}
ArrayList<Long> list = new CustomList();
list.add(1L);
list.add(2L);
min_subarray_sum(list);
```