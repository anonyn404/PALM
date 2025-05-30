```java
public static void main(String args[]) {
    ArrayList<Long> test = new ArrayList<Long>(Arrays.asList(0L, 1L)) {
        @Override
        public int size() {
            return 1;
        }
    };
    min_subarray_sum(test);
}
```