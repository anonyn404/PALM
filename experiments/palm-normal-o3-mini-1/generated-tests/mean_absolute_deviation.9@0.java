```java
List<Double> myList = new AbstractList<Double>() {
    int callCount = 0;
    @Override
    public Iterator<Double> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<Double>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public Double next() {
                    used = true;
                    return 42.0;
                }
            };
        } else {
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
        }
    }
    @Override
    public Double get(int index) {
        if (index == 0) return 42.0;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
};
mean_absolute_deviation(myList);
```