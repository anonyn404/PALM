```java
List<Double> numbers = new java.util.AbstractList<Double>() {
    boolean firstCall = true;
    @Override
    public Double get(int index) {
        if(index == 0) return 1.0;
        else if(index == 1) return 2.0;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Iterator<Double> iterator() {
        if(firstCall) {
            firstCall = false;
            return new Iterator<Double>() {
                int cursor = 0;
                @Override
                public boolean hasNext() {
                    return cursor < 2;
                }
                @Override
                public Double next() {
                    return get(cursor++);
                }
            };
        } else {
            return new Iterator<Double>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public Double next() {
                    used = true;
                    return get(0);
                }
            };
        }
    }
};
mean_absolute_deviation(numbers);
```