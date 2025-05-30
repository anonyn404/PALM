```java
public static void main(String args[]) {
    class CustomList extends ArrayList<Long> {
        @Override
        public int size() {
            return 1;
        }
    }
    ArrayList<Long> list = new CustomList();
    list.add(0L);
    list.add(0L);
    min_subarray_sum(list);
}
```