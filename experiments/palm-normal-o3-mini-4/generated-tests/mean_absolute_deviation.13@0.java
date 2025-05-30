```java
List<Double> list = new AbstractList<Double>() {
    boolean used = false;
    @Override
    public Iterator<Double> iterator() {
        if (!used) {
            used = true;
            return new Iterator<Double>() {
                int index = 0;
                Double[] vals = new Double[]{1.0, 2.0};
                public boolean hasNext() { return index < vals.length; }
                public Double next() { return vals[index++]; }
            };
        } else {
            return new Iterator<Double>() {
                public boolean hasNext() { return false; }
                public Double next() { throw new NoSuchElementException(); }
            };
        }
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public Double get(int index) {
        if(index < 0 || index >= 2) throw new IndexOutOfBoundsException();
        return index == 0 ? 1.0 : 2.0;
    }
};

mean_absolute_deviation(list);
```