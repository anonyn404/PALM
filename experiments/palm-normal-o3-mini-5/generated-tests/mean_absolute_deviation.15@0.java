```java
List<Double> list = new AbstractList<Double>() {
    int call = 0;
    public int size() { return 2; }
    public Double get(int index) { throw new UnsupportedOperationException(); }
    public Iterator<Double> iterator() {
        if(call++ == 0) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Double>() {
                int index = 0;
                Double[] data = new Double[] {1.0, 3.0};
                public boolean hasNext() { return index < data.length; }
                public Double next() { return data[index++]; }
            };
        }
    }
};
mean_absolute_deviation(list);
```