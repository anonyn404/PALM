```java
List<String> custom = new List<String>() {
    int iterCall = 0;
    public Iterator<String> iterator() {
        iterCall++;
        if(iterCall == 1){
            return new Iterator<String>() {
                boolean hasElem = true;
                public boolean hasNext() { return hasElem; }
                public String next() {
                    if(hasElem) {
                        hasElem = false;
                        return "a";
                    }
                    throw new NoSuchElementException();
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else if(iterCall == 2){
            return new Iterator<String>() {
                int index = 0;
                String[] elems = new String[] {"bb", "cc"};
                public boolean hasNext() { return index < elems.length; }
                public String next() {
                    if(index < elems.length) {
                        return elems[index++];
                    }
                    throw new NoSuchElementException();
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
        return Collections.emptyIterator();
    }
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean contains(Object o) { return false; }
    public Object[] toArray() { return new Object[0]; }
    public <T> T[] toArray(T[] a) { return a; }
    public boolean add(String e) { return false; }
    public boolean remove(Object o) { return false; }
    public boolean containsAll(Collection<?> c) { return false; }
    public boolean addAll(Collection<? extends String> c) { return false; }
    public boolean addAll(int index, Collection<? extends String> c) { return false; }
    public boolean removeAll(Collection<?> c) { return false; }
    public boolean retainAll(Collection<?> c) { return false; }
    public void clear() { }
    public String get(int index) { return null; }
    public String set(int index, String element) { return null; }
    public void add(int index, String element) { }
    public String remove(int index) { return null; }
    public int indexOf(Object o) { return -1; }
    public int lastIndexOf(Object o) { return -1; }
    public ListIterator<String> listIterator() { return null; }
    public ListIterator<String> listIterator(int index) { return null; }
    public List<String> subList(int fromIndex, int toIndex) { return null; }
};
longest(custom);
```