```java
ArrayList<Long> nums = new ArrayList<Long>() {
    public Iterator<Long> iterator() {
        return Collections.<Long>emptyIterator();
    }
};
nums.add(42L);
min_subarray_sum(nums);
```