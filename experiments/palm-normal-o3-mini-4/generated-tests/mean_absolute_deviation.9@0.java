```java
public static void main(String args[]) { 
    List<Double> customList = new List<Double>() {
        private boolean firstIterator = true;
        private final Double element = 1.0;
        public Iterator<Double> iterator() {
            if (firstIterator) {
                firstIterator = false;
                return new Iterator<Double>() {
                    private boolean returned = false;
                    public boolean hasNext() {
                        return !returned;
                    }
                    public Double next() {
                        if (!returned) { 
                            returned = true; 
                            return element; 
                        }
                        throw new NoSuchElementException();
                    }
                    public void remove() { throw new UnsupportedOperationException(); }
                };
            } else {
                return new Iterator<Double>() {
                    public boolean hasNext() { return false; }
                    public Double next() { throw new NoSuchElementException(); }
                    public void remove() { throw new UnsupportedOperationException(); }
                };
            }
        }
        public int size() { return 1; }
        public boolean isEmpty() { throw new UnsupportedOperationException(); }
        public boolean contains(Object o) { throw new UnsupportedOperationException(); }
        public Object[] toArray() { throw new UnsupportedOperationException(); }
        public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
        public boolean add(Double e) { throw new UnsupportedOperationException(); }
        public boolean remove(Object o) { throw new UnsupportedOperationException(); }
        public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(Collection<? extends Double> c) { throw new UnsupportedOperationException(); }
        public boolean addAll(int index, Collection<? extends Double> c) { throw new UnsupportedOperationException(); }
        public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        public void clear() { throw new UnsupportedOperationException(); }
        public Double get(int index) { throw new UnsupportedOperationException(); }
        public Double set(int index, Double element) { throw new UnsupportedOperationException(); }
        public void add(int index, Double element) { throw new UnsupportedOperationException(); }
        public Double remove(int index) { throw new UnsupportedOperationException(); }
        public int indexOf(Object o) { throw new UnsupportedOperationException(); }
        public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
        public ListIterator<Double> listIterator() { throw new UnsupportedOperationException(); }
        public ListIterator<Double> listIterator(int index) { throw new UnsupportedOperationException(); }
        public List<Double> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    };
    mean_absolute_deviation(customList);
}
```