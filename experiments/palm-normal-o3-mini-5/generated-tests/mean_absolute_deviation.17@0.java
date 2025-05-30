```java
List<Double> customList = new AbstractList<Double>() {
    int iterCount = 0;
    public int size() {
        return 2;
    }
    public Double get(int index) {
        if(index == 0) return 3.0;
        if(index == 1) return 5.0;
        throw new IndexOutOfBoundsException();
    }
    public Iterator<Double> iterator() {
        iterCount++;
        if(iterCount == 1) {
            return new Iterator<Double>() {
                int pos = 0;
                public boolean hasNext() {
                    return pos < 2;
                }
                public Double next() {
                    if(pos == 0) { pos++; return 3.0; }
                    if(pos == 1) { pos++; return 5.0; }
                    throw new NoSuchElementException();
                }
            };
        } else if(iterCount == 2) {
            return new Iterator<Double>() {
                boolean returned = false;
                public boolean hasNext() {
                    return !returned;
                }
                public Double next() {
                    if(!returned) { returned = true; return 3.0; }
                    throw new NoSuchElementException();
                }
            };
        }
        return Collections.emptyIterator();
    }
};
mean_absolute_deviation(customList);
```