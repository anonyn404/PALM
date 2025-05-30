```java
ArrayList<Long> list = new ArrayList<Long>() {
    public int size() {
        return 1;
    }
};
list.add(1L);
list.add(1L);
min_subarray_sum(list);
```