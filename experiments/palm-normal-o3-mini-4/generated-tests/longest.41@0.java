```java
List<String> customList = new List<String>() {
    boolean used = false;
    public Iterator<String> iterator() {
        if (!used) {
            used = true;
            return new Iterator<String>() {
                int index = 0;
                public boolean hasNext() {
                    return index < 2;
                }
                public String next() {
                    if (index == 0) {
                        index++;
                        return "a";
                    } else if (index == 1) {
                        index++;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
    public int size() { return 2; }
    public boolean isEmpty() { return false; }
    public boolean contains(Object o) { return false; }
    public Object[] toArray() { return new Object[0]; }
    public <T> T[] toArray(T[] a) { return a; }
    public boolean add(String s) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public void clear() { throw new UnsupportedOperationException(); }
    public String get(int index) { return "a"; }
    public String set(int index, String element) { throw new UnsupportedOperationException(); }
    public void add(int index, String element) { throw new UnsupportedOperationException(); }
    public String remove(int index) { throw new UnsupportedOperationException(); }
    public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    public ListIterator<String> listIterator() { return Collections.emptyListIterator(); }
    public ListIterator<String> listIterator(int index) { return Collections.emptyListIterator(); }
    public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
};
longest(customList);
```