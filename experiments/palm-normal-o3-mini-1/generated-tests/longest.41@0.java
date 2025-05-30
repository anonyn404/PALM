```java
List<String> list = new ArrayList<String>() {
    boolean firstIteratorUsed = false;
    @Override
    public Iterator<String> iterator() {
        if (!firstIteratorUsed) {
            firstIteratorUsed = true;
            return super.iterator();
        }
        return java.util.Collections.emptyIterator();
    }
};
list.add("aa");
list.add("a");
longest(list);
```