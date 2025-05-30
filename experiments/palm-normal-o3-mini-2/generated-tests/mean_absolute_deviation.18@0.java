```java
List<Double> customList = new AbstractList<Double>() {
    int iteratorCount = 0;
    public int size() {
        return 2;
    }
    public Double get(int index) {
        if (index == 0) return 10.0;
        if (index == 1) return 20.0;
        throw new IndexOutOfBoundsException();
    }
    public Iterator<Double> iterator() {
        iteratorCount++;
        if (iteratorCount == 1) {
            return new Iterator<Double>() {
                boolean done = false;
                public boolean hasNext() {
                    return !done;
                }
                public Double next() {
                    if (!hasNext())
                        throw new NoSuchElementException();
                    done = true;
                    return 10.0;
                }
            };
        } else {
            return new Iterator<Double>() {
                int pos = 0;
                public boolean hasNext() {
                    return pos < 2;
                }
                public Double next() {
                    if (!hasNext())
                        throw new NoSuchElementException();
                    return get(pos++);
                }
            };
        }
    }
};
mean_absolute_deviation(customList);
```