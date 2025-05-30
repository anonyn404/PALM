```java
List<String> list = new ArrayList<String>() {
    boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return Collections.singletonList("a").iterator();
        } else {
            return Arrays.asList("aa", "b").iterator();
        }
    }
};
longest(list);
```