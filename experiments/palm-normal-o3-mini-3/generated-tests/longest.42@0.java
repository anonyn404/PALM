```java
List<String> list = new ArrayList<String>() {
    int call = 0;
    @Override
    public Iterator<String> iterator() {
        call++;
        if (call == 1) {
            return Collections.singletonList("a").iterator();
        } else {
            return Collections.singletonList("bb").iterator();
        }
    }
};
longest(list);
```