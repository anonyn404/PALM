```java
List<String> custom = new List<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return new Iterator<String>() {
                boolean done = false;
                @Override
                public boolean hasNext() {
                    return !done;
                }
                @Override
                public String next() {
                    done = true;
                    return "";
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else if(callCount == 2) {
            return new Iterator<String>() {
                int index = 0;
                final String[] elems = {"a", "b"};
                @Override
                public boolean hasNext() {
                    return index < elems.length;
                }
                @Override
                public String next() {
                    return elems[index++];
                }
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            return java.util.Collections.emptyIterator();
        }
    }
    @Override public int size() { throw new UnsupportedOperationException(); }
    @Override public boolean isEmpty() { throw new UnsupportedOperationException(); }
    @Override public boolean contains(Object o) { throw new UnsupportedOperationException(); }
    @Override public Object[] toArray() { throw new UnsupportedOperationException(); }
    @Override public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
    @Override public boolean add(String e) { throw new UnsupportedOperationException(); }
    @Override public boolean remove(Object o) { throw new UnsupportedOperationException(); }
    @Override public boolean containsAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public boolean addAll(java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    @Override public boolean addAll(int index, java.util.Collection<? extends String> c) { throw new UnsupportedOperationException(); }
    @Override public boolean removeAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public boolean retainAll(java.util.Collection<?> c) { throw new UnsupportedOperationException(); }
    @Override public void clear() { throw new UnsupportedOperationException(); }
    @Override public String get(int index) { throw new UnsupportedOperationException(); }
    @Override public String set(int index, String element) { throw new UnsupportedOperationException(); }
    @Override public void add(int index, String element) { throw new UnsupportedOperationException(); }
    @Override public String remove(int index) { throw new UnsupportedOperationException(); }
    @Override public int indexOf(Object o) { throw new UnsupportedOperationException(); }
    @Override public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
    @Override public java.util.ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
    @Override public java.util.ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
    @Override public java.util.List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    @Override public boolean equals(Object o) { return this == o; }
    @Override public int hashCode() { return System.identityHashCode(this); }
};
longest(custom);
```