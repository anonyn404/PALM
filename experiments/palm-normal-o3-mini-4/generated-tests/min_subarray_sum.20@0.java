```java
public static void main(String args[]) {
    ArrayList<Long> nums = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Long next() {
                    throw new NoSuchElementException();
                }
            };
        }
    };
    nums.add(5L);
    nums.add(3L);
    min_subarray_sum(nums);
}
```