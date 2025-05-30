```java
List<Integer> l = new AbstractList<Integer>() {
    int count = 0;
    @Override
    public int size() {
        count++;
        if (count == 4) {
            return 1;
        }
        return 2;
    }
    @Override
    public Integer get(int index) {
        if (index == 0) return 1;
        if (index == 1) return 2;
        throw new IndexOutOfBoundsException();
    }
};
pairs_sum_to_zero(l);
```