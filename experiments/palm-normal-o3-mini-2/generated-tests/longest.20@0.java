```java
public static void main(String args[]) {
    List<String> list = new AbstractList<String>() {
        boolean firstCall = true;
        @Override
        public Iterator<String> iterator() {
            if(firstCall) {
                firstCall = false;
                return Collections.emptyIterator();
            } else {
                return new Iterator<String>() {
                    boolean available = true;
                    @Override
                    public boolean hasNext() { return available; }
                    @Override
                    public String next() {
                        if (!available) throw new NoSuchElementException();
                        available = false;
                        return "non-empty";
                    }
                };
            }
        }
        @Override
        public int size() { return 1; }
        @Override
        public String get(int index) { 
            if(index == 0) return "non-empty";
            throw new IndexOutOfBoundsException();
        }
    };
    longest(list);
}
```