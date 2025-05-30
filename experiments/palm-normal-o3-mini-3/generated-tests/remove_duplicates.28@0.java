```java
public static void main(String args[]) { 
    List<Integer> customList = new ArrayList<Integer>() {
        private boolean firstIteratorCalled = false;
        @Override
        public Iterator<Integer> iterator() {
            if (!firstIteratorCalled) {
                firstIteratorCalled = true;
                return new Iterator<Integer>() {
                    private boolean hasReturned = false;
                    public boolean hasNext() { return !hasReturned; }
                    public Integer next() { 
                        if (hasReturned) throw new java.util.NoSuchElementException();
                        hasReturned = true; 
                        return 1; 
                    }
                };
            } else {
                return new Iterator<Integer>() {
                    public boolean hasNext() { return false; }
                    public Integer next() { throw new java.util.NoSuchElementException(); }
                };
            }
        }
        @Override
        public int size() {
            return 1;
        }
        @Override
        public Integer get(int index) {
            if (index == 0) return 1;
            throw new IndexOutOfBoundsException();
        }
    };
    remove_duplicates(customList);
}
```