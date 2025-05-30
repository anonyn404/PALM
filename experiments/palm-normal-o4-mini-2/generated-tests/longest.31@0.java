```java
java.util.List<String> strings = new java.util.AbstractList<String>() {
    int count = 0;
    public java.util.Iterator<String> iterator() {
        count++;
        if (count == 1) {
            return java.util.Arrays.asList("abc").iterator();
        } else {
            return java.util.Arrays.asList("").iterator();
        }
    }
    public String get(int index) { return null; }
    public int size() { return 1; }
};
longest(strings);
```