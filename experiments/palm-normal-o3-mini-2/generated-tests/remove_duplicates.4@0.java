```java
List<Integer> custom = new AbstractList<Integer>() {
    int callCount = 0;
    @Override
    public Iterator<Integer> iterator() {
        callCount++;
        if(callCount == 1) {
            return new Iterator<Integer>() {
                public boolean hasNext() { return false; }
                public Integer next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<Integer>() {
                boolean first = true;
                public boolean hasNext() { return first; }
                public Integer next() { 
                    if(first) {
                        first = false;
                        return 1;
                    }
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override
    public int size() {
        return 0;
    }
    @Override
    public Integer get(int index) {
        throw new IndexOutOfBoundsException();
    }
};

remove_duplicates(custom);
```