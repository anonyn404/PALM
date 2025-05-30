```java
public static void main(String args[]) { 
    List<Double> customList = new AbstractList<Double>() {
        int iteratorCalls = 0;
        @Override
        public Double get(int index) {
            if (index == 0) return 1.0;
            if (index == 1) return 2.0;
            throw new IndexOutOfBoundsException();
        }
        @Override
        public int size() {
            return 2;
        }
        @Override
        public Iterator<Double> iterator() {
            iteratorCalls++;
            if (iteratorCalls == 1) {
                return Arrays.asList(1.0, 2.0).iterator();
            } else if (iteratorCalls == 2) {
                return Arrays.asList(1.0).iterator();
            }
            return Collections.emptyIterator();
        }
    };
    mean_absolute_deviation(customList); 
}
```