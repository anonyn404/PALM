```java
List<Double> numbers = new AbstractList<Double>() {
    int iteratorCallCount = 0;
    public Iterator<Double> iterator() {
        iteratorCallCount++;
        if(iteratorCallCount == 1) {
            return Arrays.asList(1.0, 2.0).iterator();
        } else if(iteratorCallCount == 2) {
            return Arrays.asList(1.0).iterator();
        }
        return Collections.emptyIterator();
    }
    public Double get(int index) {
        return index == 0 ? 1.0 : 2.0;
    }
    public int size() {
        return 2;
    }
};
mean_absolute_deviation(numbers);
```