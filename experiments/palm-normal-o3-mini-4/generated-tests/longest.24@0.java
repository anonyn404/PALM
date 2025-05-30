```java
List<String> customList = new ArrayList<String>() {
    boolean firstCall = true;
    @Override
    public Iterator<String> iterator() {
        if (firstCall) {
            firstCall = false;
            return new Iterator<String>() {
                boolean used = false;
                @Override
                public boolean hasNext() {
                    return !used;
                }
                @Override
                public String next() {
                    used = true;
                    return "a";
                }
            };
        } else {
            return Collections.emptyIterator();
        }
    }
};

longest(customList);
```