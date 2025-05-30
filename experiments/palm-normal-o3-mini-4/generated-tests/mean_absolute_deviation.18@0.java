```java
List<Double> customList = new AbstractList<Double>() {
    boolean firstIteratorCalled = false;
    @Override
    public Iterator<Double> iterator() {
        if (!firstIteratorCalled) {
            firstIteratorCalled = true;
            return Collections.singletonList(2.0).iterator();
        } else {
            return Arrays.asList(2.0, 4.0).iterator();
        }
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return 2.0;
        if(index == 1) return 4.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(customList);
```