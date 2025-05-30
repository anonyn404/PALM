```java
List<Integer> customList = new AbstractList<Integer>() {
    private boolean firstCall = true;
    public Iterator<Integer> iterator() {
        if (firstCall) {
            firstCall = false;
            return Collections.emptyIterator();
        } else {
            return Collections.singleton(42).iterator();
        }
    }
    public Integer get(int index) {
        return 42;
    }
    public int size() {
        return 1;
    }
};
remove_duplicates(customList);
```