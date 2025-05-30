```java
List<String> strings = new ArrayList<String>() {
    boolean used = false;
    @Override
    public Iterator<String> iterator() {
        if (!used) {
            used = true;
            return Arrays.asList("a", "aa").iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
};
longest(strings);
```