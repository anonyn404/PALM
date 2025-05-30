```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                private boolean used = false;
                public boolean hasNext() { return !used; }
                public Long next() { used = true; return ArrayList.this.get(0); }
            };
        }
    };
    list.add(1L);
    list.add(100L);
    min_subarray_sum(list);
}
```