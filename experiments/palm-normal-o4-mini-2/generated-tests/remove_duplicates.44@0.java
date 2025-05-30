```java
java.util.List<Integer> numbers = new java.util.AbstractList<Integer>() {
    int iterCount = 0;
    public java.util.Iterator<Integer> iterator() {
        iterCount++;
        if (iterCount == 1) {
            return new java.util.Iterator<Integer>() {
                boolean done = false;
                public boolean hasNext() { return !done; }
                public Integer next() { done = true; return 1; }
                public void remove() { }
            };
        } else {
            return new java.util.Iterator<Integer>() {
                int count = 0;
                public boolean hasNext() { return count < 2; }
                public Integer next() { count++; return 1; }
                public void remove() { }
            };
        }
    }
    public Integer get(int index) { throw new IndexOutOfBoundsException(); }
    public int size() { return 0; }
};
remove_duplicates(numbers);
```