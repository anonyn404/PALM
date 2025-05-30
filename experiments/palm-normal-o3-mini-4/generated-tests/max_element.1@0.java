```java
List<Integer> list = new ArrayList<Integer>() {
    @Override
    public Iterator<Integer> iterator() {
        return Collections.emptyIterator();
    }
};
list.add(42);
max_element(list);
```