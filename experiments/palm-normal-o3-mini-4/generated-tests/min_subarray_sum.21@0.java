```java
ArrayList<Long> nums = new ArrayList<Long>() {
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            boolean used = false;
            @Override
            public boolean hasNext() {
                return !used;
            }
            @Override
            public Long next() {
                used = true;
                return get(0);
            }
        };
    }
};
nums.add(0L);
min_subarray_sum(nums);
```