```java
ArrayList<Long> nums = new ArrayList<Long>() {
    @Override
    public Iterator<Long> iterator() {
        return java.util.Collections.<Long>emptyIterator();
    }
};
nums.add(1L);
nums.add(2L);
min_subarray_sum(nums);
```