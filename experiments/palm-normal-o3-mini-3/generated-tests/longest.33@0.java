```java
List<String> customList = new ArrayList<String>() {
    boolean firstCall = true;
    
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return Arrays.asList("", "").iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
};
longest(customList);
```