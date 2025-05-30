```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(5L, 3L)) {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                int count = 0;
                public boolean hasNext() {
                    return count < 1;
                }
                public Long next() {
                    if (!hasNext()) throw new NoSuchElementException();
                    count++;
                    return get(0);
                }
            };
        }
    };
    min_subarray_sum(list);
}
```