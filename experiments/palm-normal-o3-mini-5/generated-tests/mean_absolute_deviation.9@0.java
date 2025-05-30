```java
public static void main(String args[]) {
    List<Double> customList = new AbstractList<Double>() {
        private int iteratorCallCount = 0;
        @Override
        public Iterator<Double> iterator() {
            iteratorCallCount++;
            if (iteratorCallCount == 1) {
                return new Iterator<Double>() {
                    private boolean hasNextVal = true;
                    public boolean hasNext() {
                        return hasNextVal;
                    }
                    public Double next() {
                        hasNextVal = false;
                        return 1.0;
                    }
                };
            } else {
                return new Iterator<Double>() {
                    public boolean hasNext() {
                        return false;
                    }
                    public Double next() {
                        throw new NoSuchElementException();
                    }
                };
            }
        }
        @Override
        public Double get(int index) {
            if (index == 0) return 1.0;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 1;
        }
    };
    mean_absolute_deviation(customList);
}
```