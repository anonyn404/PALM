```java
public static void main(String args[]) { 
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                public boolean hasNext() { return false; }
                public Long next() { throw new NoSuchElementException(); }
            };
        }
    };
    list.add(3L);
    list.add(2L);
    list.add(1L);
    min_subarray_sum(list);
}
```