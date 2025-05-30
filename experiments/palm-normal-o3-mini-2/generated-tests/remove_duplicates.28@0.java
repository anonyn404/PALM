```java
List<Integer> customList = new ArrayList<Integer>() {
    boolean firstCall = true;
    @Override
    public Iterator<Integer> iterator() {
        if (firstCall) {
            firstCall = false;
            return new Iterator<Integer>() {
                boolean available = true;
                @Override
                public boolean hasNext() {
                    return available;
                }
                @Override
                public Integer next() {
                    if (!available) throw new NoSuchElementException();
                    available = false;
                    return 1;
                }
            };
        } else {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                @Override
                public Integer next() {
                    throw new NoSuchElementException();
                }
            };
        }
    }
};
customList.add(1);
remove_duplicates(customList);
```