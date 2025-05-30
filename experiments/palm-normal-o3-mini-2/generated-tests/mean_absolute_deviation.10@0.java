```java
List<Double> custom = new java.util.AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        if (callCount++ == 0) {
            return java.util.Collections.emptyIterator();
        }
        return java.util.Collections.singleton(1.0).iterator();
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        if (index == 0) {
            return 1.0;
        }
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(custom);
```