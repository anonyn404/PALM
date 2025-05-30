```java
List<Double> customList = new AbstractList<Double>() {
    int iterCallCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iterCallCount++;
        if(iterCallCount == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Double>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Double next() {
                    if (!returned) { returned = true; return 0.0; }
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public Double get(int index) { return 0.0; }
    @Override
    public int size() { return 1; }
};
mean_absolute_deviation(customList);
```