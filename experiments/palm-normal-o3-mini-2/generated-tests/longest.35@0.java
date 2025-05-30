```java
public static void main(String args[]) {
    List<String> l = new AbstractList<String>() {
        int iterCount = 0;
        public Iterator<String> iterator() {
            if (iterCount++ == 0) {
                return new Iterator<String>() {
                    public boolean hasNext() { return false; }
                    public String next() { throw new NoSuchElementException(); }
                };
            } else {
                return new Iterator<String>() {
                    int count = 0;
                    public boolean hasNext() { return count < 2; }
                    public String next() {
                        if (count == 0) { count++; return "a"; }
                        else if (count == 1) { count++; return "b"; }
                        else { throw new NoSuchElementException(); }
                    }
                };
            }
        }
        public String get(int index) { throw new UnsupportedOperationException(); }
        public int size() { throw new UnsupportedOperationException(); }
    };
    longest(l);
}
```