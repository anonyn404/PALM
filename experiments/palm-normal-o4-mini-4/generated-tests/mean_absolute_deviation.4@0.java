```java
List<Double> numbers = new AbstractList<Double>() {
    boolean first = true;
    public Double get(int i) { return 0.0; }
    public int size() { return 1; }
    public Iterator<Double> iterator() {
        if (first) {
            first = false;
            return Collections.<Double>emptyIterator();
        }
        return Arrays.asList(0.0).iterator();
    }
};
mean_absolute_deviation(numbers);
```