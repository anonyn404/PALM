```java
public static void main(String args[]) { 
    ArrayList<Long> list = new ArrayList<Long>() {
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int count = 0;
                public boolean hasNext() {
                    return count == 0;
                }
                public Long next() {
                    return get(count++);
                }
            };
        }
    };
    list.add(1L);
    list.add(5L);
    min_subarray_sum(list);
}
```