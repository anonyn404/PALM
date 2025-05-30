```java
List<Double> customList = new AbstractList<Double>() {
    int iteratorCalls = 0;
    @Override
    public Iterator<Double> iterator() {
        iteratorCalls++;
        if(iteratorCalls == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if(iteratorCalls == 2) {
            return new Iterator<Double>() {
                int index = 0;
                Double[] vals = new Double[]{ -3.0, 4.0 };
                public boolean hasNext() { return index < vals.length; }
                public Double next() { return vals[index++]; }
            };
        }
        return null;
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index == 0) return -3.0;
        if(index == 1) return 4.0;
        throw new IndexOutOfBoundsException();
    }
};

mean_absolute_deviation(customList);
```