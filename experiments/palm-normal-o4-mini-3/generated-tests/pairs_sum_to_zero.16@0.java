```java
java.util.List<Integer> l = new java.util.AbstractList<Integer>() {
    int calls = 0;
    @Override public int size() {
        calls++;
        if (calls <= 3) return 2;
        else return 1;
    }
    @Override public Integer get(int index) {
        if (index == 0 || index == 1) return 1;
        throw new IndexOutOfBoundsException();
    }
};
pairs_sum_to_zero(l);
```