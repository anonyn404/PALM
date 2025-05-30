```java
List<String> strings = new AbstractList<String>() {
    private int calls = 0;
    public Iterator<String> iterator() {
        calls++;
        if (calls == 1) return super.iterator();
        else return Collections.<String>emptyList().iterator();
    }
    public String get(int index) { return ""; }
    public int size() { return 2; }
};
longest(strings);
```