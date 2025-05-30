```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    @Override
    public Integer get(int index) {
        if (index == 0) {
            return 1;
        }
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Integer> iterator() {
        return java.util.Arrays.asList(2).iterator();
    }
};
max_element(l);
```