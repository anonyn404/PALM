```java
List<String> list = new AbstractList<String>() {
    int count = 0;
    @Override
    public Iterator<String> iterator() {
        count++;
        if(count == 1) {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<String>() {
                boolean used = false;
                public boolean hasNext() { return !used; }
                public String next() {
                    if(!used) { used = true; return ""; }
                    throw new NoSuchElementException();
                }
            };
        }
    }
    @Override public int size() { return count >= 2 ? 1 : 0; }
    @Override public String get(int index) { throw new UnsupportedOperationException(); }
};
longest(list);
```