```java
public static void main(String args[]) {
    List<Double> list = new AbstractList<Double>() {
        int sizeCallCount = 0;
        public Double get(int index) {
            if(index == 0) return 0.0;
            if(index == 1) return 5.0;
            if(index == 2) return 10.0;
            throw new IndexOutOfBoundsException();
        }
        public int size() {
            sizeCallCount++;
            if(sizeCallCount < 6) return 3;
            else return 2;
        }
    };
    double threshold = 2.0;
    has_close_elements(list, threshold);
}
```