```java
List<Integer> l = new java.util.AbstractList<Integer>() {
    int callCount = 0;
    public int size() {
        callCount++;
        return callCount == 1 ? 0 : 1;
    }
    public Integer get(int index) {
        throw new UnsupportedOperationException();
    }
};
sort_third(l);
```