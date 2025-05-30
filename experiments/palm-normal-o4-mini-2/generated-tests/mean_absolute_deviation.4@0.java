```java
java.util.List<Double> numbers = new java.util.AbstractList<Double>() {
    java.util.Iterator<Double> it = new java.util.Iterator<Double>() {
        private boolean first = true;
        public boolean hasNext() {
            if (first) { first = false; return false; }
            return true;
        }
        public Double next() {
            return 0.0;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };
    public Double get(int i) {
        return 0.0;
    }
    public int size() {
        return 1;
    }
    public java.util.Iterator<Double> iterator() {
        return it;
    }
};
mean_absolute_deviation(numbers);
```