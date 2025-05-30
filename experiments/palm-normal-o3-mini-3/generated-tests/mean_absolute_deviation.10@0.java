```java
List<Double> numbers = new AbstractList<Double>() {
    int iteratorCallCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iteratorCallCount++;
        if (iteratorCallCount == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if (iteratorCallCount == 2) {
            return new Iterator<Double>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Double next() {
                    if (!returned) {
                        returned = true;
                        return 1.0;
                    }
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Double get(int index) {
        if (index == 0)
            return 1.0;
        throw new IndexOutOfBoundsException();
    }
};
mean_absolute_deviation(numbers);
```