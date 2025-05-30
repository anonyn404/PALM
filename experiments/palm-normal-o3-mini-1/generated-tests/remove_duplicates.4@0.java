```java
List<Integer> customList = new ArrayList<Integer>() {
    int counter = 0;
    @Override
    public Iterator<Integer> iterator() {
        counter++;
        if (counter == 1) {
            return new Iterator<Integer>() {
                public boolean hasNext() { return false; }
                public Integer next() { return 0; }
            };
        } else {
            return new Iterator<Integer>() {
                public boolean hasNext() { return true; }
                public Integer next() { return 1; }
            };
        }
    }
};
remove_duplicates(customList);
```