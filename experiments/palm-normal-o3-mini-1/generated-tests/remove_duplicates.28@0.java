```java
List<Integer> customList = new java.util.AbstractList<Integer>() {
    boolean firstIterator = true;
    @Override
    public Iterator<Integer> iterator() {
        if (firstIterator) {
            firstIterator = false;
            return new Iterator<Integer>() {
                boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Integer next() { 
                    if (!returned) { 
                        returned = true; 
                        return 1; 
                    }
                    throw new java.util.NoSuchElementException();
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
    public Integer get(int index) {
        if (index == 0)
            return 1;
        throw new IndexOutOfBoundsException();
    }
    @Override
    public int size() {
        return 1;
    }
};
remove_duplicates(customList);
```