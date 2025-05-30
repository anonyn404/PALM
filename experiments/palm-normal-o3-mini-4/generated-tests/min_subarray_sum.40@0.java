```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                boolean first = true;
                public boolean hasNext() {
                    return first;
                }
                public Long next() {
                    if (first) {
                        first = false;
                        return get(0);
                    }
                    throw new NoSuchElementException();
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    };
    list.add(0L);
    list.add(42L);
    min_subarray_sum(list);
}
```