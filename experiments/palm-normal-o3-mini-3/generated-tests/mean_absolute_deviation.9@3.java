```java
public static void main(String args[]) {
    List<Double> list = new AbstractList<Double>() {
        private int callCount = 0;
        @Override
        public Iterator<Double> iterator() {
            callCount++;
            if(callCount == 1) {
                return Collections.singletonList(1.0).iterator();
            } else {
                return Collections.emptyIterator();
            }
        }
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Double get(int index) {
            return 1.0;
        }
    };
    mean_absolute_deviation(list);
}
```