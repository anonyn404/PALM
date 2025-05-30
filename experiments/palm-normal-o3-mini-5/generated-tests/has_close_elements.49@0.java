```java
public static void main(String args[]) {
    java.util.List<Double> realList = java.util.Arrays.asList(0.0, 1.0, 2.0, 3.0);
    java.util.List<Double> numbers = new java.util.AbstractList<Double>() {
        int sizeCallCount = 0;
        @Override
        public Double get(int index) {
            return realList.get(index);
        }
        @Override
        public int size() {
            int ret = (sizeCallCount < 4) ? 3 : 4;
            sizeCallCount++;
            return ret;
        }
    };
    has_close_elements(numbers, 0.5);
}
```