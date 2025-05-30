```java
List<String> custom = new List<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        if(callCount == 0) {
            callCount++;
            return new Iterator<String>() {
                int index = 0;
                public boolean hasNext() {
                    return index < 2;
                }
                public String next() {
                    if(hasNext()){
                        index++;
                        return "";
                    }
                    throw new NoSuchElementException();
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
            };
        }
    }
    public int size() { throw new UnsupportedOperationException(); }
    public boolean isEmpty() { throw new UnsupportedOperationException(); }
    public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    public Object[] toArray() { throw new UnsupportedOperationException(); }
    public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    public boolean add(String s) { throw new UnsupportedOperationException(); }
    public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
    public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
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
longest(custom);
```