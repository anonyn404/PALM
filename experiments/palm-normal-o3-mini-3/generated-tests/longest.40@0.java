```java
List<String> lst = new AbstractList<String>() {
    int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if(callCount == 1) {
            return Arrays.asList("", "a").iterator();
        } else {
            return Collections.emptyIterator();
        }
    }
    @Override
    public int size() {
        return 2;
    }
    @Override
    public String get(int index) {
        if(index == 0) return "";
        if(index == 1) return "a";
        throw new IndexOutOfBoundsException();
    }
};
longest(lst);
```