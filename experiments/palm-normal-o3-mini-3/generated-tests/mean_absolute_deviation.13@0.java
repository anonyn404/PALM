```java
public static void main(String args[]) {
    List<Double> list = new AbstractList<Double>() {
        int iterCount = 0;
        @Override
        public Iterator<Double> iterator() {
            iterCount++;
            if (iterCount == 1) {
                return Arrays.asList(1.0, 2.0).iterator();
            } else {
                return Collections.emptyIterator();
            }
        }
        @Override
        public Double get(int index) {
            if (index == 0) {
                return 1.0;
            } else if (index == 1) {
                return 2.0;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        @Override
        public int size() {
            return 2;
        }
    };
    mean_absolute_deviation(list);
}
```