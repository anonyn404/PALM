```java
List<Double> numbers = new ArrayList<Double>() {
    boolean firstCall = true;
    @Override
    public Iterator<Double> iterator() {
        if (firstCall) {
            firstCall = false;
            return Arrays.asList(1.0, 2.0).iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return 2;
    }
};
mean_absolute_deviation(numbers);
```