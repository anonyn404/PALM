```java
List<Double> list = new AbstractList<Double>() {
    int call = 0;
    public Iterator<Double> iterator() {
        call++;
        if(call == 1) {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        } else if(call == 2) {
            return new Iterator<Double>() {
                int index = 0;
                final Double[] arr = {1.0, 3.0};
                public boolean hasNext() { return index < arr.length; }
                public Double next() { return arr[index++]; }
            };
        }
        return new Iterator<Double>() {
            int index = 0;
            final Double[] arr = {1.0, 3.0};
            public boolean hasNext() { return index < arr.length; }
            public Double next() { return arr[index++]; }
        };
    }
    public int size() { return 2; }
    public Double get(int index) { return index == 0 ? 1.0 : 3.0; }
};
mean_absolute_deviation(list);
```