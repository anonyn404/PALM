```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
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
                    if (!used) {
                        used = true;
                        return get(0);
                    }
                    throw new NoSuchElementException();
                }
            };
        }
    };
    list.add(5L);
    list.add(1L);
    list.add(0L);
    min_subarray_sum(list);
}
```