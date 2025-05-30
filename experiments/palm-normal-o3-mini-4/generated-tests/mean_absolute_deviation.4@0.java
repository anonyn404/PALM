```java
List<Double> list = new AbstractList<Double>() {
    private int iterCalls = 0;
    @Override
    public Iterator<Double> iterator() {
        iterCalls++;
        if (iterCalls == 1) {
            return Collections.emptyIterator();
        } else {
            return Collections.singleton(1.0).iterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        return 1.0;
    }
};
mean_absolute_deviation(list);
```