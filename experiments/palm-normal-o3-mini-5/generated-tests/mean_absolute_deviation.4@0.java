```java
List<Double> customList = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Double get(int index) {
        return 0.0;
    }
    @Override
    public int size() {
        return 1;
    }
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Double next() {
                    throw new NoSuchElementException();
                }
            };
        } else if (callCount == 2) {
            return new Iterator<Double>() {
                boolean yielded = false;
                @Override
                public boolean hasNext() {
                    return !yielded;
                }
                @Override
                public Double next() {
                    if (!yielded) {
                        yielded = true;
                        return 0.0;
                    }
                    throw new NoSuchElementException();
                }
            };
        }
        return super.iterator();
    }
};
mean_absolute_deviation(customList);
```