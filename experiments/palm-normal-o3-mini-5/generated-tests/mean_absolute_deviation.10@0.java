```java
List<Double> numbers = new AbstractList<Double>() {
    boolean firstCall = true;
    @Override
    public Iterator<Double> iterator() {
        if(firstCall) {
            firstCall = false;
            return Collections.emptyIterator();
        } else {
            return Collections.singleton(7.0).iterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        return 7.0;
    }
};
mean_absolute_deviation(numbers);
```