```java
public static void main(String args[]) {
    longest(new java.util.AbstractList<String>() {
        int iteratorCallCount = 0;
        @Override
        public java.util.Iterator<String> iterator() {
            iteratorCallCount++;
            if (iteratorCallCount == 1) {
                return new java.util.Iterator<String>() {
                    boolean delivered = false;
                    public boolean hasNext() { return !delivered; }
                    public String next() {
                        if (!delivered) { 
                            delivered = true; 
                            return ""; 
                        }
                        throw new java.util.NoSuchElementException();
                    }
                };
            } else if (iteratorCallCount == 2) {
                return new java.util.Iterator<String>() {
                    boolean delivered = false;
                    public boolean hasNext() { return !delivered; }
                    public String next() {
                        if (!delivered) { 
                            delivered = true; 
                            return "nonempty"; 
                        }
                        throw new java.util.NoSuchElementException();
                    }
                };
            } else {
                return java.util.Collections.emptyIterator();
            }
        }
        @Override
        public String get(int index) {
            throw new UnsupportedOperationException();
        }
        @Override
        public int size() {
            return 1;
        }
    });
}
```