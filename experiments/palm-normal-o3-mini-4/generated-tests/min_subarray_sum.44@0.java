```java
public static void main(String args[]) { 
    ArrayList<Long> nums = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int i = 0;
                public boolean hasNext() { return i < 1; }
                public Long next() { return get(i++); }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    };
    nums.add(1L);
    nums.add(0L);
    min_subarray_sum(nums);
}
```