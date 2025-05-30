```java
ArrayList<Long> nums = new ArrayList<Long>() {
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            public boolean hasNext() {
                return false;
            }
            public Long next() {
                return 0L;
            }
        };
    }
};
nums.add(1L);
nums.add(2L);
min_subarray_sum(nums);
```