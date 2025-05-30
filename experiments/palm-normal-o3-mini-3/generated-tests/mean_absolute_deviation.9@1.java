```java
List<Double> list = new AbstractList<Double>() {
    boolean firstCall = true;
    @Override
    public Iterator<Double> iterator() {
        if (firstCall) {
            firstCall = false;
            return Collections.singletonList(1.0).iterator();
        } else {
            return Collections.emptyList().iterator();
        }
    }
    @Override
    public Double get(int index) {
        return 1.0;
    }
    @Override
    public int size() {
        return 1;
    }
};
mean_absolute_deviation(list);
```