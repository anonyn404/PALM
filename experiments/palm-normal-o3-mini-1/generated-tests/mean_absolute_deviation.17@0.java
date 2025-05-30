```java
List<Double> list = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        return index == 0 ? 1.0 : 3.0;
    }
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if (callCount == 1) {
            return Arrays.asList(1.0, 3.0).iterator();
        } else if (callCount == 2) {
            return Collections.singletonList(1.0).iterator();
        }
        return Collections.emptyIterator();
    }
};
mean_absolute_deviation(list);
```