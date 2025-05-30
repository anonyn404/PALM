```java
List<Integer> customList = new ArrayList<Integer>() {
    private boolean firstCall = true;
    @Override
    public Iterator<Integer> iterator() {
        if (firstCall) {
            firstCall = false;
            return Collections.emptyIterator();
        }
        return Arrays.asList(1).iterator();
    }
};
remove_duplicates(customList);
```