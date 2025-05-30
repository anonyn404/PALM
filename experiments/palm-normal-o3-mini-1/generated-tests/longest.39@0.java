```java
public static void main(String args[]) {
    List<String> list = new List<String>() {
        int callCount = 0;
        @Override
        public Iterator<String> iterator() {
            callCount++;
            if(callCount == 1) {
                return new Iterator<String>() {
                    int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 1;
                    }
                    @Override
                    public String next() {
                        index++;
                        return "b";
                    }
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            } else if(callCount == 2) {
                return new Iterator<String>() {
                    int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public String next() {
                        if(index == 0) {
                            index++;
                            return "zz";
                        } else {
                            index++;
                            return "anything";
                        }
                    }
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            } else {
                return new Iterator<String>() {
                    int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public String next() {
                        if(index == 0) {
                            index++;
                            return "zz";
                        } else {
                            index++;
                            return "anything";
                        }
                    }
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        }
        @Override public int size() { throw new UnsupportedOperationException(); }
        @Override public boolean isEmpty() { throw new UnsupportedOperationException(); }
        @Override public boolean contains(Object o) { throw new UnsupportedOperationException(); }
        @Override public Object[] toArray() { throw new UnsupportedOperationException(); }
        @Override public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
        @Override public boolean add(String e) { throw new UnsupportedOperationException(); }
        @Override public boolean remove(Object o) { throw new UnsupportedOperationException(); }
        @Override public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        @Override public boolean addAll(Collection<? extends String> c) { throw new UnsupportedOperationException(); }
        @Override public boolean addAll(int index, Collection<? extends String> c) { throw new UnsupportedOperationException(); }
        @Override public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        @Override public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
        @Override public void clear() { throw new UnsupportedOperationException(); }
        @Override public String get(int index) { throw new UnsupportedOperationException(); }
        @Override public String set(int index, String element) { throw new UnsupportedOperationException(); }
        @Override public void add(int index, String element) { throw new UnsupportedOperationException(); }
        @Override public String remove(int index) { throw new UnsupportedOperationException(); }
        @Override public int indexOf(Object o) { throw new UnsupportedOperationException(); }
        @Override public int lastIndexOf(Object o) { throw new UnsupportedOperationException(); }
        @Override public ListIterator<String> listIterator() { throw new UnsupportedOperationException(); }
        @Override public ListIterator<String> listIterator(int index) { throw new UnsupportedOperationException(); }
        @Override public List<String> subList(int fromIndex, int toIndex) { throw new UnsupportedOperationException(); }
    };
    longest(list);
}
```