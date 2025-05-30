```java
public static void main(String args[]) {
    ArrayList<Long> customList = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                boolean used = false;
                public boolean hasNext() { return !used; }
                public Long next() { used = true; return get(0); }
            };
        }
    };
    customList.add(1L);
    customList.add(0L);
    min_subarray_sum(customList);
}
```