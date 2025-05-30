```java
List<Integer> special = new java.util.AbstractList<Integer>() {
    private int iterCallCount = 0;
    @Override
    public java.util.Iterator<Integer> iterator() {
        iterCallCount++;
        if(iterCallCount == 1) {
            return new java.util.Iterator<Integer>() {
                public boolean hasNext() { return false; }
                public Integer next() { throw new java.util.NoSuchElementException(); }
            };
        } else {
            return new java.util.Iterator<Integer>() {
                private boolean returned = false;
                public boolean hasNext() { return !returned; }
                public Integer next() { returned = true; return 42; }
            };
        }
    }
    @Override
    public Integer get(int index) { return null; }
    @Override
    public int size() { return 0; }
};
remove_duplicates(special);
```