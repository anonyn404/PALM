```java
List<Integer> l = new ArrayList<Integer>(Arrays.asList(3)) {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int count = 0;
            public boolean hasNext() { return count < 2; }
            public Integer next() {
                if(count == 0) { count++; return 4; }
                if(count == 1) { count++; return 0; }
                throw new NoSuchElementException();
            }
        };
    }
};
max_element(l);
```