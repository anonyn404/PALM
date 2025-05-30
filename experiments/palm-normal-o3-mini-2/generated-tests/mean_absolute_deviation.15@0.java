```java
List<Double> list = new java.util.AbstractList<Double>() {
    int iterCount = 0;
    public java.util.Iterator<Double> iterator() {
        iterCount++;
        if (iterCount == 1) {
            return java.util.Collections.emptyIterator();
        } else if (iterCount == 2) {
            return java.util.Arrays.asList(1.0, -1.0).iterator();
        }
        return java.util.Collections.emptyIterator();
    }
    public int size() { return 2; }
    public Double get(int index) {
        if (index == 0) return 1.0;
        if (index == 1) return -1.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(list);
```