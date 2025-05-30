```java
List<Double> customList = new List<Double>() {
    int iterCount = 0;
    @Override
    public Iterator<Double> iterator() {
        if (iterCount == 0) {
            iterCount++;
            return new Iterator<Double>() {
                int count = 0;
                @Override
                public boolean hasNext() { return count < 2; }
                @Override
                public Double next() { count++; return 1.0; }
            };
        } else if (iterCount == 1) {
            iterCount++;
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() { return false; }
                @Override
                public Double next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Double>() {
                @Override
                public boolean hasNext() { return false; }
                @Override
                public Double next() { throw new NoSuchElementException(); }
            };
        }
    }
    @Override public int size() { return 2; }
    @Override public boolean isEmpty() { return false; }
    @Override public boolean contains(Object o) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a) { return a; }
    @Override public boolean add(Double e) { return false; }
    @Override public boolean remove(Object o) { return false; }
    @Override public boolean containsAll(Collection<?> c) { return false; }
    @Override public boolean addAll(Collection<? extends Double> c) { return false; }
    @Override public boolean addAll(int index, Collection<? extends Double> c) { return false; }
    @Override public boolean removeAll(Collection<?> c) { return false; }
    @Override public boolean retainAll(Collection<?> c) { return false; }
    @Override public void clear() { }
    @Override public Double get(int index) { return 1.0; }
    @Override public Double set(int index, Double element) { return 1.0; }
    @Override public void add(int index, Double element) { }
    @Override public Double remove(int index) { return 1.0; }
    @Override public int indexOf(Object o) { return 0; }
    @Override public int lastIndexOf(Object o) { return 0; }
    @Override public ListIterator<Double> listIterator() { return null; }
    @Override public ListIterator<Double> listIterator(int index) { return null; }
    @Override public List<Double> subList(int fromIndex, int toIndex) { return null; }
};
mean_absolute_deviation(customList);
```