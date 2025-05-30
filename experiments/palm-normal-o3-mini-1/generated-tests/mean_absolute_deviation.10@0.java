```java
public static void main(String args[]) { 
    List<Double> numbers = new java.util.AbstractList<Double>() {
        int callCount = 0;
        public Double get(int index) {
            if(index == 0) return 5.0;
            throw new IndexOutOfBoundsException();
        }
        public int size() {
            return 1;
        }
        public Iterator<Double> iterator() {
            callCount++;
            if(callCount == 1) {
                return new Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new java.util.NoSuchElementException(); }
                };
            } else {
                return new Iterator<Double>() {
                    boolean returned = false;
                    public boolean hasNext() { return !returned; }
                    public Double next() {
                        if(returned) throw new java.util.NoSuchElementException();
                        returned = true;
                        return get(0);
                    }
                };
            }
        }
    };
    mean_absolute_deviation(numbers);
}
```