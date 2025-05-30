```java
{
    class CustomList extends ArrayList<Long> {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                public boolean hasNext() { return false; }
                public Long next() { throw new NoSuchElementException(); }
            };
        }
    }
    CustomList list = new CustomList();
    list.add(1L);
    list.add(2L);
    list.add(3L);
    min_subarray_sum(list);
}
```