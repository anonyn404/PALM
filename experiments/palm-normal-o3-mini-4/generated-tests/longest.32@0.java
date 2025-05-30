```java
List<String> lst = new AbstractList<String>() {
    private int callCount = 0;
    @Override
    public Iterator<String> iterator() {
        callCount++;
        if (callCount == 1) {
            return Collections.singletonList("").iterator();
        } else {
            return Arrays.asList("a", "b").iterator();
        }
    }
    @Override
    public String get(int index) {
        if (index == 0) {
            return "";
        }
        return "a";
    }
    @Override
    public int size() {
        return 2;
    }
};
longest(lst);
```