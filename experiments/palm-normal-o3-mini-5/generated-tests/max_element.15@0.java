```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    public Integer get(int index) {
        if (index == 0) return 1;
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
    public java.util.Iterator<Integer> iterator() {
        return java.util.Arrays.asList(2, 3).iterator();
    }
};
max_element(l);
```