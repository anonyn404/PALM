```java
List<String> list = new ArrayList<String>() {
    int counter = 0;
    @Override
    public Iterator<String> iterator() {
        if (counter++ == 0) {
            return Collections.emptyIterator();
        }
        return Collections.singleton("a").iterator();
    }
};
longest(list);
```