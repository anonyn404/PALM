```java
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return new Iterator<String>() {
                public boolean hasNext() { return false; }
                public String next() { throw new NoSuchElementException(); }
            };
        } else {
            return new Iterator<String>() {
                boolean consumed = false;
                public boolean hasNext() { return !consumed; }
                public String next() {
                    if (consumed) throw new NoSuchElementException();
                    consumed = true;
                    return "a";
                }
            };
        }
    }
    public String get(int index) { return "a"; }
    public int size() { return 1; }
};
longest(customList);
```