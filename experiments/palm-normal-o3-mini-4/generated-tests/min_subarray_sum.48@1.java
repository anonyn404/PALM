```java
public static void main(String args[]) {
    ArrayList<Long> list = new ArrayList<Long>() {
        @Override
        public int size() {
            return 1;
        }
    };
    list.add(0L);
    list.add(1L);
    min_subarray_sum(list);
}
```