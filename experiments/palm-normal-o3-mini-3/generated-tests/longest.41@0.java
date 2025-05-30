```java
List<String> list = new List<String>() {
    boolean firstCall = true;
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return new Iterator<String>() {
                String[] elems = {"ab", "a"};
                int index = 0;
                public boolean hasNext() {
                    return index < elems.length;
                }
                public String next() {
                    return elems[index++];
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return new Iterator<String>() {
                public boolean hasNext() {
                    return false;
                }
                public String next() {
                    throw new NoSuchElementException();
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }
    public int size() { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(String e) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { throw new UnsupportedOperationException(); }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(list);
```