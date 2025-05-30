```java
List<Double> customList = new AbstractList<Double>() {
    int iteratorCallCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iteratorCallCount++;
        if (iteratorCallCount == 1) {
            return new Iterator<Double>() {
                boolean available = true;
                @Override
                public boolean hasNext() {
                    return available;
                }
                @Override
                public Double next() {
                    if (!available) throw new NoSuchElementException();
                    available = false;
                    return 4.0;
                }
            };
        } else if (iteratorCallCount == 2) {
            return new Iterator<Double>() {
                int index = 0;
                @Override
                public boolean hasNext() {
                    return index < 2;
                }
                @Override
                public Double next() {
                    if (index == 0) {
                        index++;
                        return 4.0;
                    } else if (index == 1) {
                        index++;
                        return 6.0;
                    }
                    throw new NoSuchElementException();
                }
            };
        }
        return Collections.emptyIterator();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        return index == 0 ? 4.0 : 6.0;
    }
};
mean_absolute_deviation(customList);
```