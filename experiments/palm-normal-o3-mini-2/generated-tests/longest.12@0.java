```java
List<String> custom = new ArrayList<String>() {
    private int iterCount = 0;
    @Override
    public Iterator<String> iterator() {
        iterCount++;
        if (iterCount == 1) {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        } else {
            return new Iterator<String>() {
                private boolean delivered = false;
                public boolean hasNext() { return !delivered; }
                public String next() {
                    if (delivered) throw new NoSuchElementException();
                    delivered = true;
                    return "a";
                }
                public void remove() { throw new UnsupportedOperationException(); }
            };
        }
    }
};
longest(custom);
```