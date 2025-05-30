```java
List<String> customList = new AbstractList<String>() {
    int callCount = 0;
    public Iterator<String> iterator() {
        if (callCount++ == 0) {
            return Collections.singletonList("").iterator();
        } else {
            return Arrays.asList("a", "b").iterator();
        }
    }
    public String get(int index) {
        if (index == 0) return "";
        if (index == 1) return "a";
        throw new IndexOutOfBoundsException();
    }
    public int size() {
        return 2;
    }
};
longest(customList);
```