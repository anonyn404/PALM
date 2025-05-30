```java
List<Integer> l = new List<Integer>() {
    public Integer get(int index) { return 1; }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            boolean first = true;
            public boolean hasNext() { return first; }
            public Integer next() { first = false; return 2; }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    public int size() { return 1; }
    public boolean isEmpty() { return false; }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(Integer e) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends Integer> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends Integer> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public Integer set(int index, Integer element) { throw new UnsupportedOperationException(); }
    public void add(int index, Integer element) { throw new UnsupportedOperationException(); }
    public Integer remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<Integer> listIterator() { throw new UnsupportedOperationException(); }
    public ListIterator<Integer> listIterator(int index) { throw new UnsupportedOperationException(); }
    public List<Integer> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
max_element(l);
```