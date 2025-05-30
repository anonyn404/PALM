```java
ArrayList<Long> nums = new ArrayList<Long>() {
    @Override
    public int size() {
        return 1;
    }
};
nums.add(1L);
nums.add(0L);
min_subarray_sum(nums);
```