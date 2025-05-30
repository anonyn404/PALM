```java
List<Double> list = new AbstractList<Double>() {
    int iterCount = 0;
    @Override
    public Iterator<Double> iterator() {
        iterCount++;
        if(iterCount == 1) {
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
        } else {
            return new Iterator<Double>() {
                boolean returned = false;
                @Override
                public boolean hasNext() {
                    return !returned;
                }
                @Override
                public Double next() {
                    if(returned) throw new NoSuchElementException();
                    returned = true;
                    return 0.0;
                }
            };
        }
    }
    @Override
    public Double get(int index) {
        return 0.0;
    }
    @Override
    public int size() {
        return 1;
    }
};
mean_absolute_deviation(list);
```