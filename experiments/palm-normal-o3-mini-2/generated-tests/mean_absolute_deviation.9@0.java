```java
public static void main(String args[]) {
    List<Double> numbers = new AbstractList<Double>() {
        int iterCount = 0;
        public int size() {
            return 1;
        }
        public Double get(int index) {
            return 1.0;
        }
        public Iterator<Double> iterator() {
            iterCount++;
            if (iterCount == 1) {
                return new Iterator<Double>() {
                    boolean has = true;
                    public boolean hasNext() {
                        return has;
                    }
                    public Double next() {
                        if (has) {
                            has = false;
                            return 1.0;
                        }
                        throw new NoSuchElementException();
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
    };
    mean_absolute_deviation(numbers);
}
```