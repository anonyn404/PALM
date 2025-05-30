```java
public static void main(String args[]) {
    java.util.List<Double> customList = new java.util.AbstractList<Double>() {
        int callCount = 0;
        public Double get(int index) {
            if(index != 0) throw new IndexOutOfBoundsException();
            return 5.0;
        }
        public int size() {
            return 1;
        }
        public java.util.Iterator<Double> iterator() {
            if(callCount == 0) {
                callCount++;
                return new java.util.Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new java.util.NoSuchElementException(); }
                };
            } else {
                callCount++;
                return new java.util.Iterator<Double>() {
                    boolean returned = false;
                    public boolean hasNext() { return !returned; }
                    public Double next() {
                        if(returned) throw new java.util.NoSuchElementException();
                        returned = true;
                        return 5.0;
                    }
                };
            }
        }
    };
    mean_absolute_deviation(customList);
}
```