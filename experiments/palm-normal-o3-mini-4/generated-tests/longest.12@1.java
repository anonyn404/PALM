```java
List<String> list = new AbstractList<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return Collections.emptyIterator();
        } else {
            return Collections.singletonIterator("a");
        }
    }
    public String get(int index) {
        return "a";
    }
    public int size() {
        return 1;
    }
};
longest(list);
```