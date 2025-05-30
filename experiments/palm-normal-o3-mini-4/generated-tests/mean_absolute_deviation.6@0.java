```java
List<Double> numbers = new java.util.AbstractList<Double>() {
    public Double get(int index) { throw new UnsupportedOperationException(); }
    public int size() { return 1; }
    public java.util.Iterator<Double> iterator() {
        return new java.util.Iterator<Double>() {
            public boolean hasNext() { return false; }
            public Double next() { throw new java.util.NoSuchElementException(); }
        };
    }
};
mean_absolute_deviation(numbers);
```