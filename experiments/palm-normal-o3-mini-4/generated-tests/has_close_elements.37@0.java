```java
public static void main(String args[]) {
    List<Double> numbers = new AbstractList<Double>() {
        private final double[] arr = {0.0, 2.0, 5.0};
        private int callCount = 0;
        @Override
        public Double get(int index) {
            return arr[index];
        }
        @Override
        public int size() {
            callCount++;
            if(callCount <= 4) {
                return 3;
            } else {
                return 2;
            }
        }
    };
    has_close_elements(numbers, 2.0);
}
```