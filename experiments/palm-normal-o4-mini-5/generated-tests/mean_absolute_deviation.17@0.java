```java
List<Double> numbers = new java.util.AbstractList<Double>() {
    int count = 0;
    @Override public java.util.Iterator<Double> iterator() {
        if (count++ == 0) {
            return java.util.Arrays.asList(1.0, 2.0).iterator();
        } else {
            return java.util.Arrays.asList(1.0).iterator();
        }
    }
    @Override public Double get(int index) { throw new UnsupportedOperationException(); }
    @Override public int size() { return 2; }
};
mean_absolute_deviation(numbers);
```