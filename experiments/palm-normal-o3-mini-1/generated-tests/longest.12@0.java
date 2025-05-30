```java
List<String> list = new ArrayList<String>() {
    int count = 0;
    @Override
    public Iterator<String> iterator() {
        if(count++ == 0) {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public String next() {
                    throw new NoSuchElementException();
                }
            };
        } else {
            return Arrays.asList("a").iterator();
        }
    }
};
longest(list);
```